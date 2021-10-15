package com.qf.dao;

import com.qf.pojo.ProductCarActivity;
import com.qf.pojo.ProductCarActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCarActivityMapper {
    long countByExample(ProductCarActivityExample example);

    int deleteByExample(ProductCarActivityExample example);

    int insert(ProductCarActivity record);

    int insertSelective(ProductCarActivity record);

    List<ProductCarActivity> selectByExample(ProductCarActivityExample example);

    int updateByExampleSelective(@Param("record") ProductCarActivity record, @Param("example") ProductCarActivityExample example);

    int updateByExample(@Param("record") ProductCarActivity record, @Param("example") ProductCarActivityExample example);
}