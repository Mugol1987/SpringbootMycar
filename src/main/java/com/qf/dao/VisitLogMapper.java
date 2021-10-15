package com.qf.dao;

import com.qf.pojo.VisitLog;
import com.qf.pojo.VisitLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitLogMapper {
    long countByExample(VisitLogExample example);

    int deleteByExample(VisitLogExample example);

    int insert(VisitLog record);

    int insertSelective(VisitLog record);

    List<VisitLog> selectByExample(VisitLogExample example);

    int updateByExampleSelective(@Param("record") VisitLog record, @Param("example") VisitLogExample example);

    int updateByExample(@Param("record") VisitLog record, @Param("example") VisitLogExample example);
}