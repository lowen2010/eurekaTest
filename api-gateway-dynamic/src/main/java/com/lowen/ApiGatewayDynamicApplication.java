package com.lowen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

@SpringCloudApplication
@EnableZuulProxy
@Slf4j
public class ApiGatewayDynamicApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayDynamicApplication.class,args);
        log.info("api gateway start ...");
    }

    /**
     * 注入ZuulProperties属性
     * @return
     */
    @RefreshScope
    @ConfigurationProperties("zuul")
    public ZuulProperties zuulProperties(){
        return new ZuulProperties();
    }


}
