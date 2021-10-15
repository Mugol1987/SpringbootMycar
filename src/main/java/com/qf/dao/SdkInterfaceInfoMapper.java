package com.qf.dao;

import com.qf.pojo.SdkInterfaceInfo;
import com.qf.pojo.SdkInterfaceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdkInterfaceInfoMapper {
    long countByExample(SdkInterfaceInfoExample example);

    int deleteByExample(SdkInterfaceInfoExample example);

    int insert(SdkInterfaceInfo record);

    int insertSelective(SdkInterfaceInfo record);

    List<SdkInterfaceInfo> selectByExample(SdkInterfaceInfoExample example);

    int updateByExampleSelective(@Param("record") SdkInterfaceInfo record, @Param("example") SdkInterfaceInfoExample example);

    int updateByExample(@Param("record") SdkInterfaceInfo record, @Param("example") SdkInterfaceInfoExample example);
}