package com.data.easystudy.exceptions;

/**
 * @author Baijl
 * 2020/6/8
 * 10:22
 * @description
 */
public class DevException extends RuntimeException{
    private DevException(String message) {
        super(message);
    }

    public static DevException get(String message){
       return new DevException(message);
    }
}
