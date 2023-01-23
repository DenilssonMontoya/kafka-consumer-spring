package com.denilsson.kafka.consumer.kafkaintegration;

import com.denilsson.kafka.consumer.dto.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaEventListener {

    @KafkaListener(
            topics = "${kafka.consumer.topic}",
            groupId = "${kafka.consumer.group-id}",
            containerFactory = "kafkaListenerContainerFactory")
    public void consumeMessage(Message message){
        log.info(message.getBody());
    }

}
