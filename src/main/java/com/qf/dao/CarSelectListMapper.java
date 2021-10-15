package com.qf.dao;

import com.qf.pojo.CarSelectList;
import com.qf.pojo.CarSelectListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarSelectListMapper {
    long countByExample(CarSelectListExample example);

    int deleteByExample(CarSelectListExample example);

    int insert(CarSelectList record);

    int insertSelective(CarSelectList record);

    List<CarSelectList> selectByExample(CarSelectListExample example);

    int updateByExampleSelective(@Param("record") CarSelectList record, @Param("example") CarSelectListExample example);

    int updateByExample(@Param("record") CarSelectList record, @Param("example") CarSelectListExample example);
}