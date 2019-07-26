package com.unicom.mapper;

import com.unicom.model.PortraitSex;
import com.unicom.model.PortraitSexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PortraitSexMapper {
    int deleteByExample(PortraitSexExample example);

    int deleteByPrimaryKey(Integer sexId);

    int insert(PortraitSex record);

    int insertSelective(PortraitSex record);

    List<PortraitSex> selectByExample(PortraitSexExample example);

    PortraitSex selectByPrimaryKey(Integer sexId);

    int updateByExampleSelective(@Param("record") PortraitSex record, @Param("example") PortraitSexExample example);

    int updateByExample(@Param("record") PortraitSex record, @Param("example") PortraitSexExample example);

    int updateByPrimaryKeySelective(PortraitSex record);

    int updateByPrimaryKey(PortraitSex record);
}