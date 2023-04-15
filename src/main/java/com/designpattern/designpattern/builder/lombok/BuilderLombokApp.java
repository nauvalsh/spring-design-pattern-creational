package com.designpattern.designpattern.builder.lombok;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.designpattern.designpattern.builder.Category;

@SpringBootApplication
public class BuilderLombokApp {
    @Bean
    @Scope("prototype")
    public ProductLombok productGadgetLombok() {
        return ProductLombok.builder()
                .category(Category.GADGET)
                .build();
    }

    @Bean
    @Scope("prototype")
    public ProductLombok productFashionLombok() {
        return ProductLombok.builder()
                .category(Category.FASHION)
                .build();
    }
}
