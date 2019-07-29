package com.unicom.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

public interface PublicityService {
    void updateKolView(JSONObject convergenceKol,String event);

    List<Map<String,Object>> getKolViewByEventId(String eventId);

    void deleteKolView();

    void updateMediaView(JSONArray convergenceMedia, String event);

    List<Map<String,Object>> getMediaViewByEventId(String eventId);

    void deleteMediaView();

    void updateTopWords(JSONArray convergenceTopWords,String event);

    List<Map<String,Object>> getTopWordsByEventId(String eventId);

    void deleteTopwords();
}
