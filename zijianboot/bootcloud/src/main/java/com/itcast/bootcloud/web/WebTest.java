package com.itcast.bootcloud.web;

import com.itcast.bootcloud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/cms")
public class WebTest {

    @Autowired
    private TestService testService;

    @RequestMapping("/getName")
    public Map getName(String id){
        System.out.println("idddd");
        Map map=new HashMap();
        String str=testService.returnString();
        map.put("st",str);
        return map;
        }
    }
