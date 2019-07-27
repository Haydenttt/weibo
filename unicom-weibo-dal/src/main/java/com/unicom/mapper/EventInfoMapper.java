package com.unicom.mapper;

import com.unicom.model.EventInfo;
import com.unicom.model.EventInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EventInfoMapper {

    int deleteByExample(EventInfoExample example);

    int insert(EventInfo record);

    int insertSelective(EventInfo record);

    List<EventInfo> selectByExample(EventInfoExample example);

    EventInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EventInfo record, @Param("example") EventInfoExample example);

    int updateByExample(@Param("record") EventInfo record, @Param("example") EventInfoExample example);

    int updateByPrimaryKeySelective(EventInfo record);

    int updateByPrimaryKey(EventInfo record);
}