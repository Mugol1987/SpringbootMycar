package com.qf.dao;

import com.qf.pojo.CarParamType;
import com.qf.pojo.CarParamTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarParamTypeMapper {
    long countByExample(CarParamTypeExample example);

    int deleteByExample(CarParamTypeExample example);

    int insert(CarParamType record);

    int insertSelective(CarParamType record);

    List<CarParamType> selectByExample(CarParamTypeExample example);

    int updateByExampleSelective(@Param("record") CarParamType record, @Param("example") CarParamTypeExample example);

    int updateByExample(@Param("record") CarParamType record, @Param("example") CarParamTypeExample example);
}