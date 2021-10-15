package com.qf.controller;

import com.qf.pojo.SysUser;
import com.qf.service.SysUserService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/findAll")
    @ResponseBody
    @RequiresRoles("qf")
    public List<SysUser> findAll(){
        return sysUserService.findAll();
    }

}
