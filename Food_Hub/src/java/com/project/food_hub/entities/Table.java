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
public class Table {

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Table(int capacity) {
        this.capacity = capacity;
    }

    public Table(int tableNo, int capacity) {
        this.tableNo = tableNo;
        this.capacity = capacity;
    }
    int tableNo;
    int capacity;
    
    
}
