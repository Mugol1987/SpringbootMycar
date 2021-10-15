package com.qf.dao;

import com.qf.pojo.MemberProfile;
import com.qf.pojo.MemberProfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberProfileMapper {
    long countByExample(MemberProfileExample example);

    int deleteByExample(MemberProfileExample example);

    int insert(MemberProfile record);

    int insertSelective(MemberProfile record);

    List<MemberProfile> selectByExample(MemberProfileExample example);

    int updateByExampleSelective(@Param("record") MemberProfile record, @Param("example") MemberProfileExample example);

    int updateByExample(@Param("record") MemberProfile record, @Param("example") MemberProfileExample example);
}