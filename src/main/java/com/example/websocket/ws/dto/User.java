package com.example.websocket.ws.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: zsy
 * @create: 2023-09-01 22:38
 */
@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private  String name;
    private  String psw;
}