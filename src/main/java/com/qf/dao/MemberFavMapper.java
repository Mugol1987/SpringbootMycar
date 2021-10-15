package com.qf.dao;

import com.qf.pojo.MemberFav;
import com.qf.pojo.MemberFavExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberFavMapper {
    long countByExample(MemberFavExample example);

    int deleteByExample(MemberFavExample example);

    int insert(MemberFav record);

    int insertSelective(MemberFav record);

    List<MemberFav> selectByExample(MemberFavExample example);

    int updateByExampleSelective(@Param("record") MemberFav record, @Param("example") MemberFavExample example);

    int updateByExample(@Param("record") MemberFav record, @Param("example") MemberFavExample example);
}