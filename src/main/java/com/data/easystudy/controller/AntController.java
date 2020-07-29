package com.data.easystudy.controller;

import cn.com.antcloud.api.AntFinTechApiClient;
import cn.com.antcloud.api.AntFinTechProfile;
import cn.com.antcloud.api.shuziwuliu.v1_0_0.request.ApplyCreditmodeIssueclearRequest;
import cn.com.antcloud.api.shuziwuliu.v1_0_0.request.QueryCreditIssueamountRequest;
import cn.com.antcloud.api.shuziwuliu.v1_0_0.request.QueryCreditIssuereceivableRequest;
import cn.com.antcloud.api.shuziwuliu.v1_0_0.response.ApplyCreditmodeIssueclearResponse;
import cn.com.antcloud.api.shuziwuliu.v1_0_0.response.QueryCreditIssueamountResponse;
import cn.com.antcloud.api.shuziwuliu.v1_0_0.response.QueryCreditIssuereceivableResponse;
import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.data.easystudy.entity.enums.OrderTypesEnums;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Baijl
 * 2020/6/11
 * 20:07
 * @description 蚂蚁金服区块链接口
 */
@RestController
public class AntController {
    /**
     * 信⽤凭证主动清分
     * @throws InterruptedException
     */
    @GetMapping("cleanScore")
    public void cleanScore() throws InterruptedException {
        // 初始化客户端
        AntFinTechProfile profile = AntFinTechProfile.getProfile(
                "https://prodapigw.cloud.alipay.com",
                "<your-access-key>",
                "<your-access-secret>"
                );
        AntFinTechApiClient client = new AntFinTechApiClient(profile);

        // 构建请求
        ApplyCreditmodeIssueclearRequest request = new ApplyCreditmodeIssueclearRequest();
        request.setApplyDate("123");
        request.setClearAmt("123.67");
        request.setClearDid("did:mychain:11119abde09890ad6c40a5f9ba96fcb33ca134c6c29efdbbc743549e62c12222");
        request.setExtInfo("23");
        request.setGroupPlatformDid("did:mychain:11119abde09890ad6c40a5f9ba96fcb33ca134c6c29efdbbc743549e62c12222");
        request.setIssueId("123123");
        request.setModeType("B");
        request.setOutBizNo("123123");
        request.setOutOrderNo("123");
        request.setPlatformDid("did:mychain:11119abde09890ad6c40a5f9ba96fcb33ca134c6c29efdbbc743549e62c12222");
        request.setProductId("PRODUCT_MYBANK");
        request.setProductInstanceId("7304XXXXXXXX");
        request.setRegionName("CN-HANGZHOU-FINANCE");

        // 发送请求，并且获取响应结果
        ApplyCreditmodeIssueclearResponse response = client.execute(request);
    }

    /**
     * 信用凭证清分状态查询
     * @throws InterruptedException
     */
    @GetMapping("queryCreditLicenseStatus")
    public void queryCreditLicenseStatus() throws InterruptedException {
        // 初始化客户端
        AntFinTechProfile profile = AntFinTechProfile.getProfile(
                "https://prodapigw.cloud.alipay.com",
                "<your-access-key>",
                "<your-access-secret>"
                );
        AntFinTechApiClient client = new AntFinTechApiClient(profile);

        // 构建请求
        QueryCreditIssuereceivableRequest request = new QueryCreditIssuereceivableRequest();
        request.setGroupPlatformDid("did:mychain:fa142b66cb1dece6a36cd66081ceeece19674409149c32679f2e17ed2dd8312c");
        request.setIssueId("42344");
        request.setPlatformDid("did:mychain:fa142b66cb1dece6a36cd66081ceeece19674409149c32679f2e17ed2dd8312c");
        request.setProductId("PRODUCT_MYBANK");
        request.setProductInstanceId("7304XXXXXXXX");
        request.setRegionName("CN-HANGZHOU-FINANCE");

        // 发送请求，并且获取响应结果
        QueryCreditIssuereceivableResponse response = client.execute(request);
    }

    /**
     * 信⽤凭证资产查询
     * @throws InterruptedException
     */
    @GetMapping("queryCreditLicenseAssets")
    public void querycreditlicenseassets() throws InterruptedException {
        // 初始化客户端
        AntFinTechProfile profile = AntFinTechProfile.getProfile(
                "https://prodapigw.cloud.alipay.com",
                "<your-access-key>",
                "<your-access-secret>"
                );
        AntFinTechApiClient client = new AntFinTechApiClient(profile);

        // 构建请求
        QueryCreditIssueamountRequest request = new QueryCreditIssueamountRequest();
        request.setDid("did:mychain:fa142b66cb1dece6a36cd66081ceeece19674409149c32679f2e17ed2dd8312c");
        request.setGroupPlatformDid("did:mychain:fa142b66cb1dece6a36cd66081ceeece19674409149c32679f2e17ed2dd8312c");
        request.setIssueId("314123");
        request.setPlatformDid("did:mychain:fa142b66cb1dece6a36cd66081ceeece19674409149c32679f2e17ed2dd8312c");
        request.setProductId("PRODUCT_MYBANK");
        request.setProductInstanceId("7304XXXXXXXX");
        request.setRegionName("CN-HANGZHOU-FINANCE");

        // 发送请求，并且获取响应结果
        QueryCreditIssueamountResponse response = client.execute(request);
        System.out.println(response.getResultCode());

    }

    public static void main(String[] args) {
//        String dateStr = "2020-07-23 22:33:23";
//        Date date = DateUtil.parse(dateStr);
//
////一天的开始，结果：2017-03-01 00:00:00
//        Date beginOfDay = DateUtil.beginOfDay(date);
//
////一天的结束，结果：2017-03-01 23:59:59
//        Date endOfDay = DateUtil.endOfDay(date);
//        System.out.println(endOfDay.toString());
//        LocalDateTime of = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
//        System.out.println(of);
//        boolean after = of.isAfter(LocalDateTime.now());
//        System.out.println(after);

        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("1",null);
        stringObjectHashMap.put("2",null);
        stringObjectHashMap.put("3",null);

        System.out.println(stringObjectHashMap);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDate oldDate = LocalDateTime.parse("2020-07-24 10:05:20", dateTimeFormatter).toLocalDate();
        System.out.println(oldDate);
        LocalDate newDate = LocalDateTime.of(LocalDate.now(), LocalTime.MAX).toLocalDate();
        System.out.println(oldDate.isBefore(newDate));
        System.out.println("------------------");

        System.out.println(LocalDate.now());


        Map parse = (Map) JSONUtil.parse("{\n" +
                "    \"data\": {\n" +
                "        \"authUserId\": 17463,\n" +
                "        \"name\": \"望断和\",\n" +
                "        \"licensePlate\": \"\",\n" +
                "        \"vehicleType\": \"0\",\n" +
                "        \"vehicleSweepType\": \"1\",\n" +
                "        \"pushStatus\": 0,\n" +
                "        \"makeBokTime\": \"2020-07-23 14:59:59\",\n" +
                "        \"expireTime\": \"2020-07-24 18:19:14\",\n" +
                "        \"suitcaseAddress\": \"{\\\"address\\\":\\\"测试外港港区\\\",\\\"latitude\\\":\\\"30.324406\\\",\\\"region\\\":\\\"1\\\",\\\"longitude\\\":\\\"120.200667\\\",\\\"addressId\\\":\\\"1\\\"}\",\n" +
                "        \"gateAddress\": \"{\\\"address\\\":\\\"杭州市富阳区********东桥\\\",\\\"gateId\\\":\\\"4535\\\",\\\"latitude\\\":\\\"30.054723\\\",\\\"longitude\\\":\\\"119.966554\\\"}\",\n" +
                "        \"returnAddress\": \"{\\\"address\\\":\\\"外港\\\",\\\"latitude\\\":\\\"30.308304\\\",\\\"region\\\":\\\"1\\\",\\\"longitude\\\":\\\"120.092406\\\",\\\"addressId\\\":\\\"4\\\"}\",\n" +
                "        \"orderNo\": \"202007140000008-6\",\n" +
                "        \"orders\": [\n" +
                "            {\n" +
                "                \"makeBokTime\": \"2020-07-25 10:00:00\",\n" +
                "                \"expireTime\": \"2020-07-24 18:19:14\",\n" +
                "                \"orderNo\": \"202007140000008-25\",\n" +
                "                \"containerSize\": \"40GP\",\n" +
                "                \"containerType\": 2,\n" +
                "                \"cargoWeight\": 10.000,\n" +
                "                \"suitcaseAddress\": \"{\\\"address\\\":\\\"测试外港港区\\\",\\\"latitude\\\":\\\"30.318676549024\\\",\\\"region\\\":\\\"1\\\",\\\"longitude\\\":\\\"120.194115859887\\\",\\\"addressId\\\":\\\"1\\\"}\",\n" +
                "                \"gateAddress\": \"{\\\"address\\\":\\\"测试用门点地址长城街22号\\\",\\\"gateId\\\":\\\"5482\\\",\\\"latitude\\\":\\\"30.339150215942\\\",\\\"longitude\\\":\\\"120.185080393564\\\"}\",\n" +
                "                \"returnAddress\": \"{\\\"address\\\":\\\"测试外港港区\\\",\\\"latitude\\\":\\\"30.318676549024\\\",\\\"region\\\":\\\"1\\\",\\\"longitude\\\":\\\"120.194115859887\\\",\\\"addressId\\\":\\\"1\\\"}\",\n" +
                "                \"suitcaseGateInfo\": \"{\\\"unit\\\":\\\"3\\\",\\\"distance\\\":\\\"2923\\\",\\\"rest_time\\\":\\\"0\\\",\\\"time\\\":\\\"619\\\"}\",\n" +
                "                \"gateReturnInfo\": \"{\\\"unit\\\":\\\"3\\\",\\\"distance\\\":\\\"4941\\\",\\\"rest_time\\\":\\\"0\\\",\\\"time\\\":\\\"639\\\"}\",\n" +
                "                \"pushRules\": \"\",\n" +
                "                \"expectGetTime\": \"2020-07-25 05:22:36\",\n" +
                "                \"expectGetHours\": \"4.62\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"makeBokTime\": \"2020-07-25 10:00:00\",\n" +
                "                \"expireTime\": \"2020-07-24 18:19:14\",\n" +
                "                \"orderNo\": \"202007160000046-1\",\n" +
                "                \"containerSize\": \"40GP\",\n" +
                "                \"containerType\": 2,\n" +
                "                \"cargoWeight\": 16.000,\n" +
                "                \"suitcaseAddress\": \"{\\\"address\\\":\\\"测试外港港区\\\",\\\"latitude\\\":\\\"30.318676549024\\\",\\\"region\\\":\\\"1\\\",\\\"longitude\\\":\\\"120.194115859887\\\",\\\"addressId\\\":\\\"1\\\"}\",\n" +
                "                \"gateAddress\": \"{\\\"address\\\":\\\"测试用门点地址长城街22号\\\",\\\"gateId\\\":\\\"5482\\\",\\\"latitude\\\":\\\"30.339150215942\\\",\\\"longitude\\\":\\\"120.185080393564\\\"}\",\n" +
                "                \"returnAddress\": \"{\\\"address\\\":\\\"测试外港港区\\\",\\\"latitude\\\":\\\"30.318676549024\\\",\\\"region\\\":\\\"1\\\",\\\"longitude\\\":\\\"120.194115859887\\\",\\\"addressId\\\":\\\"1\\\"}\",\n" +
                "                \"suitcaseGateInfo\": \"{\\\"unit\\\":\\\"3\\\",\\\"distance\\\":\\\"2923\\\",\\\"rest_time\\\":\\\"0\\\",\\\"time\\\":\\\"619\\\"}\",\n" +
                "                \"gateReturnInfo\": \"{\\\"unit\\\":\\\"3\\\",\\\"distance\\\":\\\"4941\\\",\\\"rest_time\\\":\\\"0\\\",\\\"time\\\":\\\"639\\\"}\",\n" +
                "                \"pushRules\": \"\",\n" +
                "                \"expectGetTime\": \"2020-07-25 05:22:44\",\n" +
                "                \"expectGetHours\": \"4.62\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"makeBokTime\": \"2020-07-25 10:00:00\",\n" +
                "                \"expireTime\": \"2020-07-24 18:19:14\",\n" +
                "                \"orderNo\": \"202007160000046-8\",\n" +
                "                \"containerSize\": \"40GP\",\n" +
                "                \"containerType\": 2,\n" +
                "                \"cargoWeight\": 16.000,\n" +
                "                \"suitcaseAddress\": \"{\\\"address\\\":\\\"测试外港港区\\\",\\\"latitude\\\":\\\"30.318676549024\\\",\\\"region\\\":\\\"1\\\",\\\"longitude\\\":\\\"120.194115859887\\\",\\\"addressId\\\":\\\"1\\\"}\",\n" +
                "                \"gateAddress\": \"{\\\"address\\\":\\\"测试用门点地址长城街22号\\\",\\\"gateId\\\":\\\"5482\\\",\\\"latitude\\\":\\\"30.339150215942\\\",\\\"longitude\\\":\\\"120.185080393564\\\"}\",\n" +
                "                \"returnAddress\": \"{\\\"address\\\":\\\"测试外港港区\\\",\\\"latitude\\\":\\\"30.318676549024\\\",\\\"region\\\":\\\"1\\\",\\\"longitude\\\":\\\"120.194115859887\\\",\\\"addressId\\\":\\\"1\\\"}\",\n" +
                "                \"suitcaseGateInfo\": \"{\\\"unit\\\":\\\"3\\\",\\\"distance\\\":\\\"2923\\\",\\\"rest_time\\\":\\\"0\\\",\\\"time\\\":\\\"619\\\"}\",\n" +
                "                \"gateReturnInfo\": \"{\\\"unit\\\":\\\"3\\\",\\\"distance\\\":\\\"4941\\\",\\\"rest_time\\\":\\\"0\\\",\\\"time\\\":\\\"639\\\"}\",\n" +
                "                \"pushRules\": \"\",\n" +
                "                \"expectGetTime\": \"2020-07-25 05:22:36\",\n" +
                "                \"expectGetHours\": \"4.62\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"makeBokTime\": \"2020-07-30 00:00:00\",\n" +
                "                \"expireTime\": \"2020-07-24 18:19:14\",\n" +
                "                \"orderNo\": \"202007030000001-1\",\n" +
                "                \"containerSize\": \"20GP\",\n" +
                "                \"containerType\": 2,\n" +
                "                \"cargoWeight\": 1.000,\n" +
                "                \"suitcaseAddress\": \"{\\\"address\\\":\\\"测试外港港区\\\",\\\"latitude\\\":\\\"30.318676549024\\\",\\\"region\\\":\\\"1\\\",\\\"longitude\\\":\\\"120.194115859887\\\",\\\"addressId\\\":\\\"1\\\"}\",\n" +
                "                \"gateAddress\": \"{\\\"address\\\":\\\"西猫狗\\\",\\\"gateId\\\":\\\"5454\\\",\\\"latitude\\\":\\\"30.31830637083\\\",\\\"longitude\\\":\\\"120.195488220058\\\"}\",\n" +
                "                \"returnAddress\": \"{\\\"address\\\":\\\"测试外港港区\\\",\\\"latitude\\\":\\\"30.318676549024\\\",\\\"region\\\":\\\"1\\\",\\\"longitude\\\":\\\"120.194115859887\\\",\\\"addressId\\\":\\\"1\\\"}\",\n" +
                "                \"suitcaseGateInfo\": \"{\\\"unit\\\":\\\"3\\\",\\\"distance\\\":\\\"216\\\",\\\"rest_time\\\":\\\"0\\\",\\\"time\\\":\\\"67\\\"}\",\n" +
                "                \"gateReturnInfo\": \"{\\\"unit\\\":\\\"3\\\",\\\"distance\\\":\\\"1742\\\",\\\"rest_time\\\":\\\"0\\\",\\\"time\\\":\\\"323\\\"}\",\n" +
                "                \"pushRules\": \"\",\n" +
                "                \"expectGetTime\": \"2020-07-25 05:13:32\",\n" +
                "                \"expectGetHours\": \"114.77\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"makeBokTime\": \"2020-07-25 10:00:00\",\n" +
                "                \"expireTime\": \"2020-07-24 18:19:14\",\n" +
                "                \"orderNo\": \"202007200000014-1\",\n" +
                "                \"containerSize\": \"20GP\",\n" +
                "                \"containerType\": 2,\n" +
                "                \"cargoWeight\": 10.000,\n" +
                "                \"suitcaseAddress\": \"{\\\"address\\\":\\\"测试外港港区\\\",\\\"latitude\\\":\\\"30.318676549024\\\",\\\"region\\\":\\\"1\\\",\\\"longitude\\\":\\\"120.194115859887\\\",\\\"addressId\\\":\\\"1\\\"}\",\n" +
                "                \"gateAddress\": \"{\\\"address\\\":\\\"测试用门点地址长城街22号\\\",\\\"gateId\\\":\\\"5482\\\",\\\"latitude\\\":\\\"30.339150215942\\\",\\\"longitude\\\":\\\"120.185080393564\\\"}\",\n" +
                "                \"returnAddress\": \"{\\\"address\\\":\\\"测试外港港区\\\",\\\"latitude\\\":\\\"30.318676549024\\\",\\\"region\\\":\\\"1\\\",\\\"longitude\\\":\\\"120.194115859887\\\",\\\"addressId\\\":\\\"1\\\"}\",\n" +
                "                \"suitcaseGateInfo\": \"{\\\"unit\\\":\\\"3\\\",\\\"distance\\\":\\\"2923\\\",\\\"rest_time\\\":\\\"0\\\",\\\"time\\\":\\\"619\\\"}\",\n" +
                "                \"gateReturnInfo\": \"{\\\"unit\\\":\\\"3\\\",\\\"distance\\\":\\\"4941\\\",\\\"rest_time\\\":\\\"0\\\",\\\"time\\\":\\\"639\\\"}\",\n" +
                "                \"pushRules\": \"\",\n" +
                "                \"expectGetTime\": \"2020-07-25 05:22:44\",\n" +
                "                \"expectGetHours\": \"4.62\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"makeBokTime\": \"2020-07-25 10:00:00\",\n" +
                "                \"expireTime\": \"2020-07-24 18:19:14\",\n" +
                "                \"orderNo\": \"202007150000004-4\",\n" +
                "                \"containerSize\": \"20GP\",\n" +
                "                \"containerType\": 1,\n" +
                "                \"cargoWeight\": 10.000,\n" +
                "                \"suitcaseAddress\": \"{\\\"address\\\":\\\"测试外港港区\\\",\\\"latitude\\\":\\\"30.318676549024\\\",\\\"region\\\":\\\"1\\\",\\\"longitude\\\":\\\"120.194115859887\\\",\\\"addressId\\\":\\\"1\\\"}\",\n" +
                "                \"gateAddress\": \"{\\\"address\\\":\\\"测试用门点地址长城街22号\\\",\\\"gateId\\\":\\\"5482\\\",\\\"latitude\\\":\\\"30.339150215942\\\",\\\"longitude\\\":\\\"120.185080393564\\\"}\",\n" +
                "                \"returnAddress\": \"{\\\"address\\\":\\\"测试外港港区\\\",\\\"latitude\\\":\\\"30.318676549024\\\",\\\"region\\\":\\\"1\\\",\\\"longitude\\\":\\\"120.194115859887\\\",\\\"addressId\\\":\\\"1\\\"}\",\n" +
                "                \"suitcaseGateInfo\": \"{\\\"unit\\\":\\\"3\\\",\\\"distance\\\":\\\"2923\\\",\\\"rest_time\\\":\\\"0\\\",\\\"time\\\":\\\"619\\\"}\",\n" +
                "                \"gateReturnInfo\": \"{\\\"unit\\\":\\\"3\\\",\\\"distance\\\":\\\"4941\\\",\\\"rest_time\\\":\\\"0\\\",\\\"time\\\":\\\"639\\\"}\",\n" +
                "                \"pushRules\": \"\",\n" +
                "                \"expectGetTime\": \"2020-07-25 05:22:36\",\n" +
                "                \"expectGetHours\": \"4.62\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"code\": \"success\"\n" +
                "}");
        System.out.println(parse.get("code"));
    }


}
