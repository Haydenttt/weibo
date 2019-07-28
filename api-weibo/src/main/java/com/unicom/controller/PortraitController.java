package com.unicom.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.unicom.http.ApiResult;
import com.unicom.service.PortraitService;
import com.unicom.util.CommonUtil;
import com.unicom.util.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @program: weibo
 * @description: 人群画像
 * @author: Hayden TONG
 * @create: 2019-07-22 08:47
 **/
@RestController
@RequestMapping("portrait")
public class PortraitController {
    @Autowired
    private PortraitService portraitService;
    private final static String PORTRAIT ="http://ef.zhiweidata.com/analy/draw.do";
    private final static String EVENTENTRY ="http://ef.zhiweidata.com/analy/eventAnaly.do";
    @PostMapping(value = "/getSex")
    public ApiResult portraitSex(@RequestParam Map<String, Object> maps){
        String eventId = CommonUtil.getStringFromMap(maps,"eventId");
        String param = "eventId="+eventId;
        String result = HttpUtil.sendPost(PORTRAIT,param);
        JSONObject jsonObject = JSON.parseObject(result);
        //性别信息删除
        portraitService.deleteSex();
        //性别信息存儲
        JSONObject sex = jsonObject.getJSONObject("sex");
        portraitService.updatePortraitSex(sex,eventId);
        //性別信息查詢
        List<Map<String,Object>> sexList=portraitService.getSexByEventId(eventId);
        ApiResult apiResult = ApiResult.success();
        apiResult.setData(sexList);
        return apiResult;
    }
    //地域分布
    @PostMapping(value = "/getLocation")
    public ApiResult portraitLocation(@RequestParam Map<String, Object> maps){
        String eventId = CommonUtil.getStringFromMap(maps,"eventId");
        String param = "eventId="+eventId;
        String result = HttpUtil.sendPost(PORTRAIT,param);
        JSONObject jsonObject = JSON.parseObject(result);
        //地域分布信息删除
        portraitService.deleteLocation();
        //地域分布信息存储
        JSONArray location = jsonObject.getJSONArray("location");
        portraitService.updatePortraitLocation(location,eventId);
        //地域信息查询
        List<Map<String,Object>> locationList = portraitService.getLocationByEventId(eventId);
        ApiResult apiResult = ApiResult.success();
        apiResult.setData(locationList);
        return apiResult;
    }
    //标签
    @PostMapping(value = "/getTags")
    public ApiResult portraitTags(@RequestBody Map<String, Object> maps){
        String eventId = CommonUtil.getStringFromMap(maps,"eventId");
        String param = "eventId="+eventId;
        String result = HttpUtil.sendPost(PORTRAIT,param);
        JSONObject jsonObject = JSON.parseObject(result);
        //标签信息清除
        portraitService.deleteTags();
        //标签信息存储
        JSONArray tags = jsonObject.getJSONArray("tags");
        portraitService.updatePortraitTags(tags,eventId);
        //标签信息查询
        List<Map<String,Object>> tagsList = portraitService.getTagsByEventId(eventId);
        ApiResult apiResult = ApiResult.success();
        apiResult.setData(tagsList);
        return apiResult;
    }
    //参与规律
    @PostMapping(value = "/getDayLine")
    public ApiResult portraitDayLine(@RequestParam Map<String, Object> maps){
        String eventId = CommonUtil.getStringFromMap(maps,"eventId");
        String param = "eventId="+eventId;
        String result = HttpUtil.sendPost(PORTRAIT,param);
        JSONObject jsonObject = JSON.parseObject(result);
        //参与规律数据清除
        portraitService.deleteDayLine();
        //事件相关
        JSONObject eventDayLine = jsonObject.getJSONObject("eventDayLine");
        //所有事件
        JSONObject allDayLine = jsonObject.getJSONObject("allDayLine");
        //参与规律信息存储
        portraitService.updatePortraitDayLine(eventDayLine,allDayLine,eventId);
        //参与规律信息查询
        Map<String,Object> dayLineList = portraitService.getDayLineByEventId(eventId);
        ApiResult apiResult = ApiResult.success();
        apiResult.setData(dayLineList);
        return apiResult;
    }
    //活跃度
    @PostMapping(value = "/getActivity")
    public ApiResult portraitActivity(@RequestBody Map<String, Object> maps){
        String eventId = CommonUtil.getStringFromMap(maps,"eventId");
        String param = "eventId="+eventId;
        String result = HttpUtil.sendPost(PORTRAIT,param);
        JSONObject jsonObject = JSON.parseObject(result);
        JSONObject userWeibos = jsonObject.getJSONObject("userWeibos");
        JSONObject event = jsonObject.getJSONObject("event");
        //活跃度信息清除
        portraitService.deleteActivity();
        //活跃度信息存储
        portraitService.updatePortraitActivity(userWeibos,event,eventId);
        //活跃度信息查询
        List<Map<String,Object>> activityList = portraitService.getActivityByEventId(eventId);
        ApiResult apiResult = ApiResult.success();
        apiResult.setData(activityList);
        return apiResult;
    }
    @PostMapping(value = "/portraitList")
    public ApiResult portraitList(@RequestParam Map<String, Object> maps) {
        String eventId = CommonUtil.getStringFromMap(maps,"eventId");
        String param = "eventId="+eventId;
        String result = HttpUtil.sendPost(PORTRAIT,param);
        //事件的基本信息，包含头像、主题
        String eventResult = HttpUtil.sendPost(EVENTENTRY,param);
        JSONObject jsonEvent = JSON.parseObject(eventResult);
        String title = jsonEvent.getString("name");
        String imgUrl = jsonEvent.getString("imgUrl");
        Map<String,Object> mapEvent = new HashMap<>();
        mapEvent.put("title",title);
        mapEvent.put("imgUrl",imgUrl);
        List<Map<String,Object>> listEvent = new ArrayList<>();
        listEvent.add(mapEvent);

        JSONObject jsonObject = JSON.parseObject(result);
        //1.1性别信息清除
        portraitService.deleteSex();
        //1.2性别信息存儲
        JSONObject sex = jsonObject.getJSONObject("sex");
        portraitService.updatePortraitSex(sex,eventId);
        //1.3 性别信息查询
        List<Map<String,Object>> sexList=portraitService.getSexByEventId(eventId);
        //2.1地域分布信息清除
        portraitService.deleteLocation();
        //2.2地域分布信息存储
        JSONArray location = jsonObject.getJSONArray("location");
        portraitService.updatePortraitLocation(location,eventId);
        //2.3地域信息查询
        List<Map<String,Object>> locationList = portraitService.getLocationByEventId(eventId);
        //3.1标签信息清除
        portraitService.deleteTags();
        //3.2标签信息存储
        JSONArray tags = jsonObject.getJSONArray("tags");
        portraitService.updatePortraitTags(tags,eventId);
        //3.3标签信息查询
        List<Map<String,Object>> tagsList = portraitService.getTagsByEventId(eventId);
        //4.1活跃度信息清除
        portraitService.deleteActivity();
        //4.2活跃度信息存储
        JSONObject userWeibos = jsonObject.getJSONObject("userWeibos");
        JSONObject event = jsonObject.getJSONObject("event");
        portraitService.updatePortraitActivity(userWeibos,event,eventId);
        //4.3活跃度信息查询
        List<Map<String,Object>> activityList = portraitService.getActivityByEventId(eventId);
        Map<String,Object> porList = new HashMap<>();
        porList.put("sex",sexList);
        porList.put("location",locationList);
        porList.put("tags",tagsList);
        porList.put("activity",activityList);
        porList.put("eventAnaly",listEvent);
        ApiResult apiResult = ApiResult.success();
        apiResult.setData(porList);
        return apiResult;
    }
}
