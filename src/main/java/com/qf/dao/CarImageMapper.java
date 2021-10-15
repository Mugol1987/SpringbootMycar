package com.qf.dao;

import com.qf.pojo.CarImage;
import com.qf.pojo.CarImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarImageMapper {
    long countByExample(CarImageExample example);

    int deleteByExample(CarImageExample example);

    int insert(CarImage record);

    int insertSelective(CarImage record);

    List<CarImage> selectByExample(CarImageExample example);

    int updateByExampleSelective(@Param("record") CarImage record, @Param("example") CarImageExample example);

    int updateByExample(@Param("record") CarImage record, @Param("example") CarImageExample example);
}