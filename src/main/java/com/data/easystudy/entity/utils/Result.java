package com.data.easystudy.entity.utils;

/** @author Baijl
 * @date 2020-04-20
 * @time 11:20
 * @description
 */
/*
统一响应结果封装及生成工具
 */

import com.data.easystudy.entity.enums.ResultCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一API响应结果封装
 */
@Setter
@Getter
@ToString
public class Result {
    private int code;
    private String message;
    private Map<String,Object> data;

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result addResult(int code, String message, String key, Object data) {
        this.code = code;
        this.message = message;
        HashMap<String, Object> dataList = new HashMap<>();
        dataList.put(key,data);
        this.data=dataList;
        return this;
    }

    public Result() {
        this.code=ResultCode.FAIL.getCode();
        this.message=ResultCode.FAIL.getMessage();
    }
    public Result addResult(String key, Object data) {
        this.code= ResultCode.SUCCESS.getCode();
        this.data.put(key,data);
        HashMap<String, Object> dataList = new HashMap<>();
        dataList.put(key,data);
        this.data=dataList;
        return this;
    }
}
