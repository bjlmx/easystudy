package com.data.easystudy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.data.easystudy.entity.Ticket;

/**
 * @author Baijl
 * 2020/6/2
 * 13:46
 * @description
 */
public interface TicketService extends IService<Ticket> {
    /**
     * 测试spring异步方法
     * @param fileName
     */
    void testAsync(String fileName);
}
