package com.houzhenguo.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    public static void main(String[] args) {
        // 1. 获取容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        // 2. 获取对象
        IAccountService accountService = (IAccountService)applicationContext.getBean("accountService");
        // 3. 执行方法
        accountService.saveAccount();
        accountService.updateAccount(1);
        accountService.deleteAccount();
    }
}
