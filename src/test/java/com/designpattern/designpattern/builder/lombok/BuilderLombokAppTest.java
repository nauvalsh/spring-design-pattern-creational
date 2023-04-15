package com.designpattern.designpattern.builder.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = BuilderLombokApp.class)
public class BuilderLombokAppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testProductFashion() {
        ProductLombok product = applicationContext.getBean("productFashionLombok", ProductLombok.class);
        product.setName("Baju Keren");
        product.setPrice(1_000_123L);

        System.out.println(product);
    }

    @Test
    void testProductGadget() {
        ProductLombok product = applicationContext.getBean("productGadgetLombok", ProductLombok.class);
        product.setName("Laptop 15 Inch");

        System.out.println(product);
    }
}
