package com.qf.dao;

import com.qf.pojo.OperateLog;
import com.qf.pojo.OperateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperateLogMapper {
    long countByExample(OperateLogExample example);

    int deleteByExample(OperateLogExample example);

    int insert(OperateLog record);

    int insertSelective(OperateLog record);

    List<OperateLog> selectByExample(OperateLogExample example);

    int updateByExampleSelective(@Param("record") OperateLog record, @Param("example") OperateLogExample example);

    int updateByExample(@Param("record") OperateLog record, @Param("example") OperateLogExample example);
}