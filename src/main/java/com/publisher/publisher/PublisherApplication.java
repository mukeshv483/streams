package com.publisher.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PublisherApplication {
    @Autowired
    ParentPublisher parentPublisher;

    public static void main(String[] args) {
        SpringApplication.run(PublisherApplication.class, args);
    }

}
