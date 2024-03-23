package com.apollo.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("en")
public class HelloServiceEn implements HelloService {

    public String sayHello(String name) {
        return "Hello" + name + "!";
    }

}
