package com.qf.dao;

import com.qf.pojo.DictCountry;
import com.qf.pojo.DictCountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictCountryMapper {
    long countByExample(DictCountryExample example);

    int deleteByExample(DictCountryExample example);

    int insert(DictCountry record);

    int insertSelective(DictCountry record);

    List<DictCountry> selectByExample(DictCountryExample example);

    int updateByExampleSelective(@Param("record") DictCountry record, @Param("example") DictCountryExample example);

    int updateByExample(@Param("record") DictCountry record, @Param("example") DictCountryExample example);
}