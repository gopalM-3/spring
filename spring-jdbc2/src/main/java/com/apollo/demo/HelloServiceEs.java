package com.apollo.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("es")
public class HelloServiceEs implements HelloService {

    public String sayHello(String name) {
        return "Hola " + name + "!";
    }

}
