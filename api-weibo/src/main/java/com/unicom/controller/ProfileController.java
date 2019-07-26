package com.unicom.controller;

import com.unicom.http.ApiResult;
import com.unicom.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: weibo
 * @description: 事件概况
 * @author: Hayden TONG
 * @create: 2019-07-22 08:44
 **/
@RestController
@RequestMapping("profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping(value = "/getEventInfo")
    public ApiResult getProfileData(@RequestParam("eventId") String eventId) {
        String data = profileService.crawlProfileData(eventId);
        profileService.handlProfileData(data, eventId);
        ApiResult apiResult = ApiResult.success();
        apiResult.setData(profileService.getEventInfoData(eventId));
        return apiResult;
    }
}
