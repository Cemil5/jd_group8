package com.cydeo;

import com.cydeo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Demo implements CommandLineRunner {

    UserRepository userRepository;

    @Override
    public void run(String... args) {
        userRepository.findAll().forEach(
                user -> System.out.println(user.getFirstName() + " " + user.getLastName() +" " + user.getEmail() + " " + user.getRole().getName())
        );
    }
}
