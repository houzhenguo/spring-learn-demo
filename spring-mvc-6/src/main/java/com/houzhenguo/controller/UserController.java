package com.houzhenguo.controller;

import com.houzhenguo.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/userffff")
public class UserController {
    @RequestMapping(path = "/saveAccount", method = RequestMethod.POST)
    public String saveUser(Integer id, String username, Double money) {
        System.out.println("id" +id+",username:" +username+",money"+money);
        return "success";
    }

    @RequestMapping(path = "/saveAccount1", method = RequestMethod.POST)
    public String saveUser1(Account account) {
        System.out.println(account.toString());
        return "success";
    }
    // http://localhost:8080/spring-mvc-6/response.jsp
    @RequestMapping(path = "/testString")
    public String testString() {
        System.out.printf("testString");
        return "success";
    }
}
