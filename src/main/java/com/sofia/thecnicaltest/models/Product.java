package com.sofia.thecnicaltest.models;

import com.sofia.thecnicaltest.models.Category;

public class Product {
    int id;
    String title;
    int price;
    String description;
    Category category;
    String images[];

    public Product() {
    }

    public Product(int id, String title, int price, String description, Category category, String images[]) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String images[]) {
        this.images = images;
    }
    
    
}
