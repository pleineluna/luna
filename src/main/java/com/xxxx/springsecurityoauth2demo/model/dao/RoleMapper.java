package com.xxxx.springsecurityoauth2demo.model.dao;

import com.xxxx.springsecurityoauth2demo.model.pojo.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}