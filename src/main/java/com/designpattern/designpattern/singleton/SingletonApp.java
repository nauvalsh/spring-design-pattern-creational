package com.designpattern.designpattern.singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class SingletonApp {
    @Bean
    @Scope("singleton")
    public Counter counter() {
        return new Counter();
    }
}
