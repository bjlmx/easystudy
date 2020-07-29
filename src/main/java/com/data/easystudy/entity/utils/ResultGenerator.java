package com.data.easystudy.entity.utils;

/** @author Baijl
 * @date 2020-04-20
 * @time 11:28
 * @description
 */


import com.data.easystudy.entity.enums.ResultCode;

/**
 * 响应结果生成工具
 */
public class ResultGenerator {

    public static Result genSuccessResult() {
        return new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage());
    }

    public static Result genSuccessResult(String key,Object data) {
        Result result = new Result();
        Result res = result.addResult(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), key, data);
        return res;

    }

    public static Result genFailResult(String message) {

        Result result = new Result(ResultCode.FAIL.getCode(), message);
        return result;
    }
    public static Result genFailResult() {
       return new Result();
    }
}
