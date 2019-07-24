package com.unicom.mapper;

import com.unicom.model.EventInfo;
import com.unicom.model.EventInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface EventInfoMapper {
    int deleteByExample(EventInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EventInfo record);

    int insertSelective(EventInfo record);

    List<EventInfo> selectByExample(EventInfoExample example);

    EventInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EventInfo record, @Param("example") EventInfoExample example);

    int updateByExample(@Param("record") EventInfo record, @Param("example") EventInfoExample example);

    int updateByPrimaryKeySelective(EventInfo record);

    int updateByPrimaryKey(EventInfo record);
}