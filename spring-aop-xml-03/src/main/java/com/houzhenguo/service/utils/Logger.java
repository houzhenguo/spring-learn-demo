package com.houzhenguo.service.utils;

/**
 *  用于记录日志的工具类，提供了公共代码
 */
public class Logger {
    // 用于打印日志，计划在切入点方法执行前执行，切入点
    // 方法就是 业务层方法
    public void printLog() {
        System.out.println("Logger 类中 printLog 开始记录日志了");
    }
}
