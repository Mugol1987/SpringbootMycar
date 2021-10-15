package com.qf.dao;

import com.qf.pojo.MemberCar;
import com.qf.pojo.MemberCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberCarMapper {
    long countByExample(MemberCarExample example);

    int deleteByExample(MemberCarExample example);

    int insert(MemberCar record);

    int insertSelective(MemberCar record);

    List<MemberCar> selectByExample(MemberCarExample example);

    int updateByExampleSelective(@Param("record") MemberCar record, @Param("example") MemberCarExample example);

    int updateByExample(@Param("record") MemberCar record, @Param("example") MemberCarExample example);
}