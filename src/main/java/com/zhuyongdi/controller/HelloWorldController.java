package com.zhuyongdi.controller;

import com.zhuyongdi.properties.MySqlProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloWorldController {

    @Value("${hello}")
    private String hello;

    @Resource
    private MySqlProperties mySqlProperties;

    @GetMapping("hello")
    public String hello() {
        return hello;
    }

    @GetMapping("showMysqlProperties")
    public String showMysqlProperties() {
        return "jdbcName:" + mySqlProperties.getJdbcName() + "</br>"
                + "dbUrl:" + mySqlProperties.getDbUrl() + "</br>"
                + "userName:" + mySqlProperties.getUserName() + "</br>"
                + "password:" + mySqlProperties.getPassword() + "</br>";
    }

}
