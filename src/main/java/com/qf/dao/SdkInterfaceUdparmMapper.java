package com.qf.dao;

import com.qf.pojo.SdkInterfaceUdparm;
import com.qf.pojo.SdkInterfaceUdparmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdkInterfaceUdparmMapper {
    long countByExample(SdkInterfaceUdparmExample example);

    int deleteByExample(SdkInterfaceUdparmExample example);

    int insert(SdkInterfaceUdparm record);

    int insertSelective(SdkInterfaceUdparm record);

    List<SdkInterfaceUdparm> selectByExample(SdkInterfaceUdparmExample example);

    int updateByExampleSelective(@Param("record") SdkInterfaceUdparm record, @Param("example") SdkInterfaceUdparmExample example);

    int updateByExample(@Param("record") SdkInterfaceUdparm record, @Param("example") SdkInterfaceUdparmExample example);
}