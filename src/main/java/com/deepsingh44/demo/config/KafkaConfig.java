package com.deepsingh44.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    @Value("${smsTopicName}")
    private String smsTopicName;

    @Bean
    public NewTopic newTopic() {
        return TopicBuilder.name(smsTopicName).build();
    }

}
