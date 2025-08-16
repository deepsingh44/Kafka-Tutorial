package com.deepsingh44.demo.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "${smsTopicName}", groupId = "consumer-a")
    public void consumeSms(String message) {
        log.info("consumeSms : {}", message);
    }

}
