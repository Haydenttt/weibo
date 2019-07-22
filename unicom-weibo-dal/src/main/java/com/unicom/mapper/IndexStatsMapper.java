package com.unicom.mapper;

import com.unicom.model.IndexStats;
import com.unicom.model.IndexStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndexStatsMapper {
    int deleteByExample(IndexStatsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndexStats record);

    int insertSelective(IndexStats record);

    List<IndexStats> selectByExample(IndexStatsExample example);

    IndexStats selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndexStats record, @Param("example") IndexStatsExample example);

    int updateByExample(@Param("record") IndexStats record, @Param("example") IndexStatsExample example);

    int updateByPrimaryKeySelective(IndexStats record);

    int updateByPrimaryKey(IndexStats record);
}