package com.qf.dao;

import com.qf.pojo.ActivityTag;
import com.qf.pojo.ActivityTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityTagMapper {
    long countByExample(ActivityTagExample example);

    int deleteByExample(ActivityTagExample example);

    int insert(ActivityTag record);

    int insertSelective(ActivityTag record);

    List<ActivityTag> selectByExample(ActivityTagExample example);

    int updateByExampleSelective(@Param("record") ActivityTag record, @Param("example") ActivityTagExample example);

    int updateByExample(@Param("record") ActivityTag record, @Param("example") ActivityTagExample example);
}