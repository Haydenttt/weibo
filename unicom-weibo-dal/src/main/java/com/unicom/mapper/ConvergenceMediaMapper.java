package com.unicom.mapper;

import com.unicom.model.ConvergenceMedia;
import com.unicom.model.ConvergenceMediaCopy;
import com.unicom.model.ConvergenceMediaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConvergenceMediaMapper {
    int deleteByExample(ConvergenceMediaExample example);

    int deleteByPrimaryKey(Integer mediaId);

    int insert(ConvergenceMedia record);

    int insertSelective(ConvergenceMedia record);

    List<ConvergenceMedia> selectByExample(ConvergenceMediaExample example);

    ConvergenceMedia selectByPrimaryKey(Integer mediaId);

    int updateByExampleSelective(@Param("record") ConvergenceMedia record, @Param("example") ConvergenceMediaExample example);

    int updateByExample(@Param("record") ConvergenceMedia record, @Param("example") ConvergenceMediaExample example);

    int updateByPrimaryKeySelective(ConvergenceMedia record);

    int updateByPrimaryKey(ConvergenceMedia record);
    List<ConvergenceMediaCopy> getMediaViewByEventId(String eventId);
    void deleteMediaView();
}