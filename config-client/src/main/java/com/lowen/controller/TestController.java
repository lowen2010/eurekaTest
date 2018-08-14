package com.lowen.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("test")
public class TestController {

    @Value("${spring.datasource.url}")
    private  String url;

    @RequestMapping("url")
    public  String url(){
        return this.url;
    }
}
