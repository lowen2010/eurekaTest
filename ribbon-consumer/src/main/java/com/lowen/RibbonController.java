package com.lowen;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/rabbon-test")
    @HystrixCommand(fallbackMethod = "helloFallback",threadPoolKey = "test")
    public String HelloConsumer(){
        return restTemplate.getForEntity("http://hello-service/hello",String.class).getBody();
    }

    public String helloFallback(){
        return "error";
    }
}
