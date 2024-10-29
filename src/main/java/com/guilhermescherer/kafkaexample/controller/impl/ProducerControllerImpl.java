package com.guilhermescherer.kafkaexample.controller.impl;

import com.guilhermescherer.kafkaexample.controller.ProducerController;
import com.guilhermescherer.kafkaexample.enums.KafkaTopic;
import com.guilhermescherer.kafkaexample.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProducerControllerImpl implements ProducerController {

    private final ProducerService producerService;

    @PostMapping("/produce")
    public ResponseEntity<String> produceMessage(@RequestParam KafkaTopic topic, @RequestParam String message) {
        producerService.sendMessage(topic, message);
        return ResponseEntity.ok("Message sent to Kafka");
    }
}
