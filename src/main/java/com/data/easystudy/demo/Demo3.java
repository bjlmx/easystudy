package com.data.easystudy.demo;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.EnumUtil;
import cn.hutool.core.util.IdcardUtil;
import cn.hutool.core.util.ObjectUtil;
import com.data.easystudy.entity.enums.TestEnum;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/** @author Baijl
 * 2020/7/30 
 * 9:58 
 * @description
 */
public class Demo3 {
    public static void main(String[] args) {
        TestEnum result = EnumUtil.likeValueOf(TestEnum.class, "测试一");
        if(ObjectUtil.isNotNull(result)){
            System.out.println(result.getName());
        }
        //身份证验证工具
        System.out.println(IdcardUtil.getProvinceByIdCard("370883199470160719"));
        Pattern mobile = Validator.BIRTHDAY;
        System.out.println(mobile);
        boolean chinese = Validator.hasChinese("Chinese");
        System.out.println(chinese);
        Console.log("一条打印错误信息{}","哈哈哈");

        System.out.println(CollUtil.max(Arrays.asList(1,2,3,4,5,9,4,5)));
        CollUtil.distinct(Arrays.asList(1,2,3,4,5,9,4,5)).forEach(System.out::println);
        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);
        System.out.println("第三个是"+list.get(3));
    }
}
