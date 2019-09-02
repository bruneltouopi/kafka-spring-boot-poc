package com.example.demo.services;

import com.example.demo.models.Foo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

/**
 * Created by fabrice on 9/2/19.
 */
@Service
public class FooListener {
    private static final Logger LOG = LoggerFactory.getLogger(FooListener.class);

    @KafkaListener(topics = "${app.topic.example}")
    public void receive(@Payload Foo data,
                        @Headers MessageHeaders headers) {
        LOG.info("received data='{}'", data);

        headers.keySet().forEach(key -> {
            LOG.info("{}: {}", key, headers.get(key));
        });
    }
}
