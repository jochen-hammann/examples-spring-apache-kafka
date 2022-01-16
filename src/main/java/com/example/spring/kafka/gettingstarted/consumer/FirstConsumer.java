package com.example.spring.kafka.gettingstarted.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class FirstConsumer
{
    // ============================== [Fields] ==============================

    // -------------------- [Private Fields] --------------------

    // -------------------- [Public Fields] --------------------

    // ============================== [Construction / Destruction] ==============================

    // -------------------- [Private Construction / Destruction] --------------------

    // -------------------- [Public Construction / Destruction] --------------------

    // ============================== [Getter/Setter] ==============================

    // -------------------- [Private Getter/Setter] --------------------

    // -------------------- [Public Getter/Setter] --------------------

    // ============================== [Methods] ==============================

    // -------------------- [Private Methods] --------------------

    // -------------------- [Public Methods] --------------------

    @KafkaListener(id = "id1", groupId = "group1", idIsGroup=false, topics = "topic1")
    public void listen1(String in) {
        System.out.println("Consumer 1: " + in);
    }

    @KafkaListener(id = "id2", groupId = "group1", idIsGroup=false, topics = "topic1")
    public void listen2(String in) {
        System.out.println("Consumer 2: " + in);
    }
}
