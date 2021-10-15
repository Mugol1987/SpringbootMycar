package com.qf.dao;

import com.qf.pojo.ActivityInterface;
import com.qf.pojo.ActivityInterfaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityInterfaceMapper {
    long countByExample(ActivityInterfaceExample example);

    int deleteByExample(ActivityInterfaceExample example);

    int insert(ActivityInterface record);

    int insertSelective(ActivityInterface record);

    List<ActivityInterface> selectByExample(ActivityInterfaceExample example);

    int updateByExampleSelective(@Param("record") ActivityInterface record, @Param("example") ActivityInterfaceExample example);

    int updateByExample(@Param("record") ActivityInterface record, @Param("example") ActivityInterfaceExample example);
}