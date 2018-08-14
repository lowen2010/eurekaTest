package com.lowen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

@Component
@Slf4j
public class Receiver {

    @RabbitListener(queues = "test")
    @RabbitHandler
    public void process(String mess) throws UnsupportedEncodingException {
        String outputStr = new String(mess.getBytes(),"UTF-8");
        log.info("接收者：" + outputStr);
    }
}
