package org.berkemaktav.microconsumer.service;

import lombok.extern.slf4j.Slf4j;
import org.berkemaktav.microconsumer.model.Order;
import org.berkemaktav.microconsumer.util.JsonUtil;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "orders", groupId = "order-group")
    public void consume(String message) {
        log.info("Received raw message: {}", message);

        Order order = JsonUtil.deserialize(message, Order.class);
        log.info("Deserialized order: {}", order);
    }
}