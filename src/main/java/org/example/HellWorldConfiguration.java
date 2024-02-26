package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
record Person(String name, int age) {};
record Address(String town,String city) {};
public class HellWorldConfiguration {

    @Bean
    public String name() {
        return "Divya";
    }
    @Bean
    public int age() {
        return 23;

    }

    @Bean
    public Person person() {
        var person = new Person("Ram",21);
        return person;

    }

    @Bean
    public Address address() {
        return new Address("Baker Street", "London");

    }
    @Bean
    public Person person2MethodCall() {
        return new Person(name(),age());
    }


}
