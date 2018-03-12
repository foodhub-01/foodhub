/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.dao;

import com.project.food_hub.entities.TableBooking;
import java.util.List;

/**
 *
 * @author RaHuL
 */
public interface TableBookingDAO {
    int addTableBooking(TableBooking tablebooking);
    int deleteTableBooking(int bookTableId);
    List<TableBooking> getAllTableBooking();
    TableBooking getTableBookingById (int bookTableId);
    int updateTableBooking(int bokkTableId,TableBooking tablebooking);
}
