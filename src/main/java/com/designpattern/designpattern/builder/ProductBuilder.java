package com.designpattern.designpattern.builder;

public class ProductBuilder {
    public String id;
    public Long price;
    public String name;
    public Category category;

    public ProductBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public ProductBuilder setPrice(Long price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setCategory(Category category) {
        this.category = category;
        return this;
    }

    public Product build() {
        return new Product(this.id, this.price, this.name, this.category);
    }

}
