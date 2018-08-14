package com.lowen.service;

import com.lowen.dto.UserDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceImpl implements UserService {

    @Override
    public String sayName(@RequestParam("name") String name) {
        return "userName = " + name;
    }

    @Override
    public String sayNameAndAge(@RequestHeader("name") String name, @RequestHeader("age") String age) {
        return "userName = " + name + "userAge = " + age;
    }

    @Override
    public String sayUser(@RequestBody UserDto user) {
        return " userId = " + user.getUserId() + "userName=" + user.getUserName() + "userAge = " + user.getUserAge();
    }
}
