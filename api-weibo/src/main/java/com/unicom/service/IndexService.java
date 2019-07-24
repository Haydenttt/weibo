package com.unicom.service;

import com.unicom.service.vo.IndexIntroVO;

import java.util.List;

public interface IndexService {

    void deleteIndexIntro();

    List<IndexIntroVO> getIndexIntro();

    void updateIndexIntro();
}
