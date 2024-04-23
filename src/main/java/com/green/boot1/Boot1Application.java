package com.green.boot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Boot1Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot1Application.class, args);
    }

}
