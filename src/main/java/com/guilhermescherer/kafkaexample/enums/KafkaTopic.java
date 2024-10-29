package com.guilhermescherer.kafkaexample.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum KafkaTopic {

    PAYMENT_V1("payment.request.topic.v1");

    private final String topic;
}
