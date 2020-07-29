package com.data.easystudy.exceptions;

import cn.hutool.core.exceptions.ExceptionUtil;
import com.data.easystudy.entity.utils.Result;
import com.data.easystudy.entity.utils.ResultGenerator;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Baijl
 * 2020/6/8
 * 11:37
 * @description
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Result get(DevException e){
        return ResultGenerator.genFailResult("统一异常处理 "+ExceptionUtil.getSimpleMessage(e));
    }
}
