package com.guilhermescherer.kafkaexample.service.impl;

import com.guilhermescherer.kafkaexample.enums.KafkaTopic;
import com.guilhermescherer.kafkaexample.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProducerServiceImpl implements ProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendMessage(KafkaTopic topic, String message) {
        kafkaTemplate.send(topic.getTopic(), message);
    }
}
