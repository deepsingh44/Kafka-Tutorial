package com.deepsingh44.demo.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Value("${smsTopicName}")
    private String smsTopicName;

    public void sendSms(String message) {
        log.info("sendSms : {}", message);
        kafkaTemplate.send(smsTopicName, message);
    }

}
