/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.entities;

/**
 *
 * @author RaHuL
 */
public class Product {

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Product(String productName, int price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public Product(int productId, String productName, int price, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }
    int productId;
    String productName;
    int price;
    int stock;
    
}
