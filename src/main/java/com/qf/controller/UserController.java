package com.qf.controller;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.qf.dto.DataGridResult;
import com.qf.dto.QueryDTO;
import com.qf.dto.UserDTO;
import com.qf.pojo.SysUser;
import com.qf.service.SysUserService;
import com.qf.utils.MD5Utils;
import com.qf.utils.R;
import com.qf.utils.ShiroUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URLEncoder;

@Controller
public class UserController {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private DefaultKaptcha kaptcha;

    @RequestMapping("/captcha.jpg")
    public void captcha(HttpServletResponse response){
        // 缓存设置-设置不缓存（可选操作）
        response.setHeader("Cache-Control","no-store, no-cache");
        // 设置响应内容
        response.setContentType("image/jpg");
        //生成验证码
        String text = kaptcha.createText();//文本
        //生成图片
        BufferedImage image = kaptcha.createImage(text);
        //验证码存储到shiro的 session
        ShiroUtils.setKaptcha(text);
        try {
            //返回到页面
            ServletOutputStream outputStream = response.getOutputStream();
            ImageIO.write(image,"jpg",outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/sys/login")
    @ResponseBody
    public R login(@RequestBody UserDTO userDTO){
       //比对验证码
        String serverkaptcha = ShiroUtils.getKaptcha();
        if (!serverkaptcha.equalsIgnoreCase(userDTO.getCaptcha())){
            return R.error("验证码错误！");
        }
        Subject subject = SecurityUtils.getSubject();
        //对密码进行加密
        String newPass = MD5Utils.md5(userDTO.getPassword(),userDTO.getUsername(),1024);
        UsernamePasswordToken token = new UsernamePasswordToken(userDTO.getUsername(),newPass);
        if (userDTO.isRemeberMe()){
            token.setRememberMe(true);
        }
        subject.login(token);
        //会自动调用自定义的realm
        return R.ok();
    }

    @RequestMapping("/sys/user/list")
    @ResponseBody
    public DataGridResult findUser(QueryDTO queryDTO){
        return sysUserService.findUserByPage(queryDTO);

    }

    @RequestMapping("/sys/user/export")
    public void exportUser(HttpServletResponse response){
        Workbook workbook = sysUserService.exportUser();
        try {
            //设置响应头
            response.setContentType("application/octet-stream");//所有文件都支持
            String fileName = "员工信息.xls";
            fileName = URLEncoder.encode(fileName,"utf-8");
            response.setHeader("content-disposition","attachment;filename="+fileName);
            //文件下载
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/logout")
    public String logout(){
        ShiroUtils.logout();
        return "redirect:login.html";
    }

    @RequestMapping("/sys/user/info")
    @ResponseBody
    public R userinfo(){
        SysUser userEntity = ShiroUtils.getUserEntity();
        return R.ok().put("user",userEntity);
    }
}