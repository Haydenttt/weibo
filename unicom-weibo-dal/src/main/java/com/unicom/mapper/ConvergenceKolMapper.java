package com.unicom.mapper;

import com.unicom.model.ConvergenceKol;
import com.unicom.model.ConvergenceKolCopy;
import com.unicom.model.ConvergenceKolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConvergenceKolMapper {
    int deleteByExample(ConvergenceKolExample example);

    int deleteByPrimaryKey(Integer kolId);

    int insert(ConvergenceKol record);

    int insertSelective(ConvergenceKol record);

    List<ConvergenceKol> selectByExample(ConvergenceKolExample example);

    ConvergenceKol selectByPrimaryKey(Integer kolId);

    int updateByExampleSelective(@Param("record") ConvergenceKol record, @Param("example") ConvergenceKolExample example);

    int updateByExample(@Param("record") ConvergenceKol record, @Param("example") ConvergenceKolExample example);

    int updateByPrimaryKeySelective(ConvergenceKol record);

    int updateByPrimaryKey(ConvergenceKol record);
    List<ConvergenceKolCopy> getKolViewByEventId(String eventId);
    void deleteKolView();
}