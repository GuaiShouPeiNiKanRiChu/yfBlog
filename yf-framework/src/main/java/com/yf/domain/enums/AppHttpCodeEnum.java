package com.yf.domain.enums;

/**
 * @author: biyunfei3
 * @create: 2024-11-07 14:28
 **/

public enum AppHttpCodeEnum {

    SUCCESS(200, "操作成功"),

    SYSTEM_ERROR(500, "出现错误");

   private int code;

   private String msg;

    AppHttpCodeEnum(int code, String errorMessage) {
        this.code = code;
        this.msg = errorMessage;
    }

    public int getCode(){
        return code;
    }

    public String getMsg(){
        return msg;
    }
}
