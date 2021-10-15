package com.qf.dao;

import com.qf.pojo.ChooseLog;
import com.qf.pojo.ChooseLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChooseLogMapper {
    long countByExample(ChooseLogExample example);

    int deleteByExample(ChooseLogExample example);

    int insert(ChooseLog record);

    int insertSelective(ChooseLog record);

    List<ChooseLog> selectByExample(ChooseLogExample example);

    int updateByExampleSelective(@Param("record") ChooseLog record, @Param("example") ChooseLogExample example);

    int updateByExample(@Param("record") ChooseLog record, @Param("example") ChooseLogExample example);
}