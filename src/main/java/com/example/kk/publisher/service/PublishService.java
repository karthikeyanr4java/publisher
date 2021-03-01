package com.example.kk.publisher.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class PublishService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void publishMesssage(String message) {
        kafkaTemplate.send("kk-topic", message);
    }
}
