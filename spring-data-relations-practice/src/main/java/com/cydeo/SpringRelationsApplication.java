package com.cydeo;

import com.cydeo.repository.RoleRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRelationsApplication {

    private static RoleRepository repository;

    public SpringRelationsApplication(RoleRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringRelationsApplication.class, args);

        repository.findAll().forEach(r -> System.out.println(r.getId() + " : " + r.getName()));
    }

}
