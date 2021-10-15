package com.qf.dao;

import com.qf.dto.QueryDTO;
import com.qf.pojo.SysMenu;
import com.qf.pojo.SysMenuExample;
import java.util.List;
import java.util.Map;

import com.sun.org.apache.bcel.internal.generic.LSTORE;
import org.apache.ibatis.annotations.Param;

public interface SysMenuMapper {
    long countByExample(SysMenuExample example);

    int deleteByExample(SysMenuExample example);

    int  deleteMenu(List<Long> ids);

    //通过主键进行查询
    SysMenu selectByPrimaryKey(Long menuId);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    List<SysMenu> selectByExample(SysMenuExample example);

    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    //通过主键进行修改
    int updateByPrimaryKeySelective(SysMenu record);

    List<SysMenu> findMenuByPage(QueryDTO queryDTO);

    List<SysMenu> findMenu();

    List<String> findPermsByUserId(@Param("userId") Long userId);

    List<Map<String,Object>> findDirMenuByUserId(@Param("userId")Long userId);

    List<Map<String,Object>> findMenuNotButtonByUserId(@Param("userId")Long userId,@Param("parentId") Long parentId);
}