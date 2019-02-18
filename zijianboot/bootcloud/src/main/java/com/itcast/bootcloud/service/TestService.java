package com.itcast.bootcloud.service;

import com.itcast.bootcloud.dao.Daoreposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    Daoreposetory daoreposetory;
    public String returnString(){
        System.out.println("sdf");
        String byid = daoreposetory.findByid("1");
        return byid;
    }
}
