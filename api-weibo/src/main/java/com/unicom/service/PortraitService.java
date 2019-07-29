package com.unicom.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.unicom.model.*;

import java.util.List;
import java.util.Map;

public interface PortraitService {
    void updatePortraitSex(JSONObject json,String eventId);
    List<Map<String,Object>> getSexByEventId(String eventId);
    void deleteSex();
    void updatePortraitLocation(JSONArray json, String eventId);
    List<Map<String,Object>> getLocationByEventId(String eventId);
    void deleteLocation();
    void updatePortraitTags(JSONArray json,String eventId);
    List<Map<String,Object>> getTagsByEventId(String eventId);
    void deleteTags();
    void updatePortraitDayLine(JSONObject eventDayLine,JSONObject allDayLine,String eventId);
    Map<String,Object> getDayLineByEventId(String eventId);
    void deleteDayLine();
    void updatePortraitActivity(JSONObject userWeibos,JSONObject event,String eventId);
    List<Map<String,Object>> getActivityByEventId(String eventId);
    void deleteActivity();
}
