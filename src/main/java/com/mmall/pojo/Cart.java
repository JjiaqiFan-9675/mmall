package com.mmall.pojo;

import lombok.*;

import java.util.Date;

//使用了lombok的无参构造器，不需要声明方法

// @Data包含范围很大,包括@Getter, @Setter, @EqualsAndHashCode, @ToString…
// 不包括@NoArgsConstructor, @AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    private Integer id;

    private Integer userId;

    private Integer productId;

    private Integer quantity;

    private Integer checked;

    private Date createTime;

    private Date updateTime;
}