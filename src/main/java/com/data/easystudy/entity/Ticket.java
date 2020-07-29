package com.data.easystudy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Baijl
 * 2020/6/1
 * 10:07
 * @description
 */
@Data
@EqualsAndHashCode
@NoArgsConstructor
@TableName("ticket")
@ToString
public class Ticket {

    //id
    @TableId(type = IdType.AUTO)
    private Integer ticketId;
    //放映厅
    private String room;
    //行
    private Integer row;
    //列
    private Integer col;
    //电影名
    @NotNull(message = "电影名称不能为空")
    private String filmName;
    //价格
    private BigDecimal price;
    //放映时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime datetime;

    public Ticket(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Ticket(Integer ticketId, String filmName) {
        this.ticketId = ticketId;
        this.filmName = filmName;
    }

    public Ticket(String filmName) {
        this.filmName = filmName;
    }

    public static void main(String[] args) {
        //System.out.println(new Ticket(1).equals(new Ticket(1)));
        //System.out.println(new Ticket("杀破狼").equals(new Ticket("杀破狼")));
        //System.out.println(new Ticket(2,"战狼3").equals(new Ticket(2,"战狼4")));
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);

    }
}
