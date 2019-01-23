package com.example.MQ.rabbit.Config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    public static final String ROUTING_KEY = "my.queue.key";

    @Bean
    Queue queue() {
        //true means it is durable
        return new Queue(ROUTING_KEY, true);
    }

    @Bean
    TopicExchange exchange(){
        return new TopicExchange("my.queue.exchange");
    }

    @Bean
    Binding binding(Queue queue, TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with(ROUTING_KEY);
    }
}
