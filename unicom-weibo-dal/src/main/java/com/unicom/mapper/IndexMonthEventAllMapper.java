package com.unicom.mapper;

import com.unicom.model.IndexMonthEventAll;
import com.unicom.model.IndexMonthEventAllExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndexMonthEventAllMapper {
    int deleteByExample(IndexMonthEventAllExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndexMonthEventAll record);

    int insertSelective(IndexMonthEventAll record);

    List<IndexMonthEventAll> selectByExample(IndexMonthEventAllExample example);

    IndexMonthEventAll selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndexMonthEventAll record, @Param("example") IndexMonthEventAllExample example);

    int updateByExample(@Param("record") IndexMonthEventAll record, @Param("example") IndexMonthEventAllExample example);

    int updateByPrimaryKeySelective(IndexMonthEventAll record);

    int updateByPrimaryKey(IndexMonthEventAll record);
}