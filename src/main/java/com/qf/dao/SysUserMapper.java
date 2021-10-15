package com.qf.dao;

import com.qf.dto.QueryDTO;
import com.qf.pojo.SysUser;
import com.qf.pojo.SysUserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    List<SysUser> findByPage(QueryDTO queryDTO);

    List<Map<String,Object>> exportUser();

    public SysUser findByUsername(String username);
}