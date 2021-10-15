package com.qf.dao;

import com.qf.pojo.MemberProfileLog;
import com.qf.pojo.MemberProfileLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberProfileLogMapper {
    long countByExample(MemberProfileLogExample example);

    int deleteByExample(MemberProfileLogExample example);

    int insert(MemberProfileLog record);

    int insertSelective(MemberProfileLog record);

    List<MemberProfileLog> selectByExample(MemberProfileLogExample example);

    int updateByExampleSelective(@Param("record") MemberProfileLog record, @Param("example") MemberProfileLogExample example);

    int updateByExample(@Param("record") MemberProfileLog record, @Param("example") MemberProfileLogExample example);
}