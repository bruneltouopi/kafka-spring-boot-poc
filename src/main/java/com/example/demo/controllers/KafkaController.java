package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fabrice on 9/1/19.
 */
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Producer producer;

    @Autowired
    KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        this.producer.sendMessage(message);
    }

}
