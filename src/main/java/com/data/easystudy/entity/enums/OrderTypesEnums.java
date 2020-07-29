
 /**************************************************************************
* Copyright (c) 2006-2018 ZheJiang Electronic Port, Inc.
* All rights reserved.
*
* 项目名称：中国集装箱物流运力平台
* 版权说明：本软件属浙江电子口岸有限公司所有，在未获得浙江电子口岸有限公司正式授权
*           情况下，任何企业和个人，不能获取、阅读、安装、传播本软件涉及的任何受知
*           识产权保护的内容。
***************************************************************************/
package com.data.easystudy.entity.enums;


 /**
  * 类型
  * @author wanghuan
  * @version 1.0   
  * @since JDK1.8
  */
public enum OrderTypesEnums {
	//无
	DEFUAL("无"),
	//小柜
	SMALL("小柜"),
	//大柜
	BIG("大柜"),
	//散货
	SCATTERED("散货"),
	//其他
	OTHER("其他"),
	//洋山带箱
	YANGSHAN("洋山带箱"),
	//双托
	DOUBLE_CONSIGN("双托");
	/**
	 * name
	 */
	private String name;
	
	OrderTypesEnums(String name){
		this.name = name;
	}
	 /**
     * 方法说明：
     *
     * @param i 参数
     * @return 枚举值
     */
	public static OrderTypesEnums parse(Integer i) {
		for (OrderTypesEnums v : OrderTypesEnums.values()) {
	        if (v.ordinal()==i) {
	            return v;
	        }
	    }
	    return null;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
}
