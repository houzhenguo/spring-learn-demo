package service.utils;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 *  用于记录日志的工具类，提供了公共代码
 */
@Component("logger")
@Aspect // 表示当前类是一个切面类
public class Logger {
    @Pointcut("execution(* service.impl.*.*(..))")
    private void pt1() {}
    // 用于打印日志，计划在切入点方法执行前执行，切入点
    // 方法就是 业务层方法
    @Before("pt1()") // 前置通知
    public void beforeprintLog() {
        System.out.println("before Logger 类中 printLog 开始记录日志了");
    }
    @AfterReturning("pt1()") //后置通知
    public void afterReturnprintLog() {
        System.out.println("AfterReturning Logger 类中 printLog 开始记录日志了");
    }
    @AfterThrowing("pt1()") // 异常通知
    public void afterThrowprintLog() {
        System.out.println("AfterThrowing Logger 类中 printLog 开始记录日志了");
    }
    @After("pt1()") // 最终通知
    public void afterprintLog() {
        System.out.println("After Logger 类中 printLog 开始记录日志了");
    }


}
