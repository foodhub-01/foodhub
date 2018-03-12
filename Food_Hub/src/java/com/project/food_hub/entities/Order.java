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
public class Order {

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Order(int customerId, int productId, int employeeId, int quantity, int billNo, String date) {
        this.customerId = customerId;
        this.productId = productId;
        this.employeeId = employeeId;
        this.quantity = quantity;
        this.billNo = billNo;
        this.date = date;
    }

    public Order(int orderId, int customerId, int productId, int employeeId, int quantity, int billNo, String date) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productId = productId;
        this.employeeId = employeeId;
        this.quantity = quantity;
        this.billNo = billNo;
        this.date = date;
    }
    int orderId;
    int customerId;
    int productId;
    int employeeId;
    int quantity;
    int billNo;
    String date;
    
}
