package com.lowen.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @GetMapping(value = "/hello")
    public String index() {
        log.info("hello1");
        return "Hello World";
    }
}
