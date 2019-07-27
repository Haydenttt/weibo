package com.unicom.mapper;

import com.unicom.model.SearchResult;
import com.unicom.model.SearchResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchResultMapper {
    int deleteByExample(SearchResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SearchResult record);

    int insertSelective(SearchResult record);

    List<SearchResult> selectByExample(SearchResultExample example);

    SearchResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SearchResult record, @Param("example") SearchResultExample example);

    int updateByExample(@Param("record") SearchResult record, @Param("example") SearchResultExample example);

    int updateByPrimaryKeySelective(SearchResult record);

    int updateByPrimaryKey(SearchResult record);
}