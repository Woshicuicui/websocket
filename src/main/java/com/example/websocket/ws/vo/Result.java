package com.example.websocket.ws.vo;

import lombok.Data;

/**
 * @author: zsy
 * @create: 2023-09-01 22:42
 */
@Data
public class Result {
    private  Integer code;
    private  String msg;
    private Object data;
}