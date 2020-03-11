package com.houzhenguo.dao;

import com.houzhenguo.domain.Account;

// 账户持久层接口
public interface IAccountDao {
    Account findAccountById(Integer id);
    Account findAccountByName(String name);
    void updateAccount(Account account);
}
