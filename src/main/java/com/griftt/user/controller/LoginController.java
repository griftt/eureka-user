package com.griftt.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {


    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @RequestMapping("consumer")
    public String login(){
        stringRedisTemplate.opsForList().set("hello",1,"k2");
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set("hello2","k3");
        System.err.println(ops);
        stringRedisTemplate.opsForList().getOperations().keys("hello");
        String hello2 = stringRedisTemplate.opsForValue().get("hello2");
        return hello2;
    }



}
