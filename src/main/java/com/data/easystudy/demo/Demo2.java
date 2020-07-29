package com.data.easystudy.demo;

import cn.hutool.core.util.StrUtil;

/** @author Baijl
 * 2020/7/28 
 * 14:40 
 * @description
 */
public class Demo2 {
    public static void main(String[] args) {
        boolean hasBlank = StrUtil.hasBlank("字符串");
        System.out.println(hasBlank);
        //字符串格式化
        String format = StrUtil.format("{},是我最好的朋友", "马秀");
        System.out.println(format);
    }
}
