package com.example.demo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by fabrice on 9/1/19.
 */
@Service
public class Producer {
   /* private static final Logger LOGGER= LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC="users";

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message){
        LOGGER.info(String.format("#### -> Producing message ->%s",message));
        this.kafkaTemplate.send(TOPIC,message);

    }*/

}
