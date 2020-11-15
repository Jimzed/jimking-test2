package com.jimking.test2.aspect;

import com.jimking.test2.annotation.EnableSwitch;
import com.jimking.test2.annotation.TestAnnotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author qushihan
 * @date 2020/11/12
 * @desc
 * @since 1.0
 */
@Aspect
@Component
public class UserAspect {

//    // 把切面的连接点放在了我们的注解上
//    @Pointcut("@annotation(com.jimking.test2.annotation.TestAnnotation)")
//    public void userAspect() {
//    }
//
//    // 在这里定义前置切面
//    @Before("userAspect() && @annotation(testAnnotation)")
//    public void beforeMethod(JoinPoint joinPoint, TestAnnotation testAnnotation) {
//        System.out.println(joinPoint.getSignature().getName());
//        System.out.println(testAnnotation.value());
//        // 这里执行保存日志的动作
//        System.out.println("方法前.......");
//        //得到被切方法的参数
//        System.out.println(joinPoint.getArgs()[0]);
//    }

    // 把切面的连接点放在了我们的注解上
    @Pointcut("@annotation(com.jimking.test2.annotation.EnableSwitch)")
    public void userAspect() { }

    @Before("userAspect() && @annotation(enableSwitch)")
    public void beforeMethod(JoinPoint joinPoint, EnableSwitch enableSwitch) {
        System.out.println(joinPoint.getSignature().getName());
        System.out.println();
    }
}
