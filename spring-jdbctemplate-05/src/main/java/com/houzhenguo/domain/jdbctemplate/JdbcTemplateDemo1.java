package com.houzhenguo.domain.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


/**
 *  JdbcTemplate 的基本用法
 */
public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        // prepare dataSource
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://39.96.160.227:3306/hope");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        // 1. create the object of JdbcTemplate
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        // 2. execute operation
        jdbcTemplate.execute("insert into  account(name, money)values('aaa1', 1000)");
    }
}
