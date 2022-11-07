package com.beingdeveloper.rabbitmqclient;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage customMessage) {
        System.out.println("Message received: " + customMessage);
    }
}
