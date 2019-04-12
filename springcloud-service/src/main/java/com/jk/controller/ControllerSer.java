package com.jk.controller;

import com.jk.model.User;
import com.jk.service.Servicess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
public class ControllerSer {
    @Autowired
    private Servicess servicess;
    @Autowired
    private RedisTemplate redisTemplate;
    //随意常量
    public static final String CACHE_POWER_TREE  = "cache_power_tree";

    //查询
    @RequestMapping("querylist")
    @ResponseBody
    public List<User> querylist(){
//        List<User> user =new ArrayList<>();
//        String xx=CACHE_POWER_TREE;
//        Boolean aBoolean = redisTemplate.hasKey(xx);
//        if(aBoolean){
//            System.out.println("走redis缓存");
//            user=redisTemplate.opsForList().range(xx,0,-1);
//        }else{
//            System.out.println("走数据库查询");
//            List<User> querylist = servicess.querylist();
//            for (User us:querylist ){
//                redisTemplate.opsForList().leftPush(xx,us);
//            }
//            redisTemplate.expire(xx,30, TimeUnit.SECONDS);
//        }
        List<User> user = servicess.querylist();
        return user;


    }
}
