package com.data.easystudy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * VIP司机智能推送记录表(OitDispatchIntelligencePushLog)实体类
 *
 * @author Baijl
 * @since 2020-07-17 15:03:05
 */
@Data
@TableName("oit_dispatch_intelligence_push_log")
public class OitDispatchIntelligencePushLog implements Serializable {
    private static final long serialVersionUID = 127856987017465186L;
    /**
    * 主键
    */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
    * 推送时间
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime pushTime;
    /**
    * 司机id
    */
    private Integer driverId;
    /**
    * 司机姓名
    */
    private String driverName;
    /**
    * 车牌号
    */
    private String licensePlate;
    /**
    * 当时推送订单数
    */
    private Integer orderNumbers;
    /**
    * 推送类型 1离厂推送 2无任务推送
    */
    private Integer pushType;
    /**
    * 离开门点时间点
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime leaveDoors;
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
     * 经度
     */
    private String longitude;
    /**
     * 纬度
     */
    private String latitude;
    /**
     * 车辆类型
     */
    private String trackType;
    /**
     * 推送类型名称
     */
    @TableField(exist = false)
    private String pushTypeName;
    /**
     * 做箱时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime makeBokTime;
    /**
     * 门点id
     */
    private Integer gateId;
    /**
     * 工厂地址
     */
    private String gateAddress;
    /**
     * 港区
     */
    private String harbour;
    /**
     *港区名称
     */
    private String harbourName;
    /**
     * 本次推送超时时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime expireTime;

}