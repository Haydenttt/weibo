package com.unicom.mapper;

import com.unicom.model.PortraitProvince;
import com.unicom.model.PortraitProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PortraitProvinceMapper {
    int deleteByExample(PortraitProvinceExample example);

    int deleteByPrimaryKey(Integer provinceId);

    int insert(PortraitProvince record);

    int insertSelective(PortraitProvince record);

    List<PortraitProvince> selectByExample(PortraitProvinceExample example);

    PortraitProvince selectByPrimaryKey(Integer provinceId);

    int updateByExampleSelective(@Param("record") PortraitProvince record, @Param("example") PortraitProvinceExample example);

    int updateByExample(@Param("record") PortraitProvince record, @Param("example") PortraitProvinceExample example);

    int updateByPrimaryKeySelective(PortraitProvince record);

    int updateByPrimaryKey(PortraitProvince record);
}