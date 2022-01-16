# Spring for Apache Kafka

This example shows the usage of [Spring for Apache Kafka](https://docs.spring.io/spring-kafka/docs/current/reference/html/).

### Apache Kafka

The following Docker Compose file can be used to run an Apache Kafka server. Beside the server itself [Kafdrop](https://github.com/obsidiandynamics/kafdrop) offers a Web UI. Use the URL [http://localhost:9001](http://localhost:9001) to open the Web UI.

```
version: "2"
services:
  kafdrop:
    image: obsidiandynamics/kafdrop
    restart: "no"
    ports:
      - "9001:9000"
    environment:
      KAFKA_BROKERCONNECT: "kafka:29092"
      JVM_OPTS: "-Xms16M -Xmx48M -Xss180K -XX:-TieredCompilation -XX:+UseStringDeduplication -noverify"
    depends_on:
      - "kafka"
  kafka:
    image: obsidiandynamics/kafka
    restart: "no"
    ports:
      - "2181:2181"
      - "9092:9092"
    environment:
      KAFKA_LISTENERS: "INTERNAL://:29092,EXTERNAL://:9092"
      KAFKA_ADVERTISED_LISTENERS: "INTERNAL://kafka:29092,EXTERNAL://localhost:9092"
      KAFKA_LISTENER_SECURITY_PROTOCOL_MAP: "INTERNAL:PLAINTEXT,EXTERNAL:PLAINTEXT"
      KAFKA_INTER_BROKER_LISTENER_NAME: "INTERNAL"
      KAFKA_ZOOKEEPER_SESSION_TIMEOUT: "6000"
      KAFKA_RESTART_ATTEMPTS: "10"
      KAFKA_RESTART_DELAY: "5"
      ZOOKEEPER_AUTOPURGE_PURGE_INTERVAL: "0"
```

### See also

* [Spring for Apache Kafka](https://docs.spring.io/spring-kafka/docs/current/reference/html/)
* [Spring for Apache Kafka - Getting Started](https://docs.spring.io/spring-kafka/docs/current/reference/html/#getting-started)
* [Baeldung: Intro to Apache Kafka with Spring](https://www.baeldung.com/spring-kafka)
* [Baeldung: Testing Kafka and Spring Boot](https://www.baeldung.com/spring-boot-kafka-testing)
* [Baeldung: Data Modeling with Apache Kafka](https://www.baeldung.com/apache-kafka-data-modeling)


* [Github: Kafdrop](https://github.com/obsidiandynamics/kafdrop)
* [Docker Compose: Setting Up a Three Node Kafka Cluster](https://docs.confluent.io/5.0.0/installation/docker/docs/installation/clustered-deployment.html#docker-compose-setting-up-a-three-node-kafka-cluster)
