package com.qf.dao;

import com.qf.pojo.MemberToken;
import com.qf.pojo.MemberTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberTokenMapper {
    long countByExample(MemberTokenExample example);

    int deleteByExample(MemberTokenExample example);

    int insert(MemberToken record);

    int insertSelective(MemberToken record);

    List<MemberToken> selectByExample(MemberTokenExample example);

    int updateByExampleSelective(@Param("record") MemberToken record, @Param("example") MemberTokenExample example);

    int updateByExample(@Param("record") MemberToken record, @Param("example") MemberTokenExample example);
}