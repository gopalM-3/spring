package com.apollo.main;

import com.apollo.config.ProjectConfig;
import com.apollo.demo.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Person person = context.getBean(Person.class);
            person.sayHello("Gopal");
        }
    }

}
