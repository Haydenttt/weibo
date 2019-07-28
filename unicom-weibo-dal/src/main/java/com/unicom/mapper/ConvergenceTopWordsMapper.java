package com.unicom.mapper;

import com.unicom.model.ConvergenceTopWords;
import com.unicom.model.ConvergenceTopWordsCopy;
import com.unicom.model.ConvergenceTopWordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConvergenceTopWordsMapper {
    int deleteByExample(ConvergenceTopWordsExample example);

    int deleteByPrimaryKey(Integer topId);

    int insert(ConvergenceTopWords record);

    int insertSelective(ConvergenceTopWords record);

    List<ConvergenceTopWords> selectByExample(ConvergenceTopWordsExample example);

    ConvergenceTopWords selectByPrimaryKey(Integer topId);

    int updateByExampleSelective(@Param("record") ConvergenceTopWords record, @Param("example") ConvergenceTopWordsExample example);

    int updateByExample(@Param("record") ConvergenceTopWords record, @Param("example") ConvergenceTopWordsExample example);

    int updateByPrimaryKeySelective(ConvergenceTopWords record);

    int updateByPrimaryKey(ConvergenceTopWords record);
    List<ConvergenceTopWordsCopy> getTopWordsByEventId(String eventId);
    void deleteTopwords();
}