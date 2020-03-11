package com.houzhenguo.dao.impl;

import com.houzhenguo.dao.IAccountDao;
import com.houzhenguo.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 *  账户的持久层实现类
 */
public class IAccountDaoImpl implements IAccountDao {
    //@Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Account findAccountById(Integer id) {
        List<Account> accountList = jdbcTemplate.query("select * from account where id = ?"
                ,new BeanPropertyRowMapper<>(Account.class)
                ,id
        );
        return accountList.isEmpty()?null:accountList.get(0);
    }

    @Override
    public Account findAccountByName(String name) {
        List<Account> accountList = jdbcTemplate.query("select * from account where name = ?"
                ,new BeanPropertyRowMapper<>(Account.class)
                ,name
        );
        if (accountList.isEmpty()) {
            return null;
        }
        if (accountList.size() > 0){
            throw new RuntimeException("结果集不唯一");
        }
        return accountList.get(0);
    }

    @Override
    public void updateAccount(Account account) {
        jdbcTemplate.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
