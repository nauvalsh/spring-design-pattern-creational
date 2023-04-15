package com.designpattern.designpattern.builder;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class BuilderApp {
    @Bean
    @Scope("prototype")
    public Product productGadget() {
        return new ProductBuilder().setCategory(Category.GADGET).build();
    }

    @Bean
    @Scope("prototype")
    public Product productFashion() {
        return new ProductBuilder().setCategory(Category.FASHION).build();
    }
}
