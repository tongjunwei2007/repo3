package com.itcast.bootcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Daoreposetory {

    public String findByid(String string);
}
