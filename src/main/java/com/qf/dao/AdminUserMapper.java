package com.qf.dao;

import com.qf.pojo.AdminUser;
import com.qf.pojo.AdminUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminUserMapper {
    long countByExample(AdminUserExample example);

    int deleteByExample(AdminUserExample example);

    int insert(AdminUser record);

    int insertSelective(AdminUser record);

    List<AdminUser> selectByExample(AdminUserExample example);

    int updateByExampleSelective(@Param("record") AdminUser record, @Param("example") AdminUserExample example);

    int updateByExample(@Param("record") AdminUser record, @Param("example") AdminUserExample example);
}