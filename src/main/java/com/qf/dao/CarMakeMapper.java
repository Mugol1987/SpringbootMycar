package com.qf.dao;

import com.qf.pojo.CarMake;
import com.qf.pojo.CarMakeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarMakeMapper {
    long countByExample(CarMakeExample example);

    int deleteByExample(CarMakeExample example);

    int insert(CarMake record);

    int insertSelective(CarMake record);

    List<CarMake> selectByExample(CarMakeExample example);

    int updateByExampleSelective(@Param("record") CarMake record, @Param("example") CarMakeExample example);

    int updateByExample(@Param("record") CarMake record, @Param("example") CarMakeExample example);
}