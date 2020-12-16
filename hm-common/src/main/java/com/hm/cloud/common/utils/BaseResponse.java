package com.hm.cloud.common.utils;

import lombok.Data;

import java.io.Serializable;

/**
　* @Description: TODO
　* @author Coder编程
　* @date 2020/12/4 14:42
　*/

@Data
public class BaseResponse<T> implements Serializable {

    public static final String RESPONSE_SUCCESS = "Y";
    public static final String RESPONSE_FAILED = "N";

    /**
     * 接口返回码
     * 成功是R_0。其余的都是失败
     */
    private String code;
    /**
     * 返回码描述
     */
    private String message;
    /**
     * 返回数据
     */
    private T result;
    /**
     * 请求相应状态返回（Y:N）
     */
    private String ifSuccess;

    public BaseResponse(){super();}
    /**
     * 有参构造
     * @param code
     * @param message
     * @param result
     * @param ifSuccess
     */
    public BaseResponse(String code, String message, T result, String ifSuccess) {
        super();
        this.code = code;
        this.message = message;
        this.result = result;
        this.ifSuccess = ifSuccess;
    }


    /**
     * 请求失败返回实例方法
     * @param code
     * @param message
     */
    public void failResponse(String code,String message){
        this.ifSuccess = RESPONSE_FAILED;
        this.message = message;
        this.code = code;
    }

    /**
     * 请求成功返回实例方法
     * @param code
     * @param message
     */
    public void successResponse(String code,String message){
        this.ifSuccess = RESPONSE_SUCCESS;
        this.message = message;
        this.code = code;
    }

}
