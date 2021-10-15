package com.qf.dao;

import com.qf.pojo.CarModelImage;
import com.qf.pojo.CarModelImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarModelImageMapper {
    long countByExample(CarModelImageExample example);

    int deleteByExample(CarModelImageExample example);

    int insert(CarModelImage record);

    int insertSelective(CarModelImage record);

    List<CarModelImage> selectByExample(CarModelImageExample example);

    int updateByExampleSelective(@Param("record") CarModelImage record, @Param("example") CarModelImageExample example);

    int updateByExample(@Param("record") CarModelImage record, @Param("example") CarModelImageExample example);
}