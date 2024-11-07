package com.yf.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yf.domain.enums.AppHttpCodeEnum;

import java.io.Serializable;

/**
 * @author: biyunfei3
 * @create: 2024-11-07 14:08
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseResult <T> implements Serializable {

    private Integer code;

    private String msg;

    private T data;

    public ResponseResult() {
        this.code = AppHttpCodeEnum.SUCCESS.getCode();
        this.msg = AppHttpCodeEnum.SUCCESS.getMsg();
    }

    public ResponseResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseResult(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
