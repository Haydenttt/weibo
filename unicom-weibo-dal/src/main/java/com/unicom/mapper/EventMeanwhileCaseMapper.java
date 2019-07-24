package com.unicom.mapper;

import com.unicom.model.EventMeanwhileCase;
import com.unicom.model.EventMeanwhileCaseExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


public interface EventMeanwhileCaseMapper {
    int deleteByExample(EventMeanwhileCaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EventMeanwhileCase record);

    int insertSelective(EventMeanwhileCase record);

    List<EventMeanwhileCase> selectByExample(EventMeanwhileCaseExample example);

    EventMeanwhileCase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EventMeanwhileCase record, @Param("example") EventMeanwhileCaseExample example);

    int updateByExample(@Param("record") EventMeanwhileCase record, @Param("example") EventMeanwhileCaseExample example);

    int updateByPrimaryKeySelective(EventMeanwhileCase record);

    int updateByPrimaryKey(EventMeanwhileCase record);
}