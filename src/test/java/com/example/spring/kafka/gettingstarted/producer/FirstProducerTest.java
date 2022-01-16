package com.example.spring.kafka.gettingstarted.producer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FirstProducerTest
{
    // ============================== [Fields] ==============================

    // -------------------- [Private Fields] --------------------

    @Autowired
    private FirstProducer firstProducer;

    // ============================== [Unit Tests] ==============================

    // -------------------- [Test Helper Classes] --------------------

    // -------------------- [Test Helper Methods] --------------------

    // -------------------- [Test Initialization] --------------------

    // -------------------- [Tests] --------------------

    @Test
    void send()
    {
        // Caution: The consumer may be initialized after the producer. Thus it may happen, that a unit test run shows no consumer output.
        //          The next unit tests will read the previous messages as well.

        this.firstProducer.send("Test 1.", 10);
    }
}
