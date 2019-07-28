package com.unicom.mapper;

import com.unicom.model.PortraitTags;
import com.unicom.model.PortraitTagsCopy;
import com.unicom.model.PortraitTagsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PortraitTagsMapper {
    int deleteByExample(PortraitTagsExample example);

    int deleteByPrimaryKey(Integer tagsId);

    int insert(PortraitTags record);

    int insertSelective(PortraitTags record);

    List<PortraitTags> selectByExample(PortraitTagsExample example);

    PortraitTags selectByPrimaryKey(Integer tagsId);

    int updateByExampleSelective(@Param("record") PortraitTags record, @Param("example") PortraitTagsExample example);

    int updateByExample(@Param("record") PortraitTags record, @Param("example") PortraitTagsExample example);

    int updateByPrimaryKeySelective(PortraitTags record);

    int updateByPrimaryKey(PortraitTags record);
    List<PortraitTagsCopy> getTagsByEventId(String eventId);
    void deleteTags();
}