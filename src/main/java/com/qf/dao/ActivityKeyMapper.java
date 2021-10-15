package com.qf.dao;

import com.qf.pojo.ActivityKey;
import com.qf.pojo.ActivityKeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityKeyMapper {
    long countByExample(ActivityKeyExample example);

    int deleteByExample(ActivityKeyExample example);

    int insert(ActivityKey record);

    int insertSelective(ActivityKey record);

    List<ActivityKey> selectByExample(ActivityKeyExample example);

    int updateByExampleSelective(@Param("record") ActivityKey record, @Param("example") ActivityKeyExample example);

    int updateByExample(@Param("record") ActivityKey record, @Param("example") ActivityKeyExample example);
}