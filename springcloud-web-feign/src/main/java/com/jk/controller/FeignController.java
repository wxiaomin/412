package com.jk.controller;

import com.jk.model.User;
import com.jk.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FeignController {
    @Autowired
    private FeignService feignService;

    //查询
    @RequestMapping("querylista")
    @ResponseBody
    public List<User> querylista(){
        List<User> querylist = feignService.querylist();
        return querylist;
    }
    //页面
    @RequestMapping("toqd")
    public String toqd(){
        return "information";
    }
}
