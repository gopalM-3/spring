package com.apollo.main;

import com.apollo.beans.Dog;
import com.apollo.beans.Owner;
import com.apollo.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Dog dog = context.getBean(Dog.class);
            Owner owner = context.getBean(Owner.class);

            System.out.println(dog);
            System.out.println(owner);
        }
    }

}
