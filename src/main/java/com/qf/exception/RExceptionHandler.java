package com.qf.exception;

import com.qf.utils.R;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Dis:统一异常接口处理器
 */
@ControllerAdvice
public class RExceptionHandler {

    @ExceptionHandler(RException.class)
    @ResponseBody
    public R rExp(RException rException){
        R r = new R();
        r.put("code",500);
        r.put("msg",rException.getMsg());
        return r;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R rExp(Exception exception){
        R r = new R();
        r.put("code",500);
        r.put("msg","系统内部错误，请联系管理员！");
        return r;
    }

    @ExceptionHandler(AuthorizationException.class)
    public String authorExce(AuthorizationException authorizationException){
        return "redirect:unauthorized.html";
    }
}
