/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.daoimpl;

import com.project.food_hub.dao.TableDAO;
import com.project.food_hub.entities.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RaHuL
 */
public class TableDAOImpl implements TableDAO {

    @Override
    public int addTable(Table table) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt=con.prepareStatement("Insert into mastertable(tablecapacity) values(?)");
            psmt.setInt(1,table.getCapacity());
            count=psmt.executeUpdate();
                    
                    
                    } catch (SQLException ex) {
            Logger.getLogger(TableDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return count;
    }

    @Override
    public int deleteTable(int tableNo) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt=con.prepareStatement("Delete from mastertable where tableno=?");
            psmt.setInt(1, tableNo);
            count=psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TableDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return count;
    }

    @Override
    public List<Table> getAllTable() {
        List<Table> tableList = null;
        try {
            
            
            
            Connection con=DBConnection.getConnection();
            PreparedStatement psmt=con.prepareStatement("Select * from mastertable");
            ResultSet resultSet=psmt.executeQuery();
            tableList = new ArrayList<Table>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int tableno = resultSet.getInt(1);
                    int capacity = resultSet.getInt(2);
                    Table table = new Table(tableno,capacity);
                    tableList.add(table);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tableList;
    }

    @Override
    public Table getTableById(int tableNo) {
        List<Table> tableList = null;
        try {
            
            
            
            Connection con=DBConnection.getConnection();
            PreparedStatement psmt=con.prepareStatement("Select * from mastertable where tableno=?");
            psmt.setInt(1, tableNo);
            ResultSet resultSet=psmt.executeQuery();
            tableList = new ArrayList<Table>();
            if(resultSet!=null){
                while(resultSet.next()){
                    int tableno = resultSet.getInt(1);
                    int capacity = resultSet.getInt(2);
                    Table table = new Table(tableno,capacity);
                    tableList.add(table);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(tableList.size()>0) return tableList.get(0);
        else return null;
        
    }

    @Override
    public int updateTable(int tableNo, Table table) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt=con.prepareStatement("Update mastertable set tablecapacity=? where tableno=?");
            psmt.setInt(1,table.getCapacity() );
            psmt.setInt(2, tableNo);
            count = psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TableDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
    
}
