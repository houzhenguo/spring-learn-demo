package com.houzhenguo.service.impl;

import com.houzhenguo.dao.IRoleDao;
import com.houzhenguo.domain.Role;
import com.houzhenguo.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("roleService")
public class IRoleServiceImpl implements IRoleService {
    @Autowired
    IRoleDao roleDao;

    @Override
    public List<Role> findAll() {
        System.out.printf("service find all ");
        return roleDao.findAll();
    }

    @Override
    public void saveRole(Role role) {
        System.out.printf("service save role");
        roleDao.saveRole(role);
    }
}
