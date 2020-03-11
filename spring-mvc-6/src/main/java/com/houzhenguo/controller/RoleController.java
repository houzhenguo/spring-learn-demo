package com.houzhenguo.controller;

import com.houzhenguo.domain.Role;
import com.houzhenguo.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("role")
public class RoleController {
    @Autowired
    private IRoleService roleService;

    @RequestMapping(value = "/findAll")
    public String findAll(Model model){
        System.out.println("controller findAll");
        List<Role> roleList = roleService.findAll();
        model.addAttribute("roles", roleList);
        return "list";
    }
    @RequestMapping("/saveRole")
    public void saveRole(Role role, HttpServletRequest request, HttpServletResponse response) throws Exception{
        roleService.saveRole(role);
        response.sendRedirect(request.getContextPath()+"/role/findAll");
        return;
    }
}
