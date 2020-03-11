package com.houzhenguo.dao;

import com.houzhenguo.domain.Role;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IRoleDao {
     // 查询所有账户
     @Select("select * from role")
     List<Role> findAll();
     @Insert("insert into role (name,money) values (#{name},#{money})")
     void saveRole(Role role);
}
