package com.qf.dao;

import com.qf.pojo.AdminMenuAuth;
import com.qf.pojo.AdminMenuAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminMenuAuthMapper {
    long countByExample(AdminMenuAuthExample example);

    int deleteByExample(AdminMenuAuthExample example);

    int insert(AdminMenuAuth record);

    int insertSelective(AdminMenuAuth record);

    List<AdminMenuAuth> selectByExample(AdminMenuAuthExample example);

    int updateByExampleSelective(@Param("record") AdminMenuAuth record, @Param("example") AdminMenuAuthExample example);

    int updateByExample(@Param("record") AdminMenuAuth record, @Param("example") AdminMenuAuthExample example);
}