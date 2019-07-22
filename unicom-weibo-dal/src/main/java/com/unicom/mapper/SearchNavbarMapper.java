package com.unicom.mapper;

import com.unicom.model.SearchNavbar;
import com.unicom.model.SearchNavbarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchNavbarMapper {
    int deleteByExample(SearchNavbarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SearchNavbar record);

    int insertSelective(SearchNavbar record);

    List<SearchNavbar> selectByExample(SearchNavbarExample example);

    SearchNavbar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SearchNavbar record, @Param("example") SearchNavbarExample example);

    int updateByExample(@Param("record") SearchNavbar record, @Param("example") SearchNavbarExample example);

    int updateByPrimaryKeySelective(SearchNavbar record);

    int updateByPrimaryKey(SearchNavbar record);
}