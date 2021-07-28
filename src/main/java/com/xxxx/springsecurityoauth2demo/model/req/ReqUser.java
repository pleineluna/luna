package com.xxxx.springsecurityoauth2demo.model.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述：User请求参数对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReqUser {
    private String account;

    private String description;

    private String password;

    private String name;
}
