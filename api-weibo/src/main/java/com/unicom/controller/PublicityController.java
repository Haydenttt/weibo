package com.unicom.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.unicom.http.ApiResult;
import com.unicom.service.PublicityService;
import com.unicom.util.CommonUtil;
import com.unicom.util.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @program: weibo
 * @description: 舆论聚合
 * @author: Hayden TONG
 * @create: 2019-07-22 08:47
 **/
@RestController
@RequestMapping("publicity")
public class PublicityController {
    @Autowired
    private PublicityService publicityService;
    private final static String PUBLICITY ="http://ef.zhiweidata.com/phone/mediaView.do";
    @PostMapping(value = "/kolView")
    public ApiResult convergenceKolView(@RequestParam Map<String, Object> maps){
        String eventId = CommonUtil.getStringFromMap(maps,"eventId");
        String param = "eventId="+eventId;
        String result = HttpUtil.sendPost(PUBLICITY,param);
        JSONObject jsonObject = JSON.parseObject(result);
        //意见领袖观点模块信息清除
        publicityService.deleteKolView();
        //意见领袖观点模块信息存储
        JSONObject view = jsonObject.getJSONObject("view");
        publicityService.updateKolView(view,eventId);
        //意见领袖观点模块信息查询
        List<Map<String,Object>> sexList=publicityService.getKolViewByEventId(eventId);
        ApiResult apiResult = ApiResult.success();
        apiResult.setData(sexList);
        return apiResult;
    }
    @PostMapping(value = "/mediaView")
    public ApiResult convergenceMediaView(@RequestParam Map<String, Object> maps){
        //String event ="5a6d17dd8c4b357410015791";
        String eventId = CommonUtil.getStringFromMap(maps,"eventId");
        String param = "eventId="+eventId;
        String result = HttpUtil.sendPost(PUBLICITY,param);
        JSONObject jsonObject = JSON.parseObject(result);
        //媒体观点信息清除
        publicityService.deleteMediaView();
        //媒体观点信息存储
        JSONArray similar = jsonObject.getJSONArray("similar");
        publicityService.updateMediaView(similar,eventId);
        //媒体观点信息查询
        List<Map<String,Object>> sexList=publicityService.getMediaViewByEventId(eventId);
        ApiResult apiResult = ApiResult.success();
        apiResult.setData(sexList);
        return apiResult;
    }
    @PostMapping(value = "/topWordView")
    public ApiResult convergenceTopWordView(@RequestParam Map<String, Object> maps){
        String eventId = CommonUtil.getStringFromMap(maps,"eventId");
        String param = "eventId="+eventId;
        String result = HttpUtil.sendPost(PUBLICITY,param);
        JSONObject jsonObject = JSON.parseObject(result);
        //高频词信息清除
        publicityService.deleteTopwords();
        //高频词信息存储
        JSONArray topWords = jsonObject.getJSONArray("topWords");
        publicityService.updateTopWords(topWords,eventId);
        List<Map<String,Object>> sexList=publicityService.getTopWordsByEventId(eventId);
        //高频词信息查询
        ApiResult apiResult = ApiResult.success();
        apiResult.setData(sexList);
        return apiResult;
    }
}
