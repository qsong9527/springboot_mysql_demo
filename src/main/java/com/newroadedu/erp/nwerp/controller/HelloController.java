package com.newroadedu.erp.nwerp.controller;


import com.newroadedu.erp.nwerp.dao.DepartmentRepository;
import com.newroadedu.erp.nwerp.dao.RoleRepository;
import com.newroadedu.erp.nwerp.dao.UserRepository;
import com.newroadedu.erp.nwerp.domain.Department;
import com.newroadedu.erp.nwerp.domain.Role;
import com.newroadedu.erp.nwerp.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public String helloWorld() {

        // SELECT user.id, user.name, user.create_date, role.name as role FROM user
        // LEFT JOIN user_role ON user.id=user_role.user_id
        // LEFT JOIN role ON user_role.role_id=role.id;
        Department department = new Department();
        department.setName("开发部");
        departmentRepository.save(department);

        Role role = new Role();
        role.setName("管理员");
        roleRepository.save(role);

        User user = new User();
        user.setName("张婷");
        user.setCreateDate(new Date());
        user.setDepartment(department);
        List<Role> roles = roleRepository.findAll();
        user.setRoles(roles);
        userRepository.save(user);


        return "Hello World";
    }
}
