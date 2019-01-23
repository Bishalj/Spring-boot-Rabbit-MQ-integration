package com.example.MQ.rabbit.service;

import com.example.MQ.rabbit.Config.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MessageProducer {

    @Autowired
    public RabbitTemplate rabbitTemplate;

    public void sendMessage(String message){
        System.out.println(new Date());
        try {
            rabbitTemplate.convertAndSend(RabbitMQConfig.ROUTING_KEY, message);
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("Is Listner returned :::"+rabbitTemplate.isReturnListener());
        System.out.println(new Date());
    }
}
