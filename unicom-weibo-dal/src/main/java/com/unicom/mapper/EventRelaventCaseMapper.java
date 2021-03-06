package com.unicom.mapper;

import com.unicom.model.EventRelaventCase;
import com.unicom.model.EventRelaventCaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface EventRelaventCaseMapper {
    int deleteByExample(EventRelaventCaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EventRelaventCase record);

    int insertSelective(EventRelaventCase record);

    List<EventRelaventCase> selectByExample(EventRelaventCaseExample example);

    EventRelaventCase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EventRelaventCase record, @Param("example") EventRelaventCaseExample example);

    int updateByExample(@Param("record") EventRelaventCase record, @Param("example") EventRelaventCaseExample example);

    int updateByPrimaryKeySelective(EventRelaventCase record);

    int updateByPrimaryKey(EventRelaventCase record);
}