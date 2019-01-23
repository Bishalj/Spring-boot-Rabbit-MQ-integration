package com.example.MQ.rabbit.controller;

import com.example.MQ.rabbit.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class RabbitMQProducerController {

    @Autowired
    private MessageProducer messageProducer;

    @GetMapping
    public String produce(@RequestParam String message){
        messageProducer.sendMessage(message);
        return "Message send to rabbit mq & message is: "+ message;
    }
}
