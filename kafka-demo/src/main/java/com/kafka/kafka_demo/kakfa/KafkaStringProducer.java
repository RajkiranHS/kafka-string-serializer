package com.kafka.kafka_demo.kakfa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaStringProducer {

    private  static final Logger LOGGER= LoggerFactory.getLogger(KafkaStringProducer.class);

    private KafkaTemplate<String,String> kafkaTemplate;

    public KafkaStringProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        LOGGER.info(String.format("Message sent to kafka broker %s", message));
        kafkaTemplate.send("sale-order",message);

    }

}
