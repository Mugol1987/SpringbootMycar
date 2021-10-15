package com.qf.dao;

import com.qf.pojo.ProductCar;
import com.qf.pojo.ProductCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCarMapper {
    long countByExample(ProductCarExample example);

    int deleteByExample(ProductCarExample example);

    int insert(ProductCar record);

    int insertSelective(ProductCar record);

    List<ProductCar> selectByExample(ProductCarExample example);

    int updateByExampleSelective(@Param("record") ProductCar record, @Param("example") ProductCarExample example);

    int updateByExample(@Param("record") ProductCar record, @Param("example") ProductCarExample example);
}