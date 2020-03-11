package com.houzhenguo.service;

import com.houzhenguo.domain.Role;

import java.util.List;

public interface IRoleService {
    List<Role> findAll();
    void saveRole(Role role);
}
