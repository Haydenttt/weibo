package com.unicom.service;

import com.unicom.service.vo.IndexIntroVO;
import com.unicom.service.vo.IndexStatsVO;

import java.util.List;
import java.util.Map;

public interface IndexService {

    void deleteIndexIntro();

    List<IndexIntroVO> getIndexIntro();

    void updateIndexIntro();

    void deleteIndexStats();

    void updateIndexStats();

    Map<String, Object> getIndexStats();
}
