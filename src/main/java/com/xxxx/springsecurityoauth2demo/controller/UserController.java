package com.xxxx.springsecurityoauth2demo.controller;

import com.xxxx.springsecurityoauth2demo.model.req.ReqUser;
import com.xxxx.springsecurityoauth2demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 描述：User资源服务器 UserController
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 得到所有用户列表，所有权限可以访问
     * @return
     */
    @PostMapping("/users")
    public Object getAllUsers() {
        return userService.getAllUsers();
    }

    /**
     * 增加用户，只有权限为admin的用户才可以访问
     */
    @PostMapping("/save")
    public Object save(@RequestBody ReqUser reqUser) {
        return userService.save(reqUser);
    }
}
