package com.qf.dao;

import com.qf.pojo.SdkInterface;
import com.qf.pojo.SdkInterfaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdkInterfaceMapper {
    long countByExample(SdkInterfaceExample example);

    int deleteByExample(SdkInterfaceExample example);

    int insert(SdkInterface record);

    int insertSelective(SdkInterface record);

    List<SdkInterface> selectByExample(SdkInterfaceExample example);

    int updateByExampleSelective(@Param("record") SdkInterface record, @Param("example") SdkInterfaceExample example);

    int updateByExample(@Param("record") SdkInterface record, @Param("example") SdkInterfaceExample example);
}