package com.mmall.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

//使用了lombok的无参构造器，不需要声明方法
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

//为什么使用接口： 防止Spring session 使user序列化出问题
public class User implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String email;

    private String phone;

    private String question;

    private String answer;

    private Integer role;

    private Date createTime;

    private Date updateTime;

}