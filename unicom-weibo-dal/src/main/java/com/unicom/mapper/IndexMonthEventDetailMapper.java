package com.unicom.mapper;

import com.unicom.model.IndexMonthEventDetail;
import com.unicom.model.IndexMonthEventDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndexMonthEventDetailMapper {
    int deleteByExample(IndexMonthEventDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndexMonthEventDetail record);

    int insertSelective(IndexMonthEventDetail record);

    List<IndexMonthEventDetail> selectByExample(IndexMonthEventDetailExample example);

    IndexMonthEventDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndexMonthEventDetail record, @Param("example") IndexMonthEventDetailExample example);

    int updateByExample(@Param("record") IndexMonthEventDetail record, @Param("example") IndexMonthEventDetailExample example);

    int updateByPrimaryKeySelective(IndexMonthEventDetail record);

    int updateByPrimaryKey(IndexMonthEventDetail record);
}