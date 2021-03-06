package com.unicom.controller;

import com.unicom.http.ApiResult;
import com.unicom.service.TrendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @program: weibo
 * @description: 传播趋势
 * @author: lp
 * @create: 2019-07-22 08:46
 **/
@RestController
@RequestMapping("trend")
public class TrendController {

    private final TrendService trendService;

    @Autowired
    public TrendController(TrendService trendService) {
        this.trendService = trendService;
    }

    /**
     * 根据事件id返回传播趋势数据到前端
     *
     * @param eventId 事件id
     * @return 返回结果
     */
    @PostMapping(value = "/getTrendData")
    public ApiResult getTrendData(@RequestParam("eventId") String eventId) {
        return getApiResult(trendService.assembleResult(eventId));
    }

    /**
     * 根据事件id存入传播趋势页面数据
     *
     * @param eventId 事件id
     * @return 返回结果
     */
    @PostMapping(value = "/storeTrendData")
    public ApiResult storeTrendData(@RequestParam("eventId") String eventId) {
        String data = trendService.crawlTrendData(eventId);
        String sameTimeDate = trendService.crawlTimeLineSameData(eventId);
        trendService.handleTrendData(data, eventId);
        trendService.handlTimeLineSameData(sameTimeDate, eventId);
        return ApiResult.success();
    }

    private ApiResult getApiResult(Map resultMap) {
        ApiResult apiResult;
        if (resultMap.containsKey("errMsg")) {
            apiResult = ApiResult.error();
            apiResult.setMessage((String) resultMap.get("errMsg"));
        } else {
            apiResult = ApiResult.success();
            apiResult.setData(resultMap);
        }
        return apiResult;
    }

}
