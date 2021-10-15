package com.qf.dao;

import com.qf.pojo.CarBrand;
import com.qf.pojo.CarBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarBrandMapper {
    long countByExample(CarBrandExample example);

    int deleteByExample(CarBrandExample example);

    int insert(CarBrand record);

    int insertSelective(CarBrand record);

    List<CarBrand> selectByExample(CarBrandExample example);

    int updateByExampleSelective(@Param("record") CarBrand record, @Param("example") CarBrandExample example);

    int updateByExample(@Param("record") CarBrand record, @Param("example") CarBrandExample example);
}