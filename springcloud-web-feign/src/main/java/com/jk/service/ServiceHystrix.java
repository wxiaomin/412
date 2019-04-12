package com.jk.service;

import com.jk.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ServiceHystrix implements FeignService{
    @Override
    public List<User> querylist() {
        ArrayList<User> objects = new ArrayList<>();
        User user = new User();
        user.setUserName("网络连接失败");
        objects.add(user);
        return objects;
    }
}
