package com.qf.dao;

import com.qf.pojo.CarManufacturer;
import com.qf.pojo.CarManufacturerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarManufacturerMapper {
    long countByExample(CarManufacturerExample example);

    int deleteByExample(CarManufacturerExample example);

    int insert(CarManufacturer record);

    int insertSelective(CarManufacturer record);

    List<CarManufacturer> selectByExample(CarManufacturerExample example);

    int updateByExampleSelective(@Param("record") CarManufacturer record, @Param("example") CarManufacturerExample example);

    int updateByExample(@Param("record") CarManufacturer record, @Param("example") CarManufacturerExample example);
}