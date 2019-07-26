package com.unicom.controller;

import com.unicom.http.ApiResult;
import com.unicom.service.IndexService;
import com.unicom.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

/**
 * @program: weibo
 * @description: 首页
 * @author: Hayden TONG
 * @create: 2019-07-22 08:41
 **/
@CrossOrigin
@RestController
@RequestMapping("index")
public class IndexController extends BaseController{

    @Autowired
    private IndexService indexService;

    @PostMapping(value = "/indexStats")
    public ApiResult indexStats(){
//        1.删历史数据
        indexService.deleteIndexStats();
//        2.插入数据
        indexService.updateIndexStats();
//        3.返回数据
        Map<String, Object> statsMap = indexService.getIndexStats();
        ApiResult apiResult;
        apiResult = ApiResult.success();
        apiResult.setData(statsMap);
        return apiResult;
    }

    @PostMapping(value = "/indexMonth")
    public ApiResult indexMonth(){
        indexService.deleteIndexMonth();
        indexService.updateIndexMonth();
        Map<String ,Object> monthMap = indexService.getIndexMonth();
        ApiResult apiResult;
        apiResult = ApiResult.success();
        apiResult.setData(monthMap);
        return apiResult;
    }

    @PostMapping(value = "/indexDetail")
    public ApiResult indexDetail(@RequestBody Map<String, Object> map){
        String eventId = CommonUtil.getStringFromMap(map,"eventId");
        indexService.deleteMonthDetail();
        indexService.updateMonthDetail(eventId);
        Map<String ,Object> detailMap = indexService.getMonthDetail();
        ApiResult apiResult;
        apiResult = ApiResult.success();
        apiResult.setData(detailMap);
        return apiResult;
    }

}
