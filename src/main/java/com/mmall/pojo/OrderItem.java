package com.mmall.pojo;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;


//使用了lombok的无参构造器，不需要声明方法
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class OrderItem {
    private Integer id;

    private Long orderNo;

    private Integer productId;

    private String productName;

    private String productImage;

    private BigDecimal currentUnitPrice;

    private Integer quantity;

    private BigDecimal totalPrice;

    private Date createTime;

    private Date updateTime;

    private Integer userId;
}