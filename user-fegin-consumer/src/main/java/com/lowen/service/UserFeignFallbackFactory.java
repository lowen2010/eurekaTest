package com.lowen.service;

import com.lowen.dto.UserDto;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 定义fallback方法
 *
 * @author chengwei
 * @date 2018-07-05
 */
@Slf4j
@Component
public class UserFeignFallbackFactory implements FallbackFactory<FUserService> {
    @Override
    public FUserService create(Throwable throwable) {
        return new FUserService() {
            @Override
            public String sayName(String name) {
                log.info("fallback reason was:"+ throwable);
                return "error";
            }

            @Override
            public String sayNameAndAge(String name, String age) {
                log.info("fallback reason was:"+ throwable);
                return "error";
            }

            @Override
            public String sayUser(UserDto user) {
                log.info("fallback reason was:"+ throwable);
                return null;
            }
        };
    }

}
