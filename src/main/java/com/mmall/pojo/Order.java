package com.mmall.pojo;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

//使用了lombok的无参构造器，不需要声明方法
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer id;

    private Long orderNo;

    private Integer userId;

    private Integer shippingId;

    private BigDecimal payment;

    private Integer paymentType;

    private Integer postage;

    private Integer status;

    private Date paymentTime;

    private Date sendTime;

    private Date endTime;

    private Date closeTime;

    private Date createTime;

    private Date updateTime;

}