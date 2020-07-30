package com.data.easystudy.entity.enums;

/** @author Baijl
 * 2020/7/30 
 * 10:03 
 * @description
 */
public enum TestEnum {
    TEST1("type1","测试一"), TEST2("type2","测试二"), TEST3("type3","测试三");

    private TestEnum(String type) {
        this.type = type;
    }
    private String name;

    TestEnum(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    public String getType() {
        return this.type;
    }
}
