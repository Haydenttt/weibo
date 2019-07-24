package com.unicom.mapper;

import com.unicom.model.EventHeatRatio;
import com.unicom.model.EventHeatRatioExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EventHeatRatioMapper {
    int deleteByExample(EventHeatRatioExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EventHeatRatio record);

    int insertSelective(EventHeatRatio record);

    List<EventHeatRatio> selectByExample(EventHeatRatioExample example);

    EventHeatRatio selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EventHeatRatio record, @Param("example") EventHeatRatioExample example);

    int updateByExample(@Param("record") EventHeatRatio record, @Param("example") EventHeatRatioExample example);

    int updateByPrimaryKeySelective(EventHeatRatio record);

    int updateByPrimaryKey(EventHeatRatio record);
}