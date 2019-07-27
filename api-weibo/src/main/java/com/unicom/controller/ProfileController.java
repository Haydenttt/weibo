package com.unicom.controller;

import com.unicom.http.ApiResult;
import com.unicom.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @program: weibo
 * @description: 事件概况Controller
 * @author: lp
 * @create: 2019-07-22 08:44
 **/
@RestController
@RequestMapping("profile")
public class ProfileController {

    private final ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping(value = "/getEventInfo")
    public ApiResult getEventInfo(@RequestParam("eventId") String eventId) {
        Map resultMap = profileService.getEventInfoData(eventId);
        return getApiResult(resultMap);
    }


    @PostMapping(value = "/getStats")
    public ApiResult getStats(@RequestParam("eventId") String eventId) {
        Map resultMap = profileService.getStats(eventId);
        return getApiResult(resultMap);
    }

    @PostMapping(value = "/getRelaventEvents")
    public ApiResult getRelaventEvents(@RequestParam("eventId") String eventId) {
        Map resultMap = profileService.getRelaventEvents(eventId);
        return getApiResult(resultMap);
    }

    @PostMapping(value = "/getEventHeatRatio")
    public ApiResult getEventHeatRatio(@RequestParam("eventId") String eventId) {
        Map resultMap = profileService.getEventHeatRatio(eventId);
        return getApiResult(resultMap);
    }

    @PostMapping(value = "/storeProfileData")
    public ApiResult storeProfileData(@RequestParam("eventId") String eventId) {
        String data = profileService.crawlProfileData(eventId);
        System.out.println(data);
        profileService.handleProfileData(data, eventId);
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
