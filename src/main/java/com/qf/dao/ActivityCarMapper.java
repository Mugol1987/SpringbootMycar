package com.qf.dao;

import com.qf.pojo.ActivityCar;
import com.qf.pojo.ActivityCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityCarMapper {
    long countByExample(ActivityCarExample example);

    int deleteByExample(ActivityCarExample example);

    int insert(ActivityCar record);

    int insertSelective(ActivityCar record);

    List<ActivityCar> selectByExample(ActivityCarExample example);

    int updateByExampleSelective(@Param("record") ActivityCar record, @Param("example") ActivityCarExample example);

    int updateByExample(@Param("record") ActivityCar record, @Param("example") ActivityCarExample example);
}