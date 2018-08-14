package com.lowen.controller;

import com.lowen.dto.UserDto;
import com.lowen.service.FUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fegin-user")
public class UserController {

    @Autowired
    private FUserService fUserService;

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String userConsumer(){
        StringBuilder sb = new StringBuilder();
        sb.append(fUserService.sayName("Lowen")).append("\n");
        sb.append(fUserService.sayNameAndAge("Jack","20")).append("\n");
        sb.append(fUserService.sayUser(new UserDto("1001","Lowen","25"))).append("\n");
        return  sb.toString();
    }

    @RequestMapping(value = "/sayName",method = RequestMethod.GET)
    public String sayName(){
        return fUserService.sayName("Lowen");
    }
}
