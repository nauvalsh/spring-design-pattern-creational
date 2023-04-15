package com.designpattern.designpattern.builder;

public class Product {
    public String id;
    public Long price;
    public String name;
    public Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product(String id, Long price, String name, Category category) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", price=" + price + ", name=" + name + ", category=" + category + "]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
