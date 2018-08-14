package com.lowen.service;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "user-service",fallbackFactory = UserFeignFallbackFactory.class)
public interface FUserService extends  UserService {
}
