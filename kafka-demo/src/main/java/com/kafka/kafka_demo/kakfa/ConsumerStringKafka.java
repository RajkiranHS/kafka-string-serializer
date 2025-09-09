package com.kafka.kafka_demo.kakfa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerStringKafka {

    private final static Logger LOGGER= LoggerFactory.getLogger(ConsumerStringKafka.class);


    @KafkaListener(topics ="sale-order", groupId = "myGroup")
    public void consumeMessage(String msg){
        System.out.println("Message received consume ->>>>>>>>>>>  " +msg);
    }
}
