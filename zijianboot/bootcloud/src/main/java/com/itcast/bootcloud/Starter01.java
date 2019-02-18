package com.itcast.bootcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.itcast.bootcloud.dao")
@SpringBootApplication
public class Starter01 {
    public static void main(String[] args) {
        SpringApplication.run(Starter01.class);
    }
}
