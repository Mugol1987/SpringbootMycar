package com.qf.dao;

import com.qf.pojo.DictBrandPoint;
import com.qf.pojo.DictBrandPointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictBrandPointMapper {
    long countByExample(DictBrandPointExample example);

    int deleteByExample(DictBrandPointExample example);

    int insert(DictBrandPoint record);

    int insertSelective(DictBrandPoint record);

    List<DictBrandPoint> selectByExample(DictBrandPointExample example);

    int updateByExampleSelective(@Param("record") DictBrandPoint record, @Param("example") DictBrandPointExample example);

    int updateByExample(@Param("record") DictBrandPoint record, @Param("example") DictBrandPointExample example);
}