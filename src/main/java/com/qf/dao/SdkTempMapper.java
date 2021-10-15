package com.qf.dao;

import com.qf.pojo.SdkTemp;
import com.qf.pojo.SdkTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdkTempMapper {
    long countByExample(SdkTempExample example);

    int deleteByExample(SdkTempExample example);

    int insert(SdkTemp record);

    int insertSelective(SdkTemp record);

    List<SdkTemp> selectByExample(SdkTempExample example);

    int updateByExampleSelective(@Param("record") SdkTemp record, @Param("example") SdkTempExample example);

    int updateByExample(@Param("record") SdkTemp record, @Param("example") SdkTempExample example);
}