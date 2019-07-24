package com.unicom.mapper;

import com.unicom.model.EventTimelineTrend;
import com.unicom.model.EventTimelineTrendExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface EventTimelineTrendMapper {
    int deleteByExample(EventTimelineTrendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EventTimelineTrend record);

    int insertSelective(EventTimelineTrend record);

    List<EventTimelineTrend> selectByExample(EventTimelineTrendExample example);

    EventTimelineTrend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EventTimelineTrend record, @Param("example") EventTimelineTrendExample example);

    int updateByExample(@Param("record") EventTimelineTrend record, @Param("example") EventTimelineTrendExample example);

    int updateByPrimaryKeySelective(EventTimelineTrend record);

    int updateByPrimaryKey(EventTimelineTrend record);
}