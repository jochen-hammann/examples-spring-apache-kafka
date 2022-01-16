package com.example.spring.kafka.gettingstarted.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class FirstProducer
{
    // ============================== [Fields] ==============================

    // -------------------- [Private Fields] --------------------

    private KafkaTemplate<String, String> kafkaTemplate;

    // ============================== [Construction / Destruction] ==============================

    // -------------------- [Public Construction / Destruction] --------------------

    @Autowired
    public FirstProducer(KafkaTemplate<String, String> kafkaTemplate)
    {
        this.kafkaTemplate = kafkaTemplate;
    }

    // ============================== [Getter/Setter] ==============================

    // -------------------- [Private Getter/Setter] --------------------

    // -------------------- [Public Getter/Setter] --------------------

    // ============================== [Methods] ==============================

    // -------------------- [Private Methods] --------------------

    // -------------------- [Public Methods] --------------------

    public void send(String message, int count)
    {
        for (int i = 0; i < count; ++i)
        {
            // this.kafkaTemplate.send("topic1", String.format("[%d] %s", i, message));
            this.kafkaTemplate.send("topic1", i % 10, null, String.format("[%d] %s", i, message));
        }
    }
}
