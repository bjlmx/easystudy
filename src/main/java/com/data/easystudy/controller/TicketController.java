package com.data.easystudy.controller;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.exceptions.ExceptionUtil;
import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.data.easystudy.entity.OitDispatchIntelligencePushInfo;
import com.data.easystudy.entity.OitDispatchIntelligencePushLog;
import com.data.easystudy.entity.Ticket;
import com.data.easystudy.entity.enums.OrderTypesEnums;
import com.data.easystudy.entity.enums.RegionEnums;
import com.data.easystudy.entity.utils.Result;
import com.data.easystudy.entity.utils.ResultGenerator;
import com.data.easystudy.exceptions.DevException;
import com.data.easystudy.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @author Baijl
 * 2020/6/2
 * 13:44
 * @description
 */
@RestController
@RequestMapping("ticket")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @PostMapping("save")
    public Result save(@RequestBody @Valid Ticket ticket, BindingResult bindingResult){
        System.out.println(ticket);
        if (bindingResult.hasErrors()) {
            return ResultGenerator.genFailResult(bindingResult.getAllErrors().get(0).getDefaultMessage());
        }
        //Assert.notNull(ticket.getDatetime(),"上映时间为空");
            //if(ObjectUtil.isNull(ticket.getDatetime())){
            //    throw DevException.get("参数异常：上映时间为空");
            //}
            ////Ticket ticket = new Ticket();
            ////ticket.setTicketId(3);
            ////ticket.setRoom("意大利厅");
            ////ticket.setRow(2);
            ////ticket.setCol(14);
            ////ticket.setFilmName("流浪地球");
            ////ticket.setPrice(new BigDecimal("100"));
            ////ticket.setDatetime(DateUtil.toLocalDateTime(DateTime.now()));
            //ticket.setDatetime(DateUtil.toLocalDateTime(DateTime.now()));
            //ticketService.save(ticket);
            return ResultGenerator.genSuccessResult();

    }


    @GetMapping("list")
    public Result list(){
        List<Ticket> list = ticketService.list();
        return ResultGenerator.genSuccessResult("list",list);
    }

    @GetMapping("saveBatch")
    public Result insertBatch(){
        Ticket ticket = new Ticket();
        ticket.setTicketId(1);
        ticket.setRoom("建设银行厅");
        ticket.setRow(2);
        ticket.setCol(9);
        ticket.setFilmName("我和我的祖国");
        ticket.setPrice(new BigDecimal("25"));
        ticket.setDatetime(DateUtil.toLocalDateTime(DateTime.now()));

        Ticket ticket2 = new Ticket();
        ticket2.setTicketId(2);
        ticket2.setRoom("工商银行厅");
        ticket2.setRow(3);
        ticket2.setCol(8);
        ticket2.setFilmName("大赢家");
        ticket2.setPrice(new BigDecimal("25"));
        ticket2.setDatetime(DateUtil.toLocalDateTime(DateTime.now()));
        List<Ticket> tickets = Arrays.asList(ticket, ticket2);
        ticketService.saveOrUpdateBatch(tickets);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("update")
    public void update(@RequestBody Ticket ticket){
        Assert.notNull(ticket.getTicketId(),"用户编号为空");
        ticket.setDatetime(DateUtil.toLocalDateTime(DateTime.now()));
        this.ticketService.updateById(ticket);
    }

    public static void main(String[] args) {
        //ArrayList<String> citys = new ArrayList<>(10);
        //citys.add("杭州");
        //citys.add("北京");
        //citys.add("上海");
        //citys.add("广州");
        //citys.add("深圳");
        //Random random = new Random();
        //System.out.println(random.nextInt(citys.size()));
        //String s = citys.get(random.nextInt(citys.size()));
        //System.out.println("你的幸运城市是"+s);
        LocalDate of = LocalDate.of(2020, 07, 18);
        System.out.println(of.toString());


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        HashMap<String, Object> param = new HashMap<>();
        param.put("authUserId","17463");
        param.put("userName","望断和");
        param.put("longitude","119.708174");
        param.put("latitude","29.792548");
        String url="http://192.168.86.176:8088/oit/dms/privateOrder/match";
        String str = JSONUtil.toJsonStr(param);
        String body = HttpRequest.post(url).body(str).execute().body();
        Map returnMap = (Map) JSONUtil.parse(body);
        System.out.println(returnMap);
        Map data = (Map) returnMap.get("data");
        //String orderNo = (String) data.get("orderNo");
        //System.out.println(orderNo);
        List<Map> orders = (List) data.get("orders");
        Integer pushStatus = (Integer) data.get("pushStatus");

        OitDispatchIntelligencePushLog oitDispatchIntelligencePushLog = new OitDispatchIntelligencePushLog();
        //推送时间
        oitDispatchIntelligencePushLog.setPushTime(LocalDateTime.now());
        //司机姓名
        oitDispatchIntelligencePushLog.setDriverName("后端查询");
        //车牌号
        oitDispatchIntelligencePushLog.setLicensePlate("前端传入");
        //当时推送订单数
        oitDispatchIntelligencePushLog.setOrderNumbers(orders.size());
        //推送类型
        if(0==pushStatus){
            oitDispatchIntelligencePushLog.setPushType(1);
            oitDispatchIntelligencePushLog.setPushTypeName("离厂推送");
        }else {
            oitDispatchIntelligencePushLog.setPushType(2);
            oitDispatchIntelligencePushLog.setPushTypeName("无任务推送");
        }
        //离厂时间(前端传入)
        oitDispatchIntelligencePushLog.setLeaveDoors(LocalDateTime.now());
        //本次请求到期时间
        //LocalDateTime expireTime = (LocalDateTime) data.get("expireTime");
        //oitDispatchIntelligencePushLog.setExpireTime(LocalDateTime.parse(expireTime,dateTimeFormatter));
        //oitDispatchIntelligencePushLog.setExpireTime(expireTime);

        //订单详情list
        ArrayList<OitDispatchIntelligencePushInfo> oitDispatchIntelligencePushInfos = new ArrayList<>();
        for (Map order : orders) {
            OitDispatchIntelligencePushInfo oitDispatchIntelligencePushInfo = new OitDispatchIntelligencePushInfo();
            //做箱时间
            String makeBokTime = (String) order.get("makeBokTime");
            oitDispatchIntelligencePushInfo.setMakeBokTime(LocalDateTime.parse(makeBokTime,dateTimeFormatter));
            //订单号
            String orderNo = (String) order.get("orderNo");
            oitDispatchIntelligencePushInfo.setOrderNo(orderNo);
            //箱型
            String containerSize = (String) order.get("containerSize");
            oitDispatchIntelligencePushInfo.setContainerSize(containerSize);
            //箱关系
            Integer containerType = (Integer) order.get("containerType");
                oitDispatchIntelligencePushInfo.setBoxType(containerType);
                oitDispatchIntelligencePushInfo.setBoxTypeName(OrderTypesEnums.parse(containerType).getName());
            //预计货重
            Double cargoWeight = (Double) order.get("cargoWeight");
            oitDispatchIntelligencePushInfo.setExpectCargoWeight(new BigDecimal(cargoWeight.toString()));
            //门点地址
            String gateAddress = (String) order.get("gateAddress");
            Map gateAddressMap = JSONUtil.parseObj(gateAddress);
            String gateId = (String) gateAddressMap.get("gateId");//门点id
            String address = (String) gateAddressMap.get("address");//门点地址
            oitDispatchIntelligencePushInfo.setGateId(gateId);
            oitDispatchIntelligencePushInfo.setGateAddress(address);
            //港区地址
            String suitcaseAddress = (String) order.get("suitcaseAddress");
            Map suitcaseAddressMap = JSONUtil.parseObj(suitcaseAddress);
            String suitcaseAddressId = (String) suitcaseAddressMap.get("addressId");//港区id
            String suitcaseRegion = (String) suitcaseAddressMap.get("region");//港区所属区域
            oitDispatchIntelligencePushInfo.setHarbour(suitcaseAddressId);
            oitDispatchIntelligencePushInfo.setHarbourName(RegionEnums.parseCode(Integer.parseInt(suitcaseRegion)));
            //堆场地址
            String returnAddress = (String) order.get("returnAddress");
            Map returnAddressMap = JSONUtil.parseObj(suitcaseAddress);
            String returnAddressId = (String) returnAddressMap.get("addressId");//堆场id
            String returnRegion = (String) returnAddressMap.get("region");//堆场所属区域
            oitDispatchIntelligencePushInfo.setYard(returnAddressId);
            oitDispatchIntelligencePushInfo.setYardName(returnRegion);
            //推送规则
            String pushRules = (String) order.get("pushRules");
            oitDispatchIntelligencePushInfo.setPushRule(pushRules);
            //预计提前到厂小时数
            Double expectGetHours = (Double) order.get("expectGetHours");
            oitDispatchIntelligencePushInfo.setExpectArriveDoor(new BigDecimal(expectGetHours.toString()));
            oitDispatchIntelligencePushInfos.add(oitDispatchIntelligencePushInfo);
            //预期到厂时间
            String expectGetTime = (String) order.get("expectGetTime");
            oitDispatchIntelligencePushInfo.setExpectArriveDoorTime(LocalDateTime.parse(expectGetTime,dateTimeFormatter));

        }
        System.out.println("订单明细集合已经完成");
    }


    @PostMapping("testAsync")
    public void testAsync( String fileName){
        ticketService.testAsync(fileName);
    }
}
