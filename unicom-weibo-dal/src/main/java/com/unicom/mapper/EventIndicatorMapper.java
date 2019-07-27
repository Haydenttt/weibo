package com.unicom.mapper;

import com.unicom.model.EventIndicator;
import com.unicom.model.EventIndicatorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EventIndicatorMapper {
    int deleteByExample(EventIndicatorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EventIndicator record);

    int insertSelective(EventIndicator record);

    List<EventIndicator> selectByExample(EventIndicatorExample example);

    EventIndicator selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EventIndicator record, @Param("example") EventIndicatorExample example);

    int updateByExample(@Param("record") EventIndicator record, @Param("example") EventIndicatorExample example);

    int updateByPrimaryKeySelective(EventIndicator record);

    int updateByPrimaryKey(EventIndicator record);
}