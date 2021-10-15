package com.qf.dao;

import com.qf.pojo.MemberPoint;
import com.qf.pojo.MemberPointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberPointMapper {
    long countByExample(MemberPointExample example);

    int deleteByExample(MemberPointExample example);

    int insert(MemberPoint record);

    int insertSelective(MemberPoint record);

    List<MemberPoint> selectByExample(MemberPointExample example);

    int updateByExampleSelective(@Param("record") MemberPoint record, @Param("example") MemberPointExample example);

    int updateByExample(@Param("record") MemberPoint record, @Param("example") MemberPointExample example);
}