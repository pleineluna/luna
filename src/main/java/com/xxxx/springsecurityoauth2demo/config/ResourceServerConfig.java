package com.xxxx.springsecurityoauth2demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * 描述：资源管理器 @EnableResourceServer，extends ResourceServerConfigurerAdapter
 * 为了模拟，授权服务器和资源服务器放在了一起，正常情况是解耦的。
 */
@Configuration
@EnableResourceServer //开启资源服务器
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.requestMatchers().antMatchers("/api/**","/user/**").and()
                .authorizeRequests()//授权的请求
                //进行接口的鉴权处理
                .antMatchers("/api/user/save").hasAuthority("admin")
                //其余接口不做鉴权，只需要认证即可
                .anyRequest()
                .authenticated();

    }
}