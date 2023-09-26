package com.theksbd.firstspringproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Hoang";
    }

    @Bean
    public int age() {
        return 22;
    }

    @Bean
    public Person person() {
        var person = new Person("Hoang", 22);
        return person;
    }

    @Bean
    public Address address() {
        return new Address("Trung My Tay", "TP.HCM");
    }
}
