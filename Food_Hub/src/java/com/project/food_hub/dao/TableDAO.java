/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.dao;

import com.project.food_hub.entities.Table;
import java.util.List;

/**
 *
 * @author RaHuL
 */
public interface TableDAO {
 int addTable(Table table);
    int deleteTable(int tableNo);
    List<Table> getAllTable();
    Table getTableById(int tableNo);
    int updateTable(int tableNo,Table table);   
}
