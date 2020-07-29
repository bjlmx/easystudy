package com.data.easystudy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * VIP司机智能推送记录详情表(OitDispatchIntelligencePushInfo)实体类
 *
 * @author Baijl
 * @since 2020-07-17 15:03:03
 */
@Data
@TableName("oit_dispatch_intelligence_push_info")
public class OitDispatchIntelligencePushInfo implements Serializable {
    private static final long serialVersionUID = -45271484196985712L;
    /**
    * 主键
    */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
    * 推送记录id
    */
    private Integer pushId;
    /**
    * 做箱时间
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime makeBokTime;
    /**
    * 订单编号
    */
    private String orderNo;
    /**
    * 箱关系名称
    */
    private String boxTypeName;
    /**
    * 箱关系类型:1小柜、2大柜、3散货、4其他、5洋山带箱、6双托
    */
    private Integer boxType;
    /**
     * 箱型
     */
    private String containerSize;
    /**
    * 距离（米）
    */
    private BigDecimal distance;
    /**
    * 预计货重
    */
    private BigDecimal expectCargoWeight;
    /**
    * 门点id（拼车需求预留，下同）
    */
    private String gateId;
    /**
    * 门点地址
    */
    private String gateAddress;
    /**
    * 港区id（拼车需求预留，下同）
    */
    private String harbour;
    /**
    * 堆场id
    */
    private String yard;
    /**
    * 堆场名称（拼车需求预留，下同）
    */
    private String yardName;
    /**
    * 港区名称
    */
    private String harbourName;
    /**
    * 推送规则
    */
    private String pushRule;
    /**
    * 预计提前到厂（小时）
    */
    private BigDecimal expectArriveDoor;
    /**
    * 创建时间
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    /**
    * 创建人id
    */
    private Integer createPersonId;
    /**
    * 创建人姓名
    */
    private String createPersonName;
    /**
    * 修改时间
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modifyTime;
    /**
    * 修改人id
    */
    private Integer modifyPersonId;
    /**
    * 修改人姓名
    */
    private String modifyPersonName;
    /**
    * 预计提前到厂时间
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime expectArriveDoorTime;

}