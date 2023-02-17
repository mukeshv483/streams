package com.publisher.publisher;

import org.reactivestreams.Publisher;
import org.springframework.stereotype.Service;
import reactor.core.CorePublisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class ParentPublisher {

    Publisher<?> test(Publisher<?>publisher){
        Flux flux=(Flux) publisher;
        flux.subscribe(x-> System.out.println(x));

        //System.out.println(data);
        //Mono.just(publisher.).subscribe(x-> System.out.println(x));
        return Mono.empty();
    }
}
