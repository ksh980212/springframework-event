package com.springframework.demo;

import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {

    @EventListener
//    @Order(Ordered.HIGHEST_PRECEDENCE + 2)
    @Async
    public void handle(MyEvent event) {
        System.out.println("이벤트 받았다. 데이터는" + event.getData());
    }
}
