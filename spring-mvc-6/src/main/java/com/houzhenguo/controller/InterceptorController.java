package com.houzhenguo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("inter")
public class InterceptorController {
    @RequestMapping(value = "testInterceptor")
    public String testInterceptor() {
        System.out.println("controller 拦截器");
        return "success";
    }
}
