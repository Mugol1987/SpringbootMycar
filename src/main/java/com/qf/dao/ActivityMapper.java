package com.qf.dao;

import com.qf.pojo.Activity;
import com.qf.pojo.ActivityExample;
import com.qf.pojo.ActivityWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityMapper {
    long countByExample(ActivityExample example);

    int deleteByExample(ActivityExample example);

    int insert(ActivityWithBLOBs record);

    int insertSelective(ActivityWithBLOBs record);

    List<ActivityWithBLOBs> selectByExampleWithBLOBs(ActivityExample example);

    List<Activity> selectByExample(ActivityExample example);

    int updateByExampleSelective(@Param("record") ActivityWithBLOBs record, @Param("example") ActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityWithBLOBs record, @Param("example") ActivityExample example);

    int updateByExample(@Param("record") Activity record, @Param("example") ActivityExample example);
}