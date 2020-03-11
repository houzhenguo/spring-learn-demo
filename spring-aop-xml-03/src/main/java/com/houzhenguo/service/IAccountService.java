package com.houzhenguo.service;

/**
 *  账户业务层接口
 */
public interface IAccountService {
    /**
     *  模拟保存账户
     */
    void saveAccount();

    /**
     *  模拟更新账户
     * @param i
     */
    void updateAccount(int i);

    /**
     *  删除账户
     */
    int deleteAccount();
}
