package com.lowen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class Hello1Application {
    public static void main(String[] args) {
        SpringApplication.run(Hello1Application.class,args);
        log.info("eureka service provide start...");
    }
}
