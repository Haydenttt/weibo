package com.unicom.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.unicom.mapper.*;
import com.unicom.model.*;
import com.unicom.service.PortraitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

/**
 * @program: weibo
 * @description:
 * @author: Hayden TONG
 * @create: 2019-07-22 08:52
 **/
@Service
public class PortraitServiceImpl implements PortraitService {
    @Autowired
    private PortraitSexMapper portraitSexMapper;
    @Autowired
    private PortraitProvinceMapper portraitProvinceMapper;
    @Autowired
    private PortraitTagsMapper portraitTagsMapper;
    @Autowired
    private PortraitPatternMapper portraitPatternMapper;
    @Autowired
    private PortraitActivityMapper portraitActivityMapper;

    /**
     * 人群画像 中 性别信息存储
     *
     * @param json
     * @param eventId 事件id
     */
    @Override
    public void updatePortraitSex(JSONObject json, String eventId) {
        Set<String> set = json.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            PortraitSex portraitSex = new PortraitSex();
            portraitSex.setEventId(eventId);
            String str = it.next();
            System.out.println("key:" + str + ",value:" + json.getString(str));
            if (str.contains("女")) {
                portraitSex.setSex((byte) 1);
            } else {
                portraitSex.setSex((byte) 0);
            }
            //将字符串转换为BigDecimal类型
            BigDecimal bd = new BigDecimal(json.getString(str));
            bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
            portraitSex.setPro(bd);
            portraitSex.setCreator("hxm");
            portraitSex.setUpdater("hxm");
            portraitSexMapper.insertSelective(portraitSex);
        }
    }

    /**
     * 性别信息查询
     * @param eventId
     * @return
     */
    @Override
    public List<Map<String,Object>> getSexByEventId(String eventId) {
        List<PortraitSexCopy> sexList = portraitSexMapper.getSexByEventId(eventId);
        List<Map<String,Object>> sex = new ArrayList<>();
        for (int i=0;i<sexList.size();i++){
            Map<String,Object> sexMap = new HashMap<>();
            if(sexList.get(i).getSex()==(byte)0){
                sexMap.put("name","男");
            }else {
                sexMap.put("name","女");
            }
            sexMap.put("value",sexList.get(i).getPro());
            sex.add(sexMap);
        }
        System.out.println(sex.toString());
        return sex;
    }

    /**
     * 性别信息删除
     */
    @Override
    public void deleteSex() {
        portraitSexMapper.deleteSex();
    }

    /**
     * 人群画像 中的地域分布信息
     *
     * @param json json数组格式的地域分布信息
     * @param eventId 事件id
     */
    @Override
    public void updatePortraitLocation(JSONArray json, String eventId) {
        for (int i = 0; i < json.size(); i++) {
            PortraitProvince portraitProvince = new PortraitProvince();
            String key = json.getJSONObject(i).getString("key");
            String value = json.getJSONObject(i).getString("value");
            //将字符串转换为BigDecimal类型
            BigDecimal bdValue = new BigDecimal(value);
            bdValue = bdValue.setScale(2, BigDecimal.ROUND_HALF_UP);
            portraitProvince.setEventId(eventId);
            portraitProvince.setProvince(key);
            portraitProvince.setPro(bdValue);
            portraitProvince.setCreator("hxm");
            portraitProvince.setUpdater("hxm");
            portraitProvinceMapper.insertSelective(portraitProvince);
        }
    }

    /**
     * 地域分布信息查询
     * @param eventId 事件id
     * @return
     */
    @Override
    public List<Map<String,Object>> getLocationByEventId(String eventId) {
        List<PortraitProvinceCopy> locationList = portraitProvinceMapper.getLocationByEventId(eventId);
        List<Map<String,Object>> locationMap = new ArrayList<>();
        for (int i=0;i<locationList.size();i++){
            Map<String,Object> provinceMap = new HashMap<>();
            provinceMap.put("name",locationList.get(i).getProvince());
            provinceMap.put("value",locationList.get(i).getPro());
            locationMap.add(provinceMap);
        }
        return locationMap;
    }

    /**
     * 地域分布信息删除
     */
    @Override
    public void deleteLocation() {
        portraitProvinceMapper.deleteLocation();
    }

    /**
     * 人群画像 中的标签信息
     *
     * @param json json数组格式的标签信息
     * @param eventId 事件id
     */
    @Override
    public void updatePortraitTags(JSONArray json, String eventId) {
        for (int i = 0; i < json.size(); i++) {
            PortraitTags portraitTags = new PortraitTags();
            String key = json.getJSONObject(i).getString("key");
            //String 转换成 int 类型
            String value = json.getJSONObject(i).getString("value");
            Integer num = Integer.parseInt(value);

            portraitTags.setEventId(eventId);
            portraitTags.setTag(key);
            portraitTags.setNum(num);
            portraitTags.setCreator("hxm");
            portraitTags.setUpdater("hxm");
            portraitTagsMapper.insertSelective(portraitTags);
        }
    }

    /**
     * 标签信息查询
     * @param eventId 事件id
     * @return
     */
    @Override
    public List<Map<String,Object>> getTagsByEventId(String eventId) {
        List<PortraitTagsCopy> tagsList = portraitTagsMapper.getTagsByEventId(eventId);
        List<Map<String,Object>> tagsMap = new ArrayList<>();
        for (int i=0;i<tagsList.size();i++){
            Map<String,Object> tags = new HashMap<>();
            tags.put("name",tagsList.get(i).getTag());
            tags.put("value",tagsList.get(i).getNum());
            tagsMap.add(tags);
        }
        return tagsMap;
    }

    /**
     * 标签信息删除
     */
    @Override
    public void deleteTags() {
        portraitTagsMapper.deleteTags();
    }

    /**
     * 人群画像 中的参与规律信息
     *
     * @param eventDayLine json对象格式的事件相关高影响力
     * @param allDayLine json对象格式的全局高影响力信息
     * @param eventId 事件id
     */
    @Override
    public void updatePortraitDayLine(JSONObject eventDayLine, JSONObject allDayLine, String eventId) {
        Set<String> eventDayLineSet = eventDayLine.keySet();
        Iterator<String> it = eventDayLineSet.iterator();
        while (it.hasNext()) {
            PortraitPattern portraitPattern = new PortraitPattern();
            String str = it.next();
            String webNum = eventDayLine.getString(str);
            BigDecimal bdNum = new BigDecimal(webNum);
            bdNum = bdNum.setScale(2, BigDecimal.ROUND_HALF_UP);
            portraitPattern.setEventId(eventId);
            portraitPattern.setAccountType((byte) 0);
            portraitPattern.setTime(str);
            portraitPattern.setWeboNum(bdNum);
            portraitPattern.setCreator("hxm");
            portraitPattern.setUpdater("hxm");
            portraitPatternMapper.insertSelective(portraitPattern);
        }
        Set<String> allDayLineSet = allDayLine.keySet();
        Iterator<String> itAll = allDayLineSet.iterator();
        while (itAll.hasNext()) {
            PortraitPattern portraitPattern1 = new PortraitPattern();
            String str = itAll.next();
            String webNum = allDayLine.getString(str);
            BigDecimal bdNum = new BigDecimal(webNum);
            bdNum = bdNum.setScale(2, BigDecimal.ROUND_HALF_UP);
            portraitPattern1.setEventId(eventId);
            portraitPattern1.setAccountType((byte) 1);
            portraitPattern1.setTime(str);
            portraitPattern1.setWeboNum(bdNum);
            portraitPattern1.setCreator("hxm");
            portraitPattern1.setUpdater("hxm");
            portraitPatternMapper.insertSelective(portraitPattern1);
        }
    }

    /**
     * 参与规律相关信息查询
     * @param eventId 事件id
     * @return
     */
    @Override
    public Map<String,Object> getDayLineByEventId(String eventId) {
        List<PortraitPatternCopy> dayLineList = portraitPatternMapper.getDayLineByEventId(eventId);
        List<Map<String,Object>> eventdayLineMap = new ArrayList<>();//0
        List<Map<String,Object>> alldayLineMap = new ArrayList<>();//1
        Map<String,Object> llmap = new HashMap<>();
        for (int i=0;i<dayLineList.size();i++){
            Map<String,Object> eventMap = new HashMap<>();
            Map<String,Object> allMap = new HashMap<>();
            if(dayLineList.get(i).getAccountType()==(byte)0){
                eventMap.put("name",dayLineList.get(i).getTime());
                eventMap.put("value",dayLineList.get(i).getWeboNum());
                eventdayLineMap.add(eventMap);
            }else if (dayLineList.get(i).getAccountType()==(byte)1){
                allMap.put("name",dayLineList.get(i).getTime());
                allMap.put("value",dayLineList.get(i).getWeboNum());
                alldayLineMap.add(allMap);
            }
        }
        llmap.put("eventDayLine",eventdayLineMap);
        llmap.put("allDayLine",alldayLineMap);
        return llmap;
    }

    /**
     * 参与规律信息删除
     */
    @Override
    public void deleteDayLine() {
        portraitPatternMapper.deleteDayLine();
    }

    /**
     * 人群画像 中的活跃度信息
     *
     * @param userWeibos json对象格式的活跃度信息
     * @param event json对象格式的事件相关信息
     * @param eventId 事件id
     */
    @Override
    public void updatePortraitActivity(JSONObject userWeibos, JSONObject event, String eventId) {
        String title = event.getString("name");
        Set<String> weibosSet = userWeibos.keySet();
        Iterator<String> iterator = weibosSet.iterator();
        while (iterator.hasNext()) {
            PortraitActivity portraitActivity = new PortraitActivity();
            String weibos = iterator.next();
            switch (weibos) {
                case "level1":
                    portraitActivity.setActivity((byte) 0);
                    break;
                case "level2":
                    portraitActivity.setActivity((byte) 1);
                    break;
                case "level3":
                    portraitActivity.setActivity((byte) 2);
                    break;
                case "level4":
                    portraitActivity.setActivity((byte) 3);
                    break;
                default:
                    portraitActivity.setActivity((byte) 4);
                    break;
            }
            String pro = userWeibos.getString(weibos);
            BigDecimal bdPro = new BigDecimal(pro);
            bdPro = bdPro.setScale(2, BigDecimal.ROUND_HALF_UP);
            portraitActivity.setPro(bdPro);
            portraitActivity.setEventId(eventId);
            portraitActivity.setCreator("hxm");
            portraitActivity.setUpdater("hxm");
            portraitActivity.setTitle(title);
            portraitActivityMapper.insertSelective(portraitActivity);
        }
    }

    /**
     * 活跃度信息查询
     * @param eventId 事件id
     * @return
     */
    @Override
    public List<Map<String,Object>> getActivityByEventId(String eventId) {
        List<PortraitActivityCopy> activityList = portraitActivityMapper.getActivityByEventId(eventId);
        List<Map<String,Object>> activityMap = new ArrayList<>();
        for (int i=0;i<activityList.size();i++){
            Map<String,Object> eventMap = new HashMap<>();
            eventMap.put("title",activityList.get(i).getTitle());
            switch (activityList.get(i).getActivity()){
                case 0:
                    eventMap.put("name","0-0.2");
                    eventMap.put("value",activityList.get(i).getPro());
                    break;
                case 1:
                    eventMap.put("name","0.2-0.4");
                    eventMap.put("value",activityList.get(i).getPro());
                    break;
                case 2:
                    eventMap.put("name","0.4-0.8");
                    eventMap.put("value",activityList.get(i).getPro());
                    break;
                case 3:
                    eventMap.put("name","0.8-1.5");
                    eventMap.put("value",activityList.get(i).getPro());
                    break;
                default:
                    eventMap.put("name","1.5以上");
                    eventMap.put("value",activityList.get(i).getPro());
                    break;
            }
            activityMap.add(eventMap);
        }
        return activityMap;
    }

    /**
     * 活跃度信息删除
     */
    @Override
    public void deleteActivity() {
        portraitActivityMapper.deleteActivity();
    }
}
