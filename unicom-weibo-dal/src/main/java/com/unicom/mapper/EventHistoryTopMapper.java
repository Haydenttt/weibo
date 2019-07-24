package com.unicom.mapper;

import com.unicom.model.EventHistoryTop;
import com.unicom.model.EventHistoryTopExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface EventHistoryTopMapper {
    int deleteByExample(EventHistoryTopExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EventHistoryTop record);

    int insertSelective(EventHistoryTop record);

    List<EventHistoryTop> selectByExample(EventHistoryTopExample example);

    EventHistoryTop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EventHistoryTop record, @Param("example") EventHistoryTopExample example);

    int updateByExample(@Param("record") EventHistoryTop record, @Param("example") EventHistoryTopExample example);

    int updateByPrimaryKeySelective(EventHistoryTop record);

    int updateByPrimaryKey(EventHistoryTop record);
}