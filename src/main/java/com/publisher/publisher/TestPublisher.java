package com.publisher.publisher;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class TestPublisher {
    public static void main(String[] args) {
        ParentPublisher publisher=new ParentPublisher();
        publisher.test(Flux.just(10,11,12,23,12));
    }
}
