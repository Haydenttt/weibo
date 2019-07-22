package com.unicom.mapper;

import com.unicom.model.PrortraitSex;
import com.unicom.model.PrortraitSexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrortraitSexMapper {
    int deleteByExample(PrortraitSexExample example);

    int deleteByPrimaryKey(Integer sexId);

    int insert(PrortraitSex record);

    int insertSelective(PrortraitSex record);

    List<PrortraitSex> selectByExample(PrortraitSexExample example);

    PrortraitSex selectByPrimaryKey(Integer sexId);

    int updateByExampleSelective(@Param("record") PrortraitSex record, @Param("example") PrortraitSexExample example);

    int updateByExample(@Param("record") PrortraitSex record, @Param("example") PrortraitSexExample example);

    int updateByPrimaryKeySelective(PrortraitSex record);

    int updateByPrimaryKey(PrortraitSex record);
}