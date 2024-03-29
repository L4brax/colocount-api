package com.hess.colocount;

import com.hess.colocount.domain.User;
import com.hess.colocount.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ColocountApplication {

    public static void main(String[] args) {
        SpringApplication.run(ColocountApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            userRepository.deleteAll();
            userRepository.save(new User("Antoine","antoine@coloc.com"));
            userRepository.save(new User("François", "françois@coloc.com"));
            userRepository.save(new User("Michel", "michel@coloc.com"));
            userRepository.save(new User("Morgane", "morgane@coloc.com"));
        };
    }

}
