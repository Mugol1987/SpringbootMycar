package com.qf.dao;

import com.qf.pojo.AdminRole;
import com.qf.pojo.AdminRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminRoleMapper {
    long countByExample(AdminRoleExample example);

    int deleteByExample(AdminRoleExample example);

    int insert(AdminRole record);

    int insertSelective(AdminRole record);

    List<AdminRole> selectByExample(AdminRoleExample example);

    int updateByExampleSelective(@Param("record") AdminRole record, @Param("example") AdminRoleExample example);

    int updateByExample(@Param("record") AdminRole record, @Param("example") AdminRoleExample example);
}