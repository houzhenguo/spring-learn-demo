package com.houzhenguo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(path = "/hello", method = RequestMethod.GET, params = {"username"})
    public String sayHello(String username) {
        System.out.printf("say hello"+username);
        return "success";
    }
    @RequestMapping(path = "/test")
    public String test(HttpServletRequest request, HttpServletResponse response) {
        System.out.printf("say hello"+request.getRequestURI());
        return "success";
    }
}
