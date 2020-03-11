package com.houzhenguo.service.impl;

import com.houzhenguo.service.IAccountService;

/**
 *  账户的业务层实现类
 */
public class AccountImpl implements IAccountService {
    public void saveAccount() {
        System.out.println("执行了保存");
    }

    public void updateAccount(int i) {
        System.out.println("执行了更新"+i);
    }

    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }
}
