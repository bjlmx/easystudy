package com.data.easystudy.demo;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.Validator;

/** @author Baijl
 * 2020/7/27 
 * 13:37 
 * @description
 */
public class Demo1 {
    public static void main(String[] args) {
        //ArrayList<Integer> ids = new ArrayList<>();
        //ids.add(1);
        //ids.add(2);
        //ids.add(3);
        //ids.add(4);
        //ids.add(5);
        //String str = JSONUtil.toJsonStr(ids);
        //String str2 = JSONUtil.parseObj(ids).toString();
        //System.out.println(str);
        //System.out.println(str2);
        ////ArrayList arrayList = JSONUtil.toBean(str,ArrayList.class);
        ////arrayList.forEach(x-> System.out.println("转换后的是 "+x));
        //Ticket ticket = new Ticket();
        //ticket.setTicketId(0);
        //ticket.setRoom("星际厅");
        //ticket.setRow(0);
        //ticket.setCol(0);
        //ticket.setFilmName("中国医生");
        //ticket.setPrice(new BigDecimal("0"));
        //ticket.setDatetime(LocalDateTime.now());
        //JSON parse = JSONUtil.parse(ticket);
        //System.out.println(parse);
        //JSONObject jsonObject = JSONUtil.parseObj(parse);
        //System.out.println(jsonObject);
        //Ticket toBean = JSONUtil.toBean(parse, Ticket.class, true);
        //System.out.println(toBean);
        //HashMap<String, Object> map = new HashMap<>();
        //map.put("count",1);
        //map.put("time", LocalDate.now());
        //JSONObject jsonObjectMap = JSONUtil.parseObj(map);
        //jsonObjectMap.setDateFormat("yyyy-MM-dd HH:mm:ss");
        //System.out.println(jsonObjectMap);
        //HashMap hashMap = JSONUtil.toBean(jsonObjectMap, HashMap.class);
        //System.out.println(hashMap);
        //HashMap bean = jsonObjectMap.toBean(HashMap.class);
        //System.out.println(bean);
        boolean chinese = Validator.isChinese("我爱你");
        System.out.println(chinese);

        String a = "我是一个小小的可爱的字符串";

        //结果为："\\u6211\\u662f\\u4e00\\u4e2a\\u5c0f\\u5c0f\\u7684\\u53ef\\u7231\\u7684\\u5b57\\u7b26\\u4e32"
        String unicode = Convert.strToUnicode(a);
        System.out.println(unicode);
        //结果为："我是一个小小的可爱的字符串"
        String raw = Convert.unicodeToStr(unicode);
        System.out.println(raw);

        System.out.println(Convert.digitToChinese(50.26));
    }
}
