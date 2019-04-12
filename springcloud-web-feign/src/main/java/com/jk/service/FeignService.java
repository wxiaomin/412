package com.jk.service;

import com.jk.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * / 定义抽象方法，抽象方法没有方法体
 * 	方法的定义和生产者controller中的方法保持一致
 * 	包括请求的方式，传入的参数，方法定义和返回参数
 */
@FeignClient(value="springcloud-server",fallback = ServiceHystrix.class)//指定生产者的实例名称
public interface FeignService {

    //查询
    @RequestMapping("querylist")
    List<User> querylist();
}
