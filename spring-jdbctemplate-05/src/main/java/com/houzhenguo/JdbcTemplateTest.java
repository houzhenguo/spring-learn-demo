package com.houzhenguo;

import com.houzhenguo.dao.IAccountDao;
import com.houzhenguo.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        IAccountDao accountDao = applicationContext.getBean("accountDao",IAccountDao.class);
        Account account = accountDao.findAccountById(1);
        System.out.println(account.getName());
        account.setMoney(8899f);
        accountDao.updateAccount(account);
    }
}
