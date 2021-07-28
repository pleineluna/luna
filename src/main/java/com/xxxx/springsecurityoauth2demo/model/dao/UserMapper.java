package com.xxxx.springsecurityoauth2demo.model.dao;

import com.xxxx.springsecurityoauth2demo.model.pojo.User;
import com.xxxx.springsecurityoauth2demo.model.req.ReqUser;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAllUsers();

    User selectUserByUsername(String username);

    int save(ReqUser reqUser);
}