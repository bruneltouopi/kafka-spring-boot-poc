package com.example.demo.controllers;

import com.example.demo.models.Foo;
import com.example.demo.models.User;
import com.example.demo.services.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fabrice on 9/1/19.
 */
@RestController
public class ErrorController {

/*
    @Autowired
    private  KafkaTemplate<String, Foo> kafkaTemplate;

    @PostMapping(path = "/send/foo/{name}")
    public void sendFoo(@PathVariable String name) {
        this.kafkaTemplate.send("topic1", new Foo(name,""));
    }
*/
}
