package org.berkemaktav.microproducer.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.berkemaktav.microproducer.util.JsonUtil;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class KafkaProducerService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(String topic, Object message) {
        String jsonMessage = JsonUtil.serialize(message);
        kafkaTemplate.send(topic, jsonMessage);
        log.info("Sent message to topic {}: {}", topic, jsonMessage);
    }
}