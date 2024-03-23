package com.apollo.config;

import com.apollo.beans.Dog;
import com.apollo.beans.Owner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Dog dog() {
        Dog dog = new Dog();
        dog.setName("Spike");
        return dog;
    }

    @Bean
    public Owner owner() {
        Owner owner = new Owner();
        owner.setDog(dog());
        return owner;
    }

}
