package com.qf.log;
/**
 * Dis:AOP切面类的开发
 */

import com.alibaba.fastjson.JSON;
import com.qf.utils.HttpContextUtils;
import com.qf.utils.IPUtils;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import java.lang.reflect.Method;
import java.util.Date;

@Aspect
@Component
public class MyLogAdvice {

    private Logger logger = Logger.getLogger(MyLogAdvice.class);

    //1.定义切入点，就是使用了这个注解的方法
    @Pointcut("@annotation(com.qf.log.MyLog)")
    public void myPointcut(){

    }

    //2.开发通知--后置通知（切入点表达式）
    @AfterReturning(pointcut = "myPointcut()")
    public void myafterRet(JoinPoint joinPoint){

        //通过反射拿到执行的方法
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        //获取到方法是否使用了 Mylog 注解
        MyLog annotation = method.getAnnotation(MyLog.class);
        String operation = null;
        if (annotation != null){
            //获取到用户的操作信息
            operation = annotation.value();
        }
        //获取用户IP
        String ip = IPUtils.getIpAddr(HttpContextUtils.getHttpServletRequest());
        Object[] args = joinPoint.getArgs();
        //将通知对象转换为json字符串
        String toJSONString = JSON.toJSONString(args);
        String methodName = joinPoint.getTarget().getClass().getName() + "." + method.getName();
        logger.info(new Date() + "|" + operation + "|" + ip + "|" + toJSONString + "|" + methodName);
    }
}
