package com.example.websocket.ws.task;

import com.example.websocket.ws.dto.User;
import com.example.websocket.ws.service.WebSocketServer;
import com.example.websocket.ws.vo.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author: zsy
 * @create: 2023-09-01 22:43
 */
@Component
@Slf4j
public class TimeTask {
    /**
     * @throws Exception
     */
    //10秒传递一次
    @Scheduled(cron="*/10 * *  * * ? ")
    public void JqcaseSearch() {
        try {
            Result result = new Result();
            result.setCode(200);
            List<User> userList = Arrays.asList(new User(1,"张三","12345")
                    , new User(2,"李四","54321"));
            result.setData(userList);
            result.setMsg("查询成功！");
            String resultJson= new ObjectMapper().writeValueAsString(result);
            WebSocketServer.sendInfo(resultJson,"111");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}