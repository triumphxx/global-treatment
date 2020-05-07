package org.triumphxx.globaltreatment.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.triumphxx.globaltreatment.response.Result;

/**
 * @author:triumphxx
 * @Date:2020/5/4
 * @Time:4:38 下午
 * @desc:全局异常处理类
 **/
@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result presses(Exception exception){
        if (exception instanceof NullPointerException){
            return Result.error(404,"发生了空指针异常");
        }
        else if (exception instanceof ArithmeticException){
            return Result.error(404,"发生了算术异常");
        }
        return Result.error(500,"发生了未知的异常");
    }
}
