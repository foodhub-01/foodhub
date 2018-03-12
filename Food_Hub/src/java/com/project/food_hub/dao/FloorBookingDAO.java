/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.dao;

import com.project.food_hub.entities.FloorBooking;
import java.util.List;

/**
 *
 * @author RaHuL
 */
public interface FloorBookingDAO {
    int addFloorBooking(FloorBooking floorbooking);
    int deleteCustomer(int bookFloorId);
    List<FloorBooking> getAllFloorBooking();
    FloorBooking getFloorBookingbyId(int bookFloorId);
    int updateFloorBooking(int bookfloorId,FloorBooking floorbooking);
}
