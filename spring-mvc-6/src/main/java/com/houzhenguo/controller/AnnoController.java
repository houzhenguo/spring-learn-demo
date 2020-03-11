package com.houzhenguo.controller;

import com.houzhenguo.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;


@Controller
@RequestMapping("anno")
@SessionAttributes(value={"msg"})   // 把msg=美美存入到session域对中
public class AnnoController {
    @RequestMapping(path = "/testRequestParam")
    // 使用 RequestParam 不需要 参数名与 前端的保持一致 默认 required
    public String testRequestParam(@RequestParam("name") String username) {
        System.out.printf("testRequestParam"+username);
        return "success";
    }
    // 获取到请求体的内容
    @RequestMapping(path = "/testRequestBody")
    public String testRequestBody(@RequestBody String body) { // 可以拿到整个请求体的内容
        System.out.printf("testRequestBody"+body);
        return "success";
    }

    // PathVariable 注解
    // http://localhost:8080/spring-mvc-6/anno/testPathVariable/10
    @RequestMapping(path = "/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id) { // RestFul 风格
        System.out.printf("testPathVariable"+id);
        return "success";
    }
    // testRequestHeader 获得请求头 。反爬虫用到？
    @RequestMapping(path = "/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "accept") String header) {
        System.out.printf("testRequestHeader"+header);
        return "success";
    }

    // testCookieValue 获得浏览器 cookie value
    @RequestMapping(path = "/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookie) {
        System.out.printf("testCookieValue"+cookie);
        return "success";
    }

    // testModelAttribute
    @RequestMapping(path = "/testModelAttribute") // account 传入到这里
    public String testModelAttribute(Account account) {
        System.out.printf("testModelAttribute");
        return "success";
    }
    @ModelAttribute
    public Account showUser(Integer id, String name){ // 这是第一步
        System.out.printf("showUser 执行了....");

        // 通过用户查询数据库（模拟）
        Account user = new Account();
        user.setId(id);
        user.setName(name);
        user.setMoney(1000.0); // 因为优先执行，在这里做数据的完善操作;
        return user;
    }
    // testSessionAttributes
    @RequestMapping(path = "/testSessionAttributes")
    public String testSessionAttributes(Model model) { // session 同一会话共享内容
        System.out.printf("testSessionAttributes");
        // 底层会存储到request域对象中
        model.addAttribute("msg","zhangsan");
        return "success";
    }

    /**
     * 获取值
     * @param modelMap
     * @return
     */
    @RequestMapping(value="/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap){
        System.out.println("getSessionAttributes...");
        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }

    /**
     * 清除
     * @param status
     * @return
     */
    @RequestMapping(value="/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status){
        System.out.println("getSessionAttributes...");
        status.setComplete();
        return "success";
    }
}
