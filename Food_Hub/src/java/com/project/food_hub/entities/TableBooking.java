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
public class TableBooking {

    public int getBookTableId() {
        return bookTableId;
    }

    public void setBookTableId(int bookTableId) {
        this.bookTableId = bookTableId;
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public TableBooking(int bookTableId, int tableNo, int customerId) {
        this.bookTableId = bookTableId;
        this.tableNo = tableNo;
        this.customerId = customerId;
    }

    public TableBooking(int tableNo, int customerId) {
        this.tableNo = tableNo;
        this.customerId = customerId;
    }
    int bookTableId;
    int tableNo;
    int customerId;
    
    
}
