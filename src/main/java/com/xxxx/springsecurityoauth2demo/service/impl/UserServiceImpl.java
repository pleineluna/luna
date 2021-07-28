package com.xxxx.springsecurityoauth2demo.service.impl;

import com.xxxx.springsecurityoauth2demo.model.dao.UserMapper;
import com.xxxx.springsecurityoauth2demo.model.pojo.User;
import com.xxxx.springsecurityoauth2demo.model.req.ReqUser;
import com.xxxx.springsecurityoauth2demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述：UserServiceImpl
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public Object getAllUsers() {
        List<User> users = userMapper.selectAllUsers();
        return users;
    }

    @Override
    public User getUserByUserName(String username) {
        return userMapper.selectUserByUsername(username);
    }

    @Override
    public Object save(ReqUser reqUser) {
        int count = userMapper.save(reqUser);
        return count;
    }


}
