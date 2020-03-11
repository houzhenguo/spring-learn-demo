package com.houzhenguo.test;
import com.houzhenguo.dao.IRoleDao;
import com.houzhenguo.domain.Account;
import com.houzhenguo.domain.Role;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMyBatis {

    /**
     * 测试查询
     * @throws Exception
     */
    @Test
    public void run1() throws Exception {
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        IRoleDao dao = session.getMapper(IRoleDao.class);
        // 查询所有数据
        List<Role> list = dao.findAll();
        for(Role role : list){
            System.out.println(role);
        }
        // 关闭资源
        session.close();
        in.close();
    }

    /**
     * 测试保存
     * @throws Exception
     */
    @Test
    public void run2() throws Exception {
        Role role = new Role();
        role.setName("熊大");
        role.setMoney(400d);

        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        IRoleDao dao = session.getMapper(IRoleDao.class);

        // 保存
        dao.saveRole(role);

        // 提交事务
        session.commit();

        // 关闭资源
        session.close();
        in.close();
    }

}
