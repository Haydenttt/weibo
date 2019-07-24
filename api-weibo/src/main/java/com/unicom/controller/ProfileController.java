package com.unicom.controller;

import com.unicom.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: weibo
 * @description: 事件概况
 * @author: Hayden TONG
 * @create: 2019-07-22 08:44
 **/
@Controller
@RequestMapping("profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping("/getProfileData")
    public String getProfileData() {
        String data = profileService.crawlProfileData("123");
        profileService.handlProfileData(data, "5816b4a30cf23b5e19909a27");
        return null;
    }
}
