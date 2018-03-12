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
public class Customer {

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer(int customerId, String customerName,String userName, String address, String emailId,String contactNo, String date, String password) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.userName = userName;
        this.address = address;
        this.emailId = emailId;
        this.contactNo = contactNo;
        this.date = date;
        this.password = password;
    }

    public Customer(String customerName,String userName, String address, String emailId, String contactNo, String date, String password) {
        this.customerName = customerName;
        this.userName = userName;
        this.address = address;
        this.emailId = emailId;
        this.contactNo = contactNo;
        this.date = date;
        this.password = password;
    }
    int customerId;
    String customerName;
    String userName;
    String address;
    String emailId;
    String contactNo;
    String date;
    String password;
    
}
