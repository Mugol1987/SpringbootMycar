package com.qf.dao;

import com.qf.pojo.ScheduleJobLog;
import com.qf.pojo.ScheduleJobLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleJobLogMapper {
    long countByExample(ScheduleJobLogExample example);

    int deleteByExample(ScheduleJobLogExample example);

    int insert(ScheduleJobLog record);

    int insertSelective(ScheduleJobLog record);

    List<ScheduleJobLog> selectByExample(ScheduleJobLogExample example);

    int updateByExampleSelective(@Param("record") ScheduleJobLog record, @Param("example") ScheduleJobLogExample example);

    int updateByExample(@Param("record") ScheduleJobLog record, @Param("example") ScheduleJobLogExample example);
}