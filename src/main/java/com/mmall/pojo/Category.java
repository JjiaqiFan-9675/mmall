package com.mmall.pojo;

import lombok.*;

import java.util.Date;
//使用了lombok的无参构造器，不需要声明方法
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// 代替了关于id的override
@EqualsAndHashCode(of = "id") //如果是多参数: of = {"id", "name"}
//@ToString(exclude = "id")
public class Category {
    private Integer id;

    private Integer parentId;

    private String name;

    private Boolean status;

    private Integer sortOrder;

    private Date createTime;

    private Date updateTime;
}