package com.unicom.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.unicom.constant.UrlConst;
import com.unicom.mapper.SearchNavbarMapper;
import com.unicom.mapper.SearchResultMapper;
import com.unicom.model.SearchNavbarExample;
import com.unicom.model.SearchResult;
import com.unicom.model.SearchResultExample;
import com.unicom.service.SearchService;
import com.unicom.service.vo.SearchResultVO;
import com.unicom.util.HttpUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @program: weibo
 * @description:
 * @author: Hayden TONG
 * @create: 2019-07-22 08:54
 **/
@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    SearchResultMapper searchResultMapper;
    @Autowired
    SearchNavbarMapper searchNavbarMapper;

    /**
     * @apiNote : searchResult()
     * @description: 删除search_result表历史数据
     */
    @Override
    public void deleteSearchResult(){
        SearchResultExample example = new SearchResultExample();
        SearchResultExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        searchResultMapper.deleteByExample(example);

        SearchNavbarExample searchNavbarExample = new SearchNavbarExample();
        SearchNavbarExample.Criteria criteria1 = searchNavbarExample.createCriteria();
        criteria.andIdIsNotNull();
        searchNavbarMapper.selectByExample(searchNavbarExample);
    }

    @Override
    public void updateSearchResult(String keyword, Integer page){
        String data = HttpUtil.sendPost(UrlConst.SEARCH,"name=" + keyword + "&page=" + page);

        SearchResult searchResult = new SearchResult();
        try{
            JSONObject dataJson = JSONObject.parseObject(data);
            JSONArray eventJson = dataJson.getJSONArray("events");
            for (Object o : eventJson) {
                searchResult.setEventId(((JSONObject) o).getString("id"));
                searchResult.setTitle(((JSONObject) o).getString("name"));
                searchResult.setTags(((JSONObject) o).getString("tags"));
                searchResult.setDescript(((JSONObject) o).getString("descript"));
                searchResult.setInfExponent(((JSONObject) o).getBigDecimal("infExponent"));
                searchResult.setStartTime(((JSONObject) o).getString("startTime"));
                searchResult.setFirstType(((JSONObject) o).getString("type"));
                searchResult.setMedia(((JSONObject) o).getString("importMedias"));
                searchResult.setImgUrl(UrlConst.IMG_PREFIX + ((JSONObject) o).getString("eventImgUrl"));
                searchResult.setCreator(UrlConst.TLJ);
                searchResult.setUpdater(UrlConst.TLJ);
                searchResultMapper.insertSelective(searchResult);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Map<String ,Object> getSearchResult(){
        SearchResultExample example = new SearchResultExample();
        SearchResultExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        List<SearchResult> resultList = searchResultMapper.selectByExample(example);

        List<SearchResultVO> resultVOList = new ArrayList<>();

        for (SearchResult searchResult : resultList) {
            SearchResultVO resultVO = new SearchResultVO();
            BeanUtils.copyProperties(searchResult, resultVO);
            resultVOList.add(resultVO);
        }

        Map<String ,Object> resultMap = new HashMap<>();
        Map<String ,Object> eventsMap = new LinkedHashMap<>();
        List<Map<String ,Object>> eventsList = new ArrayList<>();
        for (SearchResultVO resultVO : resultVOList) {
            eventsMap.put("eventId", resultVO.getEventId());
            eventsMap.put("firstType", resultVO.getFirstType());
            eventsMap.put("title", resultVO.getTitle());
            eventsMap.put("infExponent", resultVO.getInfExponent());
            eventsMap.put("descript", resultVO.getDescript());
            eventsMap.put("imgUrl", resultVO.getImgUrl());
            String media = resultVO.getMedia().replace("[", "").replace("]", "").replaceAll("\"","");
            eventsMap.put("media", media);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String startTime = sdf.format(Long.parseLong(resultVO.getStartTime()));
            eventsMap.put("startTime", startTime);
            eventsList.add(eventsMap);
        }
        resultMap.put("events",eventsList);
        return resultMap;
    }
}
