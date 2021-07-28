package com.xxxx.springsecurityoauth2demo.config;

import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述：配置JwtTokenEnhancer添加自定义信息 ,继承TokenEnhancer实现一个JWT内容增强器
 */
public class JwtTokenEnhancer implements TokenEnhancer {
    /**
     * JWT内容增强器
     * @param oAuth2AccessToken
     * @param oAuth2Authentication
     * @return
     */
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {
        Map<String, Object> info = new HashMap();
        info.put("enhance", "增强的信息");
        //给的参数是oAuth2的AccessToken，实现类是DefaultOAuth2AccessToken，
        //里面有个setAdditionalInformation方法添加自定义信息（Map类型）
        ((DefaultOAuth2AccessToken) oAuth2AccessToken).setAdditionalInformation(info);
        return oAuth2AccessToken;
    }
}

