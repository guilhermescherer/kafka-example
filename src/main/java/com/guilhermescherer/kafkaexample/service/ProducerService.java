package com.guilhermescherer.kafkaexample.service;

import com.guilhermescherer.kafkaexample.enums.KafkaTopic;

public interface ProducerService {

    void sendMessage(KafkaTopic topic, String message);
}
