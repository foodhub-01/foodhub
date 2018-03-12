/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.dao;

import com.project.food_hub.entities.Customer;
import java.util.List;

/**
 *
 * @author RaHuL
 */
public interface CustomerDAO {
    int addCustomer(Customer customer);
    int deleteCustomer(int customerId);
    List<Customer> getAllCustomer();
    Customer getCustomerByID (int customerId);
    int updateCustomer(int customerId,Customer customer);
}
