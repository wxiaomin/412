package com.jk.service;

import com.jk.mapper.ServiceMapper;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicessImpl implements Servicess{
    @Autowired
    private ServiceMapper serviceMapper;
    //查询
    @Override
    public List<User> querylist() {
        List<User> querylist = serviceMapper.querylist();
        return querylist;
    }
}
