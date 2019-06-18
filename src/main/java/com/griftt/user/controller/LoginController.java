package com.griftt.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisOperations;
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

        //ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        //ops.set("hello2","k3");
        //stringRedisTemplate.opsForList().getOperations().keys("hello2");
        //String hello2 = stringRedisTemplate.opsForValue().get("hello2");
        //System.err.println(hello2);
        stringRedisTemplate.opsForList().set("k",2,"list");
        return "ok";
    }



}
