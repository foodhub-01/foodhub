/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.dao;

import com.project.food_hub.entities.Order;
import java.util.List;

/**
 *
 * @author RaHuL
 */
public interface OrderDAO {
    int addOrder(Order order);
    int deleteOrder(int orderId);
    List<Order> getAllOrder();
    Order getOrderById(int orderId);
    int updateOrder(int orderId,Order order);
}
