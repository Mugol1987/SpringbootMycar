package com.qf.dao;

import com.qf.pojo.AdminUserRole;
import com.qf.pojo.AdminUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminUserRoleMapper {
    long countByExample(AdminUserRoleExample example);

    int deleteByExample(AdminUserRoleExample example);

    int insert(AdminUserRole record);

    int insertSelective(AdminUserRole record);

    List<AdminUserRole> selectByExample(AdminUserRoleExample example);

    int updateByExampleSelective(@Param("record") AdminUserRole record, @Param("example") AdminUserRoleExample example);

    int updateByExample(@Param("record") AdminUserRole record, @Param("example") AdminUserRoleExample example);
}