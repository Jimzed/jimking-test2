package com.jimking.test2.controller;

import com.jimking.test2.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author qushihan
 * @date 2020/11/12
 * @desc
 * @since 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    @GetMapping("/get/name")
    public String getUserName() {
        System.out.println("232323");
        String name = userService.getUserName(111, "123");
        System.out.println("名称：" + name);
        return name;
    }

    @GetMapping("/get/age")
    public Integer getUserAge() {
        Integer age = 18;
        System.out.println("年龄：" + age);
        return age;
    }
}
