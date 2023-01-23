![SpringKafka.png](img%2FSpringKafka.png)
---
# Kafka consumer example

**Project to consume messages from a Kafka topic using spring.**

## Prerequisites
- **Java 17**.
- **Apache Kafka cluster**, in order to create a Kafka Cluster locally we can use a docker image as described in https://hub.docker.com/r/bitnami/kafka. This will create a Kafka Cluster that will be available at localhost:9092.
- **Kafka producer implementation**, message sent by this project https://github.com/DenilssonMontoya/kafka-producer-spring to kafka topic.

## Run Locally

Execute following commands to build and run the Kafka-producer project.

```bash
# Build project & install dependencies
./gradlew build

# Run project 
./gradlew bootRun
```


## Testing

This project will be listening to kafka topic called _kfk-message-topic_, any message sent to this topic will be read and processed by this consumer.

The message body will currently be displayed in the console, but it can also be saved in a database, delivered over email, or used in any other way that is necessary.

![console01.png](img%2Fconsole01.png)





