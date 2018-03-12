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
public class Floor {

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public int getFloorCapacity() {
        return floorCapacity;
    }

    public void setFloorCapacity(int floorCapacity) {
        this.floorCapacity = floorCapacity;
    }

    public Floor(int floorNo, int floorCapacity) {
        this.floorNo = floorNo;
        this.floorCapacity = floorCapacity;
    }

    public Floor(int floorCapacity) {
        this.floorCapacity = floorCapacity;
    }
    int floorNo;
    int floorCapacity;
    
}
