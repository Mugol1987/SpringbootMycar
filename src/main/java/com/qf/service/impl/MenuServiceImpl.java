package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.base.StandardSystemProperty;
import com.qf.dao.SysMenuMapper;
import com.qf.dto.DataGridResult;
import com.qf.dto.QueryDTO;
import com.qf.pojo.SysMenu;
import com.qf.service.MenuService;
import com.qf.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public DataGridResult findMenu(QueryDTO queryDTO) {
        //利用插件获取分页信息
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());
        if(queryDTO.getSort() != null && !"".equals(queryDTO.getSort())){
            queryDTO.setSort("menu_id");
        }
        List<SysMenu> menuByPage = sysMenuMapper.findMenuByPage(queryDTO);
        PageInfo<SysMenu> info = new PageInfo<SysMenu>(menuByPage);
        long total = info.getTotal();
        DataGridResult result = new DataGridResult(total,info.getList());
        return result;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public R deleteMenu(List<Long> ids) {
       int i = sysMenuMapper.deleteMenu(ids);
        for (Long id: ids) {
            if (id < 51){
                return R.error("系统菜单不支持删除！");
            }
        }
       if (i>0){
           return R.ok();
       }else{
           return R.error(-200,"删除失败！");
       }
    }

    @Override
    public R selectMenu() {
        List<SysMenu> menu = sysMenuMapper.findMenu();
        //添加一个根目录
        SysMenu sysMenu = new SysMenu();
        sysMenu.setMenuId(0L);
        sysMenu.setType(0);
        sysMenu.setParentId(-1L);
        sysMenu.setName("一级菜单");
        menu.add(sysMenu);
        return R.ok().put("menuList",menu);
    }

    @Override
    public R saveMenu(SysMenu sysMenu) {
        int i = sysMenuMapper.insertSelective(sysMenu);
        return i>0?R.ok():R.error("新增失败！");
    }

    @Override
    public R findMenuById(Long menuId) {
        SysMenu sysMenu = sysMenuMapper.selectByPrimaryKey(menuId);
        return R.ok().put("menu",sysMenu);
    }

    @Override
    public List<String> findPermsByUserId(Long useId) {
        List<String> permsByUserId = sysMenuMapper.findPermsByUserId(useId);
        Set<String> set = new HashSet<String>();
        for (String  s: permsByUserId) {
            if (s != null && !"".equals(s)){
                String[] split = s.split(",");
                for (String s1:split) {
                    set.add(s1);
                }
            }
        }
        List<String> perms = new ArrayList<>();
        perms.addAll(set);
        return perms;
    }

    @Override
    public R updateMenu(SysMenu sysMenu) {
        int i = sysMenuMapper.updateByPrimaryKeySelective(sysMenu);
        return i>0?R.ok():R.error("修改失败!");
    }

    @Override
    public R findUserMenu(Long userId) {
        //1.查询用户的一级目录
        List<Map<String, Object>> dirMenuByUserId = sysMenuMapper.findDirMenuByUserId(userId);
        //2.查询目录对应的子菜单
        for (Map<String, Object> map : dirMenuByUserId) {
            Long menuId = Long.parseLong(map.get("menuId")+"");
            List<Map<String, Object>> subList = sysMenuMapper.findMenuNotButtonByUserId(userId, menuId);
            map.put("list",subList);
        }
        List<String> permsByUserId = sysMenuMapper.findPermsByUserId(userId);
        return R.ok().put("menuList",dirMenuByUserId).put("permissions",permsByUserId);
    }
}
