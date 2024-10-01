package org.berkemaktav.microproducer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.berkemaktav.microproducer.model.Order;
import org.berkemaktav.microproducer.service.KafkaProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/kafka")
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaProducerService kafkaProducerService;

    @PostMapping("/send")
    public void sendMessage(@RequestBody Order order) {
        kafkaProducerService.sendMessage("orders", order);
        log.info("Order message sent: {}", order);
    }
}