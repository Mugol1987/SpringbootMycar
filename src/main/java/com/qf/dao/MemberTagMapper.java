package com.qf.dao;

import com.qf.pojo.MemberTag;
import com.qf.pojo.MemberTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberTagMapper {
    long countByExample(MemberTagExample example);

    int deleteByExample(MemberTagExample example);

    int insert(MemberTag record);

    int insertSelective(MemberTag record);

    List<MemberTag> selectByExample(MemberTagExample example);

    int updateByExampleSelective(@Param("record") MemberTag record, @Param("example") MemberTagExample example);

    int updateByExample(@Param("record") MemberTag record, @Param("example") MemberTagExample example);
}