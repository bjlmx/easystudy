package com.data.easystudy.entity.enums;

/** @author Baijl
 * 2020/7/15
 * 11:23
 * @description 港区/堆场所属区域枚举
 */
public enum RegionEnums {
    /**
     * 空
     */
    KONG("",1),
    /**
     * 浦西
     */
    PUXI("浦西",2),
    /**
     * 洋山
     */
    YANGSHAN("洋山",3),
    /**
     * 外高桥
     */
    WAIGAOQIAO("外高桥",4);


    /**
     * 所属区域
     */
    private String region;
    /**
     * 所属区域code
     */
    private Integer code;

    RegionEnums(String region, Integer code) {
        this.region = region;
        this.code = code;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
    /**
     * 根据code找到所属区域
     * @param region
     * @return integer
     */
    public static Integer parseRegion(String region) {
        for (RegionEnums value : RegionEnums.values()) {
            if(value.region.equals(region)){
                return value.code;
            }
        }
        return null;
    }

    /**
     * 根据所属区域找到code
     * @param code
     * @return
     */
    public static String parseCode(Integer code){
        for (RegionEnums value : RegionEnums.values()) {
            if(value.code.equals(code)){
                return value.region;
            }
        }
        return null;
    }

}
