package com.xxxx.springsecurityoauth2demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * 描述：TokenStore配置类。
 * TokenStore的实现类，有InMemoryTokenStore、JdbcTokenStore、JwtTokenStore、RedisTokenStore。
 * JwtAccessTokenConverter JWT访问令牌转换器和 JwtTokenStore JWT令牌存储组件
 */
@Configuration
public class JwtTokenStoreConfig {
    /**
     * 生成TokenStore来保存token  此处为JwtTokenStore实现
     * @return TokenStore
     */
    @Bean
    public TokenStore jwtTokenStore() {
        //需要传入JwtAccessTokenConverter
        return new JwtTokenStore(jwtAccessTokenConverter());
    }
    /**
     *  生成JwtAccessTokenConverter转换器，并设置密钥
     * @return JwtAccessTokenConverter
     */
    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        JwtAccessTokenConverter jwtAccessTokenConverter = new JwtAccessTokenConverter();
        //设置jwt密钥
        jwtAccessTokenConverter.setSigningKey("test_key");
        return jwtAccessTokenConverter;
    }

    /**
     * JwtTokenEnhancer的注入
     * @return
     */
    @Bean
    public JwtTokenEnhancer jwtTokenEnhancer() {
        return new JwtTokenEnhancer();
    }
}
