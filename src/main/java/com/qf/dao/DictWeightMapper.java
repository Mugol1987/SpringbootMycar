package com.qf.dao;

import com.qf.pojo.DictWeight;
import com.qf.pojo.DictWeightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictWeightMapper {
    long countByExample(DictWeightExample example);

    int deleteByExample(DictWeightExample example);

    int insert(DictWeight record);

    int insertSelective(DictWeight record);

    List<DictWeight> selectByExample(DictWeightExample example);

    int updateByExampleSelective(@Param("record") DictWeight record, @Param("example") DictWeightExample example);

    int updateByExample(@Param("record") DictWeight record, @Param("example") DictWeightExample example);
}