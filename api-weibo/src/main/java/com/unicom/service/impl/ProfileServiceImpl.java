package com.unicom.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.unicom.mapper.EventHeatRatioMapper;
import com.unicom.mapper.EventInfoMapper;
import com.unicom.model.EventInfo;
import com.unicom.model.EventInfoExample;
import com.unicom.service.ProfileService;
import com.unicom.util.CommonUtil;
import com.unicom.util.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: weibo
 * @description:
 * @author: Hayden TONG
 * @create: 2019-07-22 08:53
 **/
@Service
public class ProfileServiceImpl implements ProfileService {

    static final String PROFILE_URL = "http://ef.zhiweidata.com/analy/overviewV2.do";

    @Autowired
    private EventInfoMapper eventInfoMapper;

    @Autowired
    private EventHeatRatioMapper eventHeatRatioMapper;

    @Override
    public String crawlProfileData(String eventId) {
        String data =  HttpUtil.sendPost(PROFILE_URL,"eventId=5816b4a30cf23b5e19909a27");
        return data;
    }

    @Override
    public void handlProfileData(String dataStr, String eventId) {
        //把事件概况数据data转换为json格式
        JSONObject dataJson = JSONObject.parseObject(dataStr);
        EventInfo eventInfo = new EventInfo();
        eventInfo.setEventId(eventId);
        JSONObject data = dataJson.getJSONObject("data");
        eventInfo.setTitle(data.getString("name"));
        eventInfo.setDescription(data.getString("descript"));
        eventInfo.setFirstType(data.getString("firstType"));
        eventInfo.setStartTime(CommonUtil.milliSecondToDate(Long.valueOf(data.getString("startTime"))));
        String tagStr = "";
        for (Object tag : data.getJSONArray("tags")) {
            tagStr += tag.toString() + ",";
        }
        eventInfo.setTags(tagStr);
        eventInfo.setIsEnd(data.getString("isEnd").equals("true") ? (byte) 1 : (byte) 0);
        System.out.println(eventInfo.toString());

        //查询数据库中是否已有该事件数据，如果没有则插入，否则不做操作
        EventInfoExample example = new EventInfoExample();
        EventInfoExample.Criteria criteria = example.createCriteria();
        criteria.andEventIdEqualTo(eventId);

        List<EventInfo> eventInfoList = eventInfoMapper.selectByExample(example);
        if (eventInfoList.size() == 0) {
            eventInfoMapper.insert(eventInfo);
        }
    }

    @Override
    public String getProfileData(String eventId) {
        return null;
    }

    public static void main(String[] args) {
        ProfileService profileService = new ProfileServiceImpl();
        String data = profileService.crawlProfileData("123");
        profileService.handlProfileData(data, "5816b4a30cf23b5e19909a27");
    }
}
