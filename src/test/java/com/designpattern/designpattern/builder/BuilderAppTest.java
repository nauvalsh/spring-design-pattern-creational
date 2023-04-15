package com.designpattern.designpattern.builder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = BuilderApp.class)
public class BuilderAppTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testProductFashion() {
        Product product = applicationContext.getBean("productFashion", Product.class);
        product.setName("Topi Klasik");

        System.out.println(product);
    }

    @Test
    void testProductGadget() {
        Product product = applicationContext.getBean("productGadget", Product.class);
        product.setName("Iphone 14 Pro");

        System.out.println(product);
    }
}
