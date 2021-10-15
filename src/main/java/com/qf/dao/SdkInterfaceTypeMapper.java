package com.qf.dao;

import com.qf.pojo.SdkInterfaceType;
import com.qf.pojo.SdkInterfaceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdkInterfaceTypeMapper {
    long countByExample(SdkInterfaceTypeExample example);

    int deleteByExample(SdkInterfaceTypeExample example);

    int insert(SdkInterfaceType record);

    int insertSelective(SdkInterfaceType record);

    List<SdkInterfaceType> selectByExample(SdkInterfaceTypeExample example);

    int updateByExampleSelective(@Param("record") SdkInterfaceType record, @Param("example") SdkInterfaceTypeExample example);

    int updateByExample(@Param("record") SdkInterfaceType record, @Param("example") SdkInterfaceTypeExample example);
}