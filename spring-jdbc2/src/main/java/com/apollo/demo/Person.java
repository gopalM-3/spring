package com.apollo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private HelloService helloService;

    @Autowired
//    @Qualifier("es")
    public Person(HelloService helloService) { this.helloService = helloService; }

    public void sayHello(String name) {
        String message = helloService.sayHello(name);
        System.out.println(message);
    }
    
}
