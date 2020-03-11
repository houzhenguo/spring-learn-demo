package com.houzhenguo.domain.jdbctemplate;

import com.houzhenguo.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/**
 *  JdbcTemplate 的基本用法
 */
public class JdbcTemplateDemo2 {
    public static void main(String[] args) {
        // 1. 获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2. 获取对象
        JdbcTemplate jt = ac.getBean("jdbcTemplate",JdbcTemplate.class);
        // 3. insert
       // jt.execute("insert into  account(name, money)values('aaa2', 2000)");
        // 4. update
        //jt.update("insert into account(name,money)values(?,?)","eee",4444);
        //jt.update("update account set name =?,money=? where id=?","zhangsan",900,7);
        // 5. delete
        //jt.update("delete from account where id=?",6);
        // 6. query

        //List<Account> accounts =  jt.query("select * from account where money > ?",new AccountRowMapper(),500);
        // Spring 自带的
//        List<Account> accounts =  jt.query("select * from account where money > ?",new BeanPropertyRowMapper<>(Account.class),500);
//        accounts.forEach(item->System.out.println(item.toString()));
        // 7. 查询所有

        // 8. 查询一个
//        List<Account> accounts1 =  jt.query("select * from account where id = ?",new BeanPropertyRowMapper<>(Account.class),1);
//        System.out.println(accounts1.isEmpty()?"没有":accounts1.get(0));
        // 9. 查询返回一行一列
        Integer count = jt.queryForObject("select count(*) from account where money > ?",Integer.class, 900f);
        System.out.println(count);

    }
}

/**
 *  定义 Account 的封装策略
 *  把 结果集封装到Account
 */
class AccountRowMapper implements RowMapper<Account> {
    public Account mapRow(ResultSet rs, int i) throws SQLException {
        Account account = new Account();
        account.setId(rs.getInt("id"));
        account.setName(rs.getString("name"));
        account.setMoney(rs.getFloat("money"));

        return account;
    }
}