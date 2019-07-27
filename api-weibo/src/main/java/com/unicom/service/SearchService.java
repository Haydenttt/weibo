package com.unicom.service;

import java.util.Map;

public interface SearchService {

    void deleteSearchResult();

    void updateSearchResult(String keyword, Integer page);

    Map<String ,Object> getSearchResult();

    void deleteSearchNavbar();

    void updateSearchNavbar();

    Map<String ,Object> getSearchNavbar();

}
