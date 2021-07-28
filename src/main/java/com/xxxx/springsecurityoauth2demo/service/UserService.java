package com.xxxx.springsecurityoauth2demo.service;

import com.xxxx.springsecurityoauth2demo.model.pojo.User;
import com.xxxx.springsecurityoauth2demo.model.req.ReqUser;

/**
 * 描述：UserService接口
 */
public interface UserService {
    Object getAllUsers();

    User getUserByUserName(String username);

    Object save(ReqUser reqUser);
}
