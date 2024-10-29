package com.guilhermescherer.kafkaexample.service.impl;

import com.guilhermescherer.kafkaexample.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @KafkaListener(topics = "payment.request.topic.v1", groupId = "group-1")
    @Override
    public void receiveMessage(String message) {
        log.info("Received message {}", message);
    }
}
