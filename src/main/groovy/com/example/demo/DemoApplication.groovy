package com.example.demo

import com.example.demo.model.Person
import com.example.demo.repository.PersonRepository
import com.github.javafaker.Faker
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication {

    static void main(String[] args) {
        SpringApplication.run DemoApplication, args
    }

    @Bean
    CommandLineRunner initData(PersonRepository personRepository) {
        { args ->
            def faker = new Faker()
            100.times {
                personRepository.save(new Person(
                        name: faker.name().fullName(),
                        address: faker.address().fullAddress(),
                        email: faker.internet().emailAddress()
                ))
            }
        }
    }
}
