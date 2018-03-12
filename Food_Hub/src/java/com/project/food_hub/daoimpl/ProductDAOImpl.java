/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.daoimpl;

import com.project.food_hub.dao.ProductDAO;
import com.project.food_hub.entities.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RaHuL
 */
public class ProductDAOImpl implements ProductDAO{

    @Override
    public int addProduct(Product product) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt=con.prepareStatement("Insert into Product(productname,price,stock) values(?,?,?)");
            psmt.setString(1,product.getProductName());
            psmt.setInt(2,product.getPrice());
            psmt.setInt(3,product.getStock());
            count=psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public int deleteProduct(int productId) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt = con.prepareStatement("Delete from product where productId=?");
            psmt.setInt(1, productId);
            count=psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> productList=null;
        try {
            
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt = con.prepareStatement("Select * from product ");
            ResultSet resultSet=psmt.executeQuery();
            productList = new ArrayList<Product>();
              if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int productId = resultSet.getInt(1);
                    String productName = resultSet.getString(2);
                    int price = resultSet.getInt(3);
                    int stock = resultSet.getInt(4);
                    Product product = new Product(productId,productName,price,stock);
                    productList.add(product);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return productList;   

    }

    @Override
    public Product getProductById(int productId) {
           List<Product> productList=null;
        try {
            
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt = con.prepareStatement("Select * from product where productID=? ");
            psmt.setInt(1, productId);
            ResultSet resultSet=psmt.executeQuery();
            productList = new ArrayList<Product>();
              if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int productid = resultSet.getInt(1);
                    String productName = resultSet.getString(2);
                    int price = resultSet.getInt(3);
                    int stock = resultSet.getInt(4);
                    Product product = new Product(productid,productName,price,stock);
                    productList.add(product);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     if(productList.size()>0) return productList.get(0);
     return null;
        

    }

    @Override
    public int updateProduct(int productId, Product product) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt=con.prepareStatement("Update Product set productName=?,price=?,stock=? where productId=?");
            psmt.setString(1,product.getProductName());
            psmt.setInt(2, product.getPrice());
            psmt.setInt(3, product.getStock());
            psmt.setInt(4, productId);
            count=psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
    
}
