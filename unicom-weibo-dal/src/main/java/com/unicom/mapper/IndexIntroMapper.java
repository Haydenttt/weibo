package com.unicom.mapper;

import com.unicom.model.IndexIntro;
import com.unicom.model.IndexIntroExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndexIntroMapper {
    int deleteByExample(IndexIntroExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndexIntro record);

    int insertSelective(IndexIntro record);

    List<IndexIntro> selectByExample(IndexIntroExample example);

    IndexIntro selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndexIntro record, @Param("example") IndexIntroExample example);

    int updateByExample(@Param("record") IndexIntro record, @Param("example") IndexIntroExample example);

    int updateByPrimaryKeySelective(IndexIntro record);

    int updateByPrimaryKey(IndexIntro record);
}