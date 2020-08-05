package com.data.easystudy.demo;

import cn.hutool.core.text.StrBuilder;
import cn.hutool.core.text.StrSpliter;

import java.time.LocalDate;
import java.util.List;

/** @author Baijl
 * 2020/7/30 
 * 14:25 
 * @description
 */
public class Demo4 {
    public static void main(String[] args) {
        StrBuilder append = StrBuilder.create("起始字符串").append("第一次").append("第二次").append("第三次");
        System.out.println(append);
        StrBuilder reset = append.reset();
        System.out.println(reset);
        String s="1,2,3,4,5";
        //StrBuilder
        List<String> split = StrSpliter.split(s, ",", true, true);
        split.forEach(System.out::println);

        System.out.println(LocalDate.now());
    }
}
