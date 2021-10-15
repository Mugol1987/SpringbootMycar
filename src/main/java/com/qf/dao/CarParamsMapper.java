package com.qf.dao;

import com.qf.pojo.CarParams;
import com.qf.pojo.CarParamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarParamsMapper {
    long countByExample(CarParamsExample example);

    int deleteByExample(CarParamsExample example);

    int insert(CarParams record);

    int insertSelective(CarParams record);

    List<CarParams> selectByExample(CarParamsExample example);

    int updateByExampleSelective(@Param("record") CarParams record, @Param("example") CarParamsExample example);

    int updateByExample(@Param("record") CarParams record, @Param("example") CarParamsExample example);
}