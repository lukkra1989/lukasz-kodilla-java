package com.kodilla.spring.forum;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ForumUser {

    String username = "John Smith";


    public ForumUser() {
        this.username = username;
    }

    @Bean
    public String getUsername() {
        return username;
    }
}
