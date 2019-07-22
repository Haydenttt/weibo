package com.unicom.mapper;

import com.unicom.model.PortraitPattern;
import com.unicom.model.PortraitPatternExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PortraitPatternMapper {
    int deleteByExample(PortraitPatternExample example);

    int deleteByPrimaryKey(Integer patternId);

    int insert(PortraitPattern record);

    int insertSelective(PortraitPattern record);

    List<PortraitPattern> selectByExample(PortraitPatternExample example);

    PortraitPattern selectByPrimaryKey(Integer patternId);

    int updateByExampleSelective(@Param("record") PortraitPattern record, @Param("example") PortraitPatternExample example);

    int updateByExample(@Param("record") PortraitPattern record, @Param("example") PortraitPatternExample example);

    int updateByPrimaryKeySelective(PortraitPattern record);

    int updateByPrimaryKey(PortraitPattern record);
}