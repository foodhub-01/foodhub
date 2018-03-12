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
public class FloorBooking {

    public int getBookFloorId() {
        return bookFloorId;
    }

    public void setBookFloorid(int bookFloorId) {
        this.bookFloorId = bookFloorId;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public FloorBooking(int bookFloorId, int floorNo, int customerId) {
        this.bookFloorId = bookFloorId;
        this.floorNo = floorNo;
        this.customerId = customerId;
    }

    public FloorBooking(int floorNo, int customerId) {
        this.floorNo = floorNo;
        this.customerId = customerId;
    }
    int bookFloorId;
    int floorNo;
    int customerId;
    
}
