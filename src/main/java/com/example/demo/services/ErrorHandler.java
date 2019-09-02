package com.example.demo.services;

import com.example.demo.models.Foo;
import com.example.demo.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Created by fabrice on 9/1/19.
 */
@Service
public class ErrorHandler {
    private final Logger logger = LoggerFactory.getLogger(ErrorHandler.class);
    /**
     * Method to simulate errors
     * @param in
     */
 /*   @KafkaListener(id = "userGroup", topics = "topic1")
    public void listen(String in) {
        logger.info("Received: " + in);
        if (in.startsWith("foo")) {
            throw new RuntimeException("failed");
        }
    }

    @KafkaListener(id = "dltGroup", topics = "topic1.DLT")
    public void dltListen(String in) {
        logger.info("Received from DLT: " + in);
    }

    @KafkaListener(id = "fooGroup", topics = "topic1")
    public void listen(Foo foo) {
        logger.info("Received: " + foo);
        if (foo.getName().startsWith("fail")) {
            throw new RuntimeException("failed");
        }
    }*/
}
