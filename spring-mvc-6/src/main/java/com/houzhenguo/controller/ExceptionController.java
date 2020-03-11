package com.houzhenguo.controller;

import com.houzhenguo.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex")
public class ExceptionController {
    @RequestMapping(value = "testException")
    public String testException() throws Exception{
        // 模拟异常
        try {
            // 模拟异常
            int a = 10/0;
        } catch (Exception e) {
            // 打印异常信息
            e.printStackTrace();
            // 抛出自定义异常信息
            throw new SysException("查询所有用户出现错误了...");
        }
        return "success";
    }
}
