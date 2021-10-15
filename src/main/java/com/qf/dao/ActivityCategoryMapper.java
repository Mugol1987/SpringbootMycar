package com.qf.dao;

import com.qf.pojo.ActivityCategory;
import com.qf.pojo.ActivityCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityCategoryMapper {
    long countByExample(ActivityCategoryExample example);

    int deleteByExample(ActivityCategoryExample example);

    int insert(ActivityCategory record);

    int insertSelective(ActivityCategory record);

    List<ActivityCategory> selectByExample(ActivityCategoryExample example);

    int updateByExampleSelective(@Param("record") ActivityCategory record, @Param("example") ActivityCategoryExample example);

    int updateByExample(@Param("record") ActivityCategory record, @Param("example") ActivityCategoryExample example);
}