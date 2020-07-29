package com.data.easystudy.async;

import cn.hutool.core.util.ObjectUtil;
import com.data.easystudy.entity.Ticket;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/** @author Baijl
 * 2020/7/28 
 * 10:21 
 * @description
 */
@Component
public class AsyncTest {
    /**
     * 异步处理任务
     * @param ticket
     * @return
     */
    @Async
    public Future<String> test(Ticket ticket) {
        System.out.println(ticket.getFilmName()+"开始处理异步任务");
        if (ObjectUtil.isNull(ticket.getFilmName())){
           return new AsyncResult<>("异步传空");
        }else {
            if(ticket.getFilmName().length()>2){
               return new AsyncResult<>("异步处理影厅大于2");
            }else {
               return new AsyncResult<>("异步处理影厅小于等于2");
            }
        }
    }
}
