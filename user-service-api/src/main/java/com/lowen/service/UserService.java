package com.lowen.service;

import com.lowen.dto.UserDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/user")
public interface UserService {

    @RequestMapping(value = "sayName", method = RequestMethod.GET)
    String sayName(@RequestParam("name") String name);

    @RequestMapping(value = "sayNameAndAge", method = RequestMethod.GET)
    String sayNameAndAge(@RequestHeader("name") String name, @RequestHeader("age") String age);

    @RequestMapping(value = "sayUser", method = RequestMethod.POST)
    String sayUser(@RequestBody UserDto user);
}
