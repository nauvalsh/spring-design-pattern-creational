package com.designpattern.designpattern.builder;

import org.junit.jupiter.api.Test;

public class ProductTest {
    @Test
    void testBuilder() {
        Product product = new ProductBuilder().setId("0001").setName("Iphone 14 Pro").setPrice(14_000_000L).build();

        System.out.println(product);
    }
}
