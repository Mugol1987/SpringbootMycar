package com.qf.dao;

import com.qf.pojo.CarModel;
import com.qf.pojo.CarModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarModelMapper {
    long countByExample(CarModelExample example);

    int deleteByExample(CarModelExample example);

    int insert(CarModel record);

    int insertSelective(CarModel record);

    List<CarModel> selectByExample(CarModelExample example);

    int updateByExampleSelective(@Param("record") CarModel record, @Param("example") CarModelExample example);

    int updateByExample(@Param("record") CarModel record, @Param("example") CarModelExample example);
}