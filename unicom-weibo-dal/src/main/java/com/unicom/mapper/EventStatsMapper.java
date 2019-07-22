package com.unicom.mapper;

import com.unicom.model.EventStats;
import com.unicom.model.EventStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventStatsMapper {
    int deleteByExample(EventStatsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EventStats record);

    int insertSelective(EventStats record);

    List<EventStats> selectByExample(EventStatsExample example);

    EventStats selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EventStats record, @Param("example") EventStatsExample example);

    int updateByExample(@Param("record") EventStats record, @Param("example") EventStatsExample example);

    int updateByPrimaryKeySelective(EventStats record);

    int updateByPrimaryKey(EventStats record);
}