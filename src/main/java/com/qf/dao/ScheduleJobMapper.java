package com.qf.dao;

import com.qf.pojo.ScheduleJob;
import com.qf.pojo.ScheduleJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleJobMapper {
    long countByExample(ScheduleJobExample example);

    int deleteByExample(ScheduleJobExample example);

    int insert(ScheduleJob record);

    int insertSelective(ScheduleJob record);

    List<ScheduleJob> selectByExample(ScheduleJobExample example);

    int updateByExampleSelective(@Param("record") ScheduleJob record, @Param("example") ScheduleJobExample example);

    int updateByExample(@Param("record") ScheduleJob record, @Param("example") ScheduleJobExample example);
}