/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.dao;

import com.project.food_hub.entities.Product;
import java.util.List;

/**
 *
 * @author RaHuL
 */
public interface ProductDAO {
 int addProduct(Product product);
    int deleteProduct(int productId);
    List<Product> getAllProduct();
    Product getProductById(int productId);
    int updateProduct(int productId,Product product);   
}
