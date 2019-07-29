package com.unicom.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.unicom.mapper.ConvergenceKolMapper;
import com.unicom.mapper.ConvergenceMediaMapper;
import com.unicom.mapper.ConvergenceTopWordsMapper;
import com.unicom.model.*;
import com.unicom.service.PublicityService;
import com.unicom.util.EmojiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

/**
 * @program: weibo
 * @description:
 * @author: Hayden TONG
 * @create: 2019-07-22 08:53
 **/
@Service
public class PublicityProfileImpl implements PublicityService {
    @Autowired
    private ConvergenceKolMapper convergenceKolMapper;
    @Autowired
    private ConvergenceMediaMapper convergenceMediaMapper;
    @Autowired
    private ConvergenceTopWordsMapper convergenceTopWordsMapper;

    /**
     * 舆论聚合中json格式的意见领袖观点信息存储
     * @param convergenceKol json对象
     * @param event  事件id
     */
    @Override
    public void updateKolView(JSONObject convergenceKol,String event) {
        Set<String> convergenceKolSet =convergenceKol.keySet();
        Iterator<String> it = convergenceKolSet.iterator();
        while (it.hasNext()){
            ConvergenceKol ckol= new ConvergenceKol();
            String view = it.next();
            JSONArray viewObject = convergenceKol.getJSONArray(view);
            String username = viewObject.getJSONObject(0).getString("username");
            ckol.setUsername(username);
            String fensi = viewObject.getJSONObject(0).getString("fensi");
            ckol.setFans(Integer.parseInt(fensi));
            String weiboNum = viewObject.getJSONObject(0).getString("weibo");
            ckol.setWeiboNum(Integer.parseInt(weiboNum));
            String img_url = viewObject.getJSONObject(0).getString("img_url");
            ckol.setAvatar(img_url);
            String text = viewObject.getJSONObject(0).getString("text");
            String textStr = EmojiUtil.filterEmoji(text);
            ckol.setWeboText(textStr);
            String isForward = viewObject.getJSONObject(0).getString("isForward");
            byte b=(byte)(Integer.parseInt(isForward));
            ckol.setIfForward(b);
            String time = viewObject.getJSONObject(0).getString("time");
            ckol.setWeiboTime(time);
            String sex = viewObject.getJSONObject(0).getString("sex");
            if(sex.contains("f")){
                ckol.setSex((byte)1);
            }else {
                ckol.setSex((byte)0);
            }
            String url = viewObject.getJSONObject(0).getString("url");
            ckol.setUrl(url);
            String roottext = viewObject.getJSONObject(0).getString("roottext");
            ckol.setRootWeibo(roottext);
            String vtype = viewObject.getJSONObject(0).getString("vtype");
            byte v = (byte)(Integer.parseInt(vtype));
            ckol.setvType(v);
            ckol.setEventId(event);
            ckol.setCreator("hxm");
            ckol.setUpdater("hxm");
           convergenceKolMapper.insertSelective(ckol);
        }
    }

    /**
     * 意见领袖观点模块信息查询
     * @param eventId
     * @return
     */
    @Override
    public List<Map<String, Object>> getKolViewByEventId(String eventId) {
        List<ConvergenceKolCopy> kolCopyList = convergenceKolMapper.getKolViewByEventId(eventId);
        List<Map<String,Object>> kolListMap = new ArrayList<>();
        for (int i=0;i<kolCopyList.size();i++){
            Map<String,Object> kolCopyMap = new HashMap<>();
            kolCopyMap.put("username",kolCopyList.get(i).getUsername());
            kolCopyMap.put("fans",kolCopyList.get(i).getFans());
            kolCopyMap.put("weiboNum",kolCopyList.get(i).getWeiboNum());
            kolCopyMap.put("avatar",kolCopyList.get(i).getAvatar());
            kolCopyMap.put("weboText",kolCopyList.get(i).getWeboText());
            kolCopyMap.put("weiboTime",kolCopyList.get(i).getWeiboTime());
            kolListMap.add(kolCopyMap);
        }
        return kolListMap;
    }

    /**
     * 意见领袖观点模块数据清除
     */
    @Override
    public void deleteKolView() {
        convergenceKolMapper.deleteKolView();
    }

    /**
     * 舆论聚合中的媒体观点信息存储
     * @param convergenceMedia json对象格式的媒体信息
     * @param event  事件id
     */
    @Override
    public void updateMediaView(JSONArray convergenceMedia,String event) {
        for (int i=0;i<convergenceMedia.size();i++){
            ConvergenceMedia cMedia = new ConvergenceMedia();
            String similarNum = convergenceMedia.getJSONObject(i).getString("num");
            String similarTitle = convergenceMedia.getJSONObject(i).getString("title");
            JSONArray similarSource = convergenceMedia.getJSONObject(i).getJSONArray("sources");
            String sources ="";
            for (int j=0;j<similarSource.size();j++){
                String strNum = similarSource.getJSONObject(j).getString("name");
                sources = strNum+"、"+sources;
            }
            cMedia.setEventId(event);
            cMedia.setMedia(sources);
            cMedia.setMediaNum(Integer.parseInt(similarNum));
            cMedia.setTitle(similarTitle);
            cMedia.setCreator("hxm");
            cMedia.setUpdater("hxm");
            convergenceMediaMapper.insertSelective(cMedia);
        }
    }

    /**
     * 媒体观点模块信息查询
     * @param eventId 事件id
     * @return
     */
    @Override
    public List<Map<String, Object>> getMediaViewByEventId(String eventId) {
        List<ConvergenceMediaCopy> mediaCopyList = convergenceMediaMapper.getMediaViewByEventId(eventId);
        List<Map<String,Object>> mediaListMap = new ArrayList<>();
        for (int i=0;i<mediaCopyList.size();i++){
            Map<String,Object> mediaMap =new HashMap<>();
            mediaMap.put("name",mediaCopyList.get(i).getTitle());
            mediaMap.put("value",mediaCopyList.get(i).getMediaNum());
            mediaMap.put("media",mediaCopyList.get(i).getMedia());
            mediaListMap.add(mediaMap);
        }
        return mediaListMap;
    }

    /**
     * 媒体观点数据清除
     */
    @Override
    public void deleteMediaView() {
        convergenceMediaMapper.deleteMediaView();
    }

    /**
     * 舆论聚合中高频词信息存储
     * @param convergenceTopWords json格式的高频词信息
     * @param event  事件id
     */
    @Override
    public void updateTopWords(JSONArray convergenceTopWords,String event) {
        for (int i=0;i<convergenceTopWords.size();i++){
            ConvergenceTopWords cTopWords = new ConvergenceTopWords();
            String word = convergenceTopWords.getJSONObject(i).getString("word");
            String num = convergenceTopWords.getJSONObject(i).getString("num");
            cTopWords.setEventId(event);
            cTopWords.setWord(word);
            cTopWords.setNum(Integer.parseInt(num));
            cTopWords.setCreator("hxm");
            cTopWords.setUpdater("hxm");
            convergenceTopWordsMapper.insertSelective(cTopWords);
        }
    }

    /**
     * 高频词模块信息查询
     * @param eventId 事件id
     * @return
     */
    @Override
    public List<Map<String, Object>> getTopWordsByEventId(String eventId) {
        List<ConvergenceTopWordsCopy> topWordsCopyList = convergenceTopWordsMapper.getTopWordsByEventId(eventId);
        List<Map<String,Object>> topWordsListMap = new ArrayList<>();
        for (int i=0;i<topWordsCopyList.size();i++){
            Map<String,Object> topWordsMap = new HashMap<>();
            topWordsMap.put("name",topWordsCopyList.get(i).getWord());
            topWordsMap.put("value",topWordsCopyList.get(i).getNum());
            topWordsListMap.add(topWordsMap);
        }
        return topWordsListMap;
    }

    /**
     * 高频词数据清除
     */
    @Override
    public void deleteTopwords() {
        convergenceTopWordsMapper.deleteTopwords();
    }
}
