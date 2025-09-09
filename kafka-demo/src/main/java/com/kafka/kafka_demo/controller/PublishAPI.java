package com.kafka.kafka_demo.controller;

import com.kafka.kafka_demo.kakfa.KafkaStringProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class PublishAPI {

    @Autowired
    private KafkaStringProducer kafkaProducer;

    // http:localhost:8080/api/v1/kafka/publish?msg=hello
    @GetMapping("publish")
    public ResponseEntity<String> publishMessage(@RequestParam("msg") String msg){
        kafkaProducer.sendMessage(msg);
      return  ResponseEntity.ok("Message sent to the topic");
    }
}
