package com.unicom.service;

import com.unicom.service.vo.IndexIntroVO;

import java.util.List;
import java.util.Map;

public interface IndexService {

    void deleteIndexIntro();

    void updateIndexIntro();

    List<IndexIntroVO> getIndexIntro();

    void deleteIndexStats();

    void updateIndexStats();

    Map<String, Object> getIndexStats();

    void deleteIndexMonth();

    void updateIndexMonth();

    Map<String ,Object>getIndexMonth();

    void deleteMonthDetail();

    void updateMonthDetail();

    Map<String ,Object>getMonthDetail();
}
