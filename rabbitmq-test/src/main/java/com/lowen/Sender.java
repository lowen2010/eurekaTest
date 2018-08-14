package com.lowen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String mess = "发送消息 " + new Date();
        log.info("发送者:" + mess);
        this.amqpTemplate.convertAndSend(mess);
    }

}
