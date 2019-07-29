package com.unicom.mapper;

import com.unicom.model.PortraitActivity;
import com.unicom.model.PortraitActivityCopy;
import com.unicom.model.PortraitActivityExample;
import java.util.List;

import com.unicom.model.PortraitProvinceCopy;
import org.apache.ibatis.annotations.Param;

public interface PortraitActivityMapper {
    int deleteByExample(PortraitActivityExample example);

    int deleteByPrimaryKey(Integer activityId);

    int insert(PortraitActivity record);

    int insertSelective(PortraitActivity record);

    List<PortraitActivity> selectByExample(PortraitActivityExample example);

    PortraitActivity selectByPrimaryKey(Integer activityId);

    int updateByExampleSelective(@Param("record") PortraitActivity record, @Param("example") PortraitActivityExample example);

    int updateByExample(@Param("record") PortraitActivity record, @Param("example") PortraitActivityExample example);

    int updateByPrimaryKeySelective(PortraitActivity record);

    int updateByPrimaryKey(PortraitActivity record);
    List<PortraitActivityCopy> getActivityByEventId(String eventId);
    void deleteActivity();
}