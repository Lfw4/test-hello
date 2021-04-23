package com.example.testhello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author刘锋伟
 * @date 2021/4/23 21:21
 */
@RestController
public class Hello {
    @RequestMapping("hello")
    public String getHello(){
        return "hello world!!!";
    }
}
