package com.lowen;

import com.lowen.filter.AccessFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringCloudApplication
@EnableZuulProxy
@Slf4j
public class ApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class,args);
        log.info("api gateway start ...");
    }

    @Bean
    public AccessFilter accessFilter(){
        return  new AccessFilter();
    }

}
