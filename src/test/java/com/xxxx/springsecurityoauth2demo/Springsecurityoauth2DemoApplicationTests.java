package com.xxxx.springsecurityoauth2demo;

import com.xxxx.springsecurityoauth2demo.model.pojo.User;
import com.xxxx.springsecurityoauth2demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class Springsecurityoauth2DemoApplicationTests {
    @Resource
    private UserService userService;
    @Test
    public void getAll() {
        List<User> allUsers = (List<User>) userService.getAllUsers();
        for (User user : allUsers) {
            System.out.println(user.getName());
            System.out.println(user.getAccount());
        }
        System.out.println("``````````");
        System.out.println(userService.getUserByUserName("admin").getName());


    }

}
