package com.data.easystudy.service.impl;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.concurrent.Future;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.data.easystudy.async.AsyncTest;
import com.data.easystudy.entity.Ticket;
import com.data.easystudy.mapper.TicketMapper;
import com.data.easystudy.service.TicketService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

/**
 * @author Baijl
 * 2020/6/2
 * 13:47
 * @description
 */
@Service
public class TicketServiceImpl extends ServiceImpl<TicketMapper, Ticket> implements TicketService {
    @Autowired
    private AsyncTest asyncTest;
    @SneakyThrows
    @Override
    public void testAsync(String fileName) {
        System.out.println("主线程开始执行任务");
        Ticket ticket = new Ticket();
        ticket.setTicketId(0);
        ticket.setRoom("异步厅");
        ticket.setRow(50);
        ticket.setCol(30);
        ticket.setFilmName(fileName+"厅");
        ticket.setPrice(new BigDecimal("0"));
        ticket.setDatetime(LocalDateTime.now());
        Future<String> test = asyncTest.test(ticket);
        System.out.println(test.get());
        System.out.println("主线程执行任务完成");

    }
}
