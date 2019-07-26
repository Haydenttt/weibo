package com.unicom.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.unicom.constant.UrlConst;
import com.unicom.exception.EmWeiboError;
import com.unicom.exception.WeiboException;
import com.unicom.mapper.IndexIntroMapper;
import com.unicom.mapper.IndexMonthEventAllMapper;
import com.unicom.mapper.IndexMonthEventDetailMapper;
import com.unicom.mapper.IndexStatsMapper;
import com.unicom.model.*;
import com.unicom.service.IndexService;
import com.unicom.service.vo.IndexIntroVO;
import com.unicom.service.vo.IndexMonthEventAllVO;
import com.unicom.service.vo.IndexStatsVO;
import com.unicom.util.HttpUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @program: weibo
 * @author: Hayden TONG
 * @create: 2019-07-22 08:52
 */
@Service
public class IndexServiceImpl implements IndexService {

  @Autowired IndexIntroMapper indexIntroMapper;
  @Autowired IndexStatsMapper indexStatsMapper;
  @Autowired IndexMonthEventAllMapper indexMonthEventAllMapper;
  @Autowired IndexMonthEventDetailMapper indexMonthEventDetailMapper;

  /**
   * @apiNote : indexIntro()
   * @description: 删除index_intro表历史数据
   */
  @Override
  public void deleteIndexIntro() {
    IndexIntroExample example = new IndexIntroExample();
    IndexIntroExample.Criteria criteria = example.createCriteria();
    criteria.andIdIsNotNull();
    indexIntroMapper.deleteByExample(example);
  }

  /**
   * @apiNote : indexIntro()
   * @description: 获得源数据，并插入index_intro表
   */
  @Override
  public void updateIndexIntro() {
    // 获得json
    String data = HttpUtil.sendGet(UrlConst.INDEX_UP);
    IndexIntro intro = new IndexIntro();
    try {
      // 把String转换成json
      JSONObject dataJson = JSONObject.parseObject(data);
      JSONObject contentJson = dataJson.getJSONObject("data");
      // 解析json
      intro.setDayHeatSum(contentJson.getInteger("dayHotSum"));
      intro.setDayHeatLevel(contentJson.getString("dayHotLevel"));
      // 计算7日热度均值
      int sumHeatWeek = 0;
      for (int i = 0; i <= 6; i++) {

        // TODO 时间格式尚未与前端统一
        if (i == 0) {
          intro.setDayHeatStart(
              ((JSONObject) (contentJson.getJSONArray("rankDay").get(i))).getString("time"));
        }
        if (i == 6) {
          intro.setDayHeatEnd(
              ((JSONObject) (contentJson.getJSONArray("rankDay").get(i))).getString("time"));
        }
        sumHeatWeek +=
            ((JSONObject) (contentJson.getJSONArray("rankDay").get(i))).getInteger("sumH");
      }
      intro.setDayHeatAvg(sumHeatWeek / 7);
    } catch (Exception e) {
      throw new WeiboException(
          EmWeiboError.PARAMETER_VALIDATION_ERROR.setErrMsg("indexIntro获取源数据json失败！"));
    }
    intro.setCreator(UrlConst.TLJ);
    intro.setUpdater(UrlConst.TLJ);
    // 插入数据库
    try {
      indexIntroMapper.insertSelective(intro);
    } catch (Exception e) {
      throw new WeiboException(EmWeiboError.UNKNOW_ERROR.setErrMsg("serviceImpl插入indexIntro表失败！"));
    }
  }

  /**
   * @apiNote : indexIntro()
   * @description: select数据表index_intro的所有数据
   */
  @Override
  public List<IndexIntroVO> getIndexIntro() {
    IndexIntroExample example = new IndexIntroExample();
    IndexIntroExample.Criteria criteria = example.createCriteria();
    criteria.andIdIsNotNull();
    List<IndexIntro> introList = indexIntroMapper.selectByExample(example);
    // 自生成属性转为VO格式return
    List<IndexIntroVO> indexIntroVOList = new ArrayList<>();
    for (IndexIntro indexIntro : introList) {
      IndexIntroVO indexIntroVO = new IndexIntroVO();
      BeanUtils.copyProperties(indexIntro, indexIntroVO);
      indexIntroVOList.add(indexIntroVO);
    }
    return indexIntroVOList;
  }

  /**
   * @apiNote : indexStats()
   * @description: 删除index_stats表历史数据
   */
  @Override
  public void deleteIndexStats() {
    IndexStatsExample example = new IndexStatsExample();
    IndexStatsExample.Criteria criteria = example.createCriteria();
    criteria.andIdIsNotNull();
    indexStatsMapper.deleteByExample(example);
  }

  /**
   * @apiNote : indexStats()
   * @description: 获得数据源，并插入index_stats表
   */
  @Override
  public void updateIndexStats() {
    String data = HttpUtil.sendGet(UrlConst.INDEX_UP);
    IndexStats stats = new IndexStats();
    try {
      JSONObject dataJson = JSONObject.parseObject(data);
      JSONObject contentJson = dataJson.getJSONObject("data");

      IndexStatsExample example = new IndexStatsExample();
      IndexStatsExample.Criteria criteria = example.createCriteria();
      // 将所有既存数据标记为过期数据
      criteria.andIdIsNotNull();
      stats.setIsValid((byte) 0);

      // 分日热度
      for (int i = 6; i >= 0; i--) {
        for (int j = 0; j <= 9; j++) {
          stats.setEventId(
              ((JSONObject)
                      (((JSONObject) (contentJson.getJSONArray("rankDay").get(i)))
                          .getJSONArray("info")
                          .get(j)))
                  .getString("eventId"));
          stats.setTitle(
              ((JSONObject)
                      (((JSONObject) (contentJson.getJSONArray("rankDay").get(i)))
                          .getJSONArray("info")
                          .get(j)))
                  .getString("name"));
          stats.setImg(
              UrlConst.IMG_PREFIX
                  + ((JSONObject)
                          (((JSONObject) (contentJson.getJSONArray("rankDay").get(i)))
                              .getJSONArray("info")
                              .get(j)))
                      .getString("img"));
          stats.setFirstType(
              ((JSONObject)
                      (((JSONObject) (contentJson.getJSONArray("rankDay").get(i)))
                          .getJSONArray("info")
                          .get(j)))
                  .getString("firstType"));
          stats.setSumHeat(
              ((JSONObject) (contentJson.getJSONArray("rankDay").get(i))).getInteger("sumH"));
          stats.setRankTime(
              ((JSONObject) (contentJson.getJSONArray("rankDay").get(i))).getString("time"));
          stats.setHeatExponent(
              ((JSONObject)
                      (((JSONObject) (contentJson.getJSONArray("rankDay").get(i)))
                          .getJSONArray("info")
                          .get(j)))
                  .getInteger("hE"));
          stats.setPro(
              ((JSONObject)
                      (((JSONObject) (contentJson.getJSONArray("rankDay").get(i)))
                          .getJSONArray("info")
                          .get(j)))
                  .getBigDecimal("pro"));
          stats.setCurrentRank(j + 1);
          stats.setLastRank(
              ((JSONObject)
                      (((JSONObject) (contentJson.getJSONArray("rankDay").get(i)))
                          .getJSONArray("info")
                          .get(j)))
                  .getInteger("oldPoint"));
          stats.setIsDay((byte) 1);
          stats.setIsValid((byte) 1);
          stats.setCreator(UrlConst.TLJ);
          stats.setUpdater(UrlConst.TLJ);
          indexStatsMapper.insertSelective(stats);
        }
      }

      // 分时热度（其他事件 OtherEvent不查）
      for (int i = 0; i <= 11; i++) {
        for (int j = 0; j <= 9; j++) {
          stats.setEventId(
              ((JSONObject)
                      (((JSONObject) (contentJson.getJSONArray("rankHour").get(i)))
                          .getJSONArray("info")
                          .get(j)))
                  .getString("eventId"));
          stats.setTitle(
              ((JSONObject)
                      (((JSONObject) (contentJson.getJSONArray("rankHour").get(i)))
                          .getJSONArray("info")
                          .get(j)))
                  .getString("name"));
          stats.setImg(
              UrlConst.IMG_PREFIX
                  + ((JSONObject)
                          (((JSONObject) (contentJson.getJSONArray("rankHour").get(i)))
                              .getJSONArray("info")
                              .get(j)))
                      .getString("img"));
          stats.setFirstType(
              ((JSONObject)
                      (((JSONObject) (contentJson.getJSONArray("rankHour").get(i)))
                          .getJSONArray("info")
                          .get(j)))
                  .getString("firstType"));
          stats.setSumHeat(
              ((JSONObject) (contentJson.getJSONArray("rankHour").get(i))).getInteger("sumH"));
          stats.setRankTime(
              ((JSONObject) (contentJson.getJSONArray("rankHour").get(i))).getString("time"));
          stats.setHeatExponent(
              ((JSONObject)
                      (((JSONObject) (contentJson.getJSONArray("rankHour").get(i)))
                          .getJSONArray("info")
                          .get(j)))
                  .getInteger("hE"));
          stats.setPro(
              ((JSONObject)
                      (((JSONObject) (contentJson.getJSONArray("rankHour").get(i)))
                          .getJSONArray("info")
                          .get(j)))
                  .getBigDecimal("pro"));
          stats.setCurrentRank(j + 1);
          stats.setLastRank(
              ((JSONObject)
                      (((JSONObject) (contentJson.getJSONArray("rankHour").get(i)))
                          .getJSONArray("info")
                          .get(j)))
                  .getInteger("oldPoint"));
          stats.setIsDay((byte) 0);
          stats.setIsValid((byte) 1);
          stats.setCreator(UrlConst.TLJ);
          stats.setUpdater(UrlConst.TLJ);
          indexStatsMapper.insertSelective(stats);
        }
      }
    } catch (Exception e) {
      throw new WeiboException(EmWeiboError.UNKNOW_ERROR.setErrMsg("serviceImpl向indexStats表插入失败！"));
    }
  }

  /**
   * @apiNote : indexStats()
   * @description: select数据表index_stats的所有数据,并封装成json返回
   */
  @Override
  public Map<String, Object> getIndexStats() {
    IndexStatsExample exampleDay = new IndexStatsExample();
    // index_stats表中is_day=1的全部数据
    IndexStatsExample.Criteria criteriaDay = exampleDay.createCriteria();
    criteriaDay.andIsDayEqualTo((byte) 1);
    List<IndexStats> entireDayList = indexStatsMapper.selectByExample(exampleDay);

    // index_stats表中is_day=0的全部数据
    IndexStatsExample exampleHour = new IndexStatsExample();
    IndexStatsExample.Criteria criteriaHour = exampleHour.createCriteria();
    criteriaHour.andIsDayEqualTo((byte) 0);
    List<IndexStats> entireHourList = indexStatsMapper.selectByExample(exampleHour);

    // 将entireList转为满足<IndexStatsVO>的statsVOList
    List<IndexStatsVO> statsVODayList;
    statsVODayList = do2voList(entireDayList);

    List<IndexStatsVO> statsVOHourList;
    statsVOHourList = do2voList(entireHourList);

    // 最外层data
    Map<String, Object> dataMap = new HashMap<>();
    // "rankDay"数组
    List<Map<String, Object>> rankDayList = new ArrayList<>();
    List<Map<String, Object>> rankHourList = new ArrayList<>();

    List<List<IndexStatsVO>> resultDay = averageAssign(statsVODayList, 7);
    List<List<IndexStatsVO>> resultHour = averageAssign(statsVOHourList, 12);

    toRankList(6, 9, resultDay, rankDayList);
    toRankList(11, 9, resultHour, rankHourList);

    deleteIndexIntro();
    updateIndexIntro();
    // data的最外层
    dataMap.put("dayHotSum", getIndexIntro().get(0).getDayHeatSum());
    dataMap.put("dayHotLevel", getIndexIntro().get(0).getDayHeatLevel());
    dataMap.put("dayHotAvg", getIndexIntro().get(0).getDayHeatAvg());
    dataMap.put("rankDay", rankDayList);
    dataMap.put("rankHour", rankHourList);
    return dataMap;
  }

  //  将数组n等分
  private static List<List<IndexStatsVO>> averageAssign(List<IndexStatsVO> source, int n) {
    List<List<IndexStatsVO>> result = new ArrayList<>();
    // 先计算出余数
    int remainder = source.size() % n;
    // 然后是商
    int number = source.size() / n;
    // 偏移量
    int offset = 0;
    for (int i = 0; i < n; i++) {
      List<IndexStatsVO> value;
      if (remainder > 0) {
        value = source.subList(i * number + offset, (i + 1) * number + offset + 1);
        remainder--;
        offset++;
      } else {
        value = source.subList(i * number + offset, (i + 1) * number + offset);
      }
      result.add(value);
    }
    return result;
  }

  // 将DO属性的select结果集转换为VO格式
  private static List<IndexStatsVO> do2voList(List<IndexStats> entireList) {
    List<IndexStatsVO> statsVOList = new ArrayList<>();
    for (IndexStats indexStats : entireList) {
      IndexStatsVO indexStatsVO = new IndexStatsVO();
      BeanUtils.copyProperties(indexStats, indexStatsVO);
      statsVOList.add(indexStatsVO);
    }
    return statsVOList;
  }

  private static void toRankList(
      int outer, int inner, List<List<IndexStatsVO>> result, List<Map<String, Object>> rankList) {
    for (int i = 0; i <= outer; i++) {
      // "rankDay/Hour"中info数组
      List<Map<String, Object>> rankInfoList = new ArrayList<>();
      Map<String, Object> rankMap = new HashMap<>();
      for (int j = 0; j <= inner; j++) {
        // info列表内最底层的map
        Map<String, Object> infoMap = new HashMap<>();
        // tendency: 较前一小时排名 0=下降 1=持平 2=上升
        int tendency;
        int currentRank = result.get(i).get(j).getCurrentRank();
        int lastRank = result.get(i).get(j).getLastRank();
        infoMap.put("eventId", result.get(i).get(j).getEventId());
        infoMap.put("name", result.get(i).get(j).getTitle());
        infoMap.put("img", result.get(i).get(j).getImg());
        infoMap.put("oldPoint", result.get(i).get(j).getLastRank());
        infoMap.put("pro", result.get(i).get(j).getPro());
        infoMap.put("hE", result.get(i).get(j).getHeatExponent());
        infoMap.put("rank", currentRank);
        // InfoMap = (Map<String, Object>) JSONObject.toJSON(statsVOList.get(j));
        if (currentRank < lastRank) {
          tendency = 2;
        } else if (currentRank == lastRank) {
          tendency = 1;
        } else {
          tendency = 0;
        }
        infoMap.put("tendency", tendency);
        rankInfoList.add(infoMap);
      }
      rankMap.put("info", rankInfoList);
      if (outer == 6) {
        rankMap.put("time", result.get(i).get(0).getRankTime());
      }
      if (outer == 11) {
        // 只取时间后2位的小时
        rankMap.put(
            "time",
            (result.get(i).get(0).getRankTime())
                .substring((result.get(i).get(0).getRankTime()).length() - 2));
      }
      rankMap.put("sumH", result.get(i).get(0).getSumHeat());
      rankList.add(rankMap);
    }
  }

  /**
   * @apiNote : indexMonth()
   * @description: 删除index_month_event_all表历史数据
   */
  @Override
  public void deleteIndexMonth() {
    IndexMonthEventAllExample example = new IndexMonthEventAllExample();
    IndexMonthEventAllExample.Criteria criteria = example.createCriteria();
    criteria.andIdIsNotNull();
    indexMonthEventAllMapper.deleteByExample(example);
  }

  @Override
  public void updateIndexMonth() {
    // 获得json
    String data = HttpUtil.sendGet(UrlConst.INDEX);
    IndexMonthEventAll monthEventAll = new IndexMonthEventAll();
    try {
      // 把String转换成json
      JSONObject dataJson = JSONObject.parseObject(data);
      // 获取map
      JSONArray monthJson = dataJson.getJSONArray("monthEvent");

      // 解析json
      for (Object obj : monthJson) {
        monthEventAll.setEventId(((JSONObject) obj).getString("eventId"));
        monthEventAll.setTitle(((JSONObject) obj).getString("name"));
        monthEventAll.setImg(
                UrlConst.IMG_PREFIX + ((JSONObject) obj).getString("img"));
        monthEventAll.setFirstType(((JSONObject) obj).getString("type"));
        monthEventAll.setStartTime(((JSONObject) obj).getDate("startTime"));
        monthEventAll.setInfExponent(
                ((JSONObject) obj).getBigDecimal("infExponent"));
        monthEventAll.setTags(((JSONObject) obj).getString("tags"));
        monthEventAll.setCreator(UrlConst.TLJ);
        monthEventAll.setUpdater(UrlConst.TLJ);
        indexMonthEventAllMapper.insertSelective(monthEventAll);
      }
    } catch (Exception e) {
      throw new WeiboException(
          EmWeiboError.UNKNOW_ERROR.setErrMsg("serviceImpl向index_month_event_all表插入失败！"));
    }
  }

  @Override
  public Map<String, Object> getIndexMonth() {
    IndexMonthEventAllExample example = new IndexMonthEventAllExample();
    IndexMonthEventAllExample.Criteria criteria = example.createCriteria();
    criteria.andIdIsNotNull();
    List<IndexMonthEventAll> monthList = indexMonthEventAllMapper.selectByExample(example);
    // 自生成属性转为VO格式return
    List<IndexMonthEventAllVO> monthVOList = new ArrayList<>();
    for (IndexMonthEventAll indexMonthEventAll : monthList) {
      IndexMonthEventAllVO monthVO = new IndexMonthEventAllVO();
      BeanUtils.copyProperties(indexMonthEventAll, monthVO);
      monthVOList.add(monthVO);
    }


    return null;
  }
}
