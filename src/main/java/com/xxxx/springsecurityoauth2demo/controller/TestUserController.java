package com.xxxx.springsecurityoauth2demo.controller;


import io.jsonwebtoken.Jwts;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;

/**
 * 描述：UserController  模拟资源服务器用的，用来访问资源的。
 */
@RestController
@RequestMapping("/user")
public class TestUserController {

    //测试用的，不与数据库做连接
    @RequestMapping("/getCurrentUser")
    public Object getCurrentUser(Authentication authentication, HttpServletRequest request) {
        //Authorization是在请求头中的属性。
        String header = request.getHeader("Authorization");
        //bearer :jwt token,所以bearer加空格后的第七个才是token。
        String token = header.substring(header.lastIndexOf("bearer") + 7);
        return Jwts.parser()    
                .setSigningKey("test_key".getBytes(StandardCharsets.UTF_8))//指定编码格式，要不然token有中文转换异常
                .parseClaimsJws(token)
                .getBody();
    }


}
