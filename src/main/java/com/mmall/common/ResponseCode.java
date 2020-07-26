package com.mmall.common;

/**
 * Created by jiaqi on 7/14/20.
 */


//关键字：enum, 枚举常量之间用逗号分隔。
//枚举常量：即枚举类下的对象，每个枚举类包含0个到多个枚举常量。
//不需要实例化枚举类就可以访问枚举常量
public enum ResponseCode {

    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    NEED_LOGIN(10,"NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2,"ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;


    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }
    public String getDesc(){
        return desc;
    }

}
