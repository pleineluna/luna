package com.xxxx.springsecurityoauth2demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


/**
 * 描述：Security核心配置类
 * 1.重写configure(HttpSecurity http)
 * 2.配置 PasswordEncoder的Ioc注入。
 */
@Configuration
@EnableWebSecurity //开启Web Security
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //配置没有权限访问跳转自定义页面
        http.exceptionHandling().accessDeniedPage("/unauth.html");

        http.authorizeRequests()
                //放行授权服务器的几个端点请求、登录请求、登出请求。
                .antMatchers("/oauth/**", "/login/**", "/logout/**")
                .permitAll()
                .anyRequest()
                .authenticated()
                //.and() 就相当于回到 http再继续配置
                .and()
                //放行所有的表单请求
                .formLogin()
                .permitAll()
                .and()
                //关闭csrf
                .csrf().disable();


    }

    /**
     * 密码授权模式用到的AuthenticationManager类
     *
     * @return
     * @throws Exception
     */
    @Override
    @Bean
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
