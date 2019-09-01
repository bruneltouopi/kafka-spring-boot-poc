package com.example.demo.configuration;

import com.example.demo.models.Bar;
import com.example.demo.models.Foo;
import org.springframework.boot.autoconfigure.kafka.ConcurrentKafkaListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.listener.DeadLetterPublishingRecoverer;
import org.springframework.kafka.listener.SeekToCurrentErrorHandler;
import org.springframework.kafka.support.converter.DefaultJackson2JavaTypeMapper;
import org.springframework.kafka.support.converter.Jackson2JavaTypeMapper;
import org.springframework.kafka.support.converter.RecordMessageConverter;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fabrice on 9/1/19.
 */
@Configuration
@EnableKafka
public class KafkaConfiguration {


    @Bean
    public ConcurrentKafkaListenerContainerFactory kafkaListenerContainerFactory(
            ConcurrentKafkaListenerContainerFactoryConfigurer configurer,
            ConsumerFactory<Object, Object> kafkaConsumerFactory,
            KafkaTemplate<Object, Object> template) {
        ConcurrentKafkaListenerContainerFactory<Object, Object> factory = new ConcurrentKafkaListenerContainerFactory<>();
        configurer.configure(factory, kafkaConsumerFactory);
        factory.setErrorHandler(new SeekToCurrentErrorHandler(
                new DeadLetterPublishingRecoverer(template), 3));
        return factory;
    }

  /*  @Bean
    public RecordMessageConverter converter() {
        return new StringJsonMessageConverter();
    }*/

    @Bean
    public RecordMessageConverter converter() {
        StringJsonMessageConverter converter = new StringJsonMessageConverter();
        DefaultJackson2JavaTypeMapper typeMapper = new DefaultJackson2JavaTypeMapper();
        typeMapper.setTypePrecedence(Jackson2JavaTypeMapper.TypePrecedence.TYPE_ID);
        typeMapper.addTrustedPackages("com.example.demo.models");
        Map<String, Class<?>> mappings = new HashMap<>();
        mappings.put("foo", Foo.class);
        mappings.put("bar", Bar.class);
        typeMapper.setIdClassMapping(mappings);
        converter.setTypeMapper(typeMapper);
        return converter;
    }


}
