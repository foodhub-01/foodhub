/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.daoimpl;

import com.project.food_hub.dao.TableBookingDAO;
import com.project.food_hub.entities.TableBooking;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RaHuL
 */
public class TableBookingDAOImpl implements TableBookingDAO{

    @Override
    public int addTableBooking(TableBooking tablebooking) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt=con.prepareStatement("Insert tablebooking(int customerId,int tableno) Values(?,?)");
            psmt.setInt(1,tablebooking.getCustomerId());
            psmt.setInt(2,tablebooking.getTableNo());
            count = psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TableBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return count;
    }

    @Override
    public int deleteTableBooking(int bookTableId) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt=con.prepareStatement("Delete from tablebooking where booktableId=?");
            psmt.setInt(1, bookTableId);
            count=psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TableBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return count;
    }

    @Override
    public List<TableBooking> getAllTableBooking() {
        List<TableBooking> tablebookinglist=null;
        try {
            
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt =con.prepareStatement("Select * from tablebooking");
            ResultSet resultSet=psmt.executeQuery();
            tablebookinglist=new ArrayList<TableBooking>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int booktableId = resultSet.getInt(1);
                    int customerId = resultSet.getInt(2);
                    int tableno = resultSet.getInt(3);
                    TableBooking tableBooking = new TableBooking(booktableId,customerId,tableno);
                    tablebookinglist.add(tableBooking);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return tablebookinglist;
    }

    @Override
    public TableBooking getTableBookingById(int bookTableId) {
            List<TableBooking> tablebookinglist=null;
        try {
            
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt =con.prepareStatement("Select * from tablebooking bookTableId=?");
            psmt.setInt(1, bookTableId);
            ResultSet resultSet=psmt.executeQuery();
            tablebookinglist=new ArrayList<TableBooking>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int bookTableid = resultSet.getInt(1);
                    int customerId = resultSet.getInt(2);
                    int tableno = resultSet.getInt(3);
                    TableBooking tableBooking = new TableBooking(bookTableid,customerId,tableno);
                    tablebookinglist.add(tableBooking);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(tablebookinglist.size()>0) return tablebookinglist.get(0);
        else return null;

    }

    @Override
    public int updateTableBooking(int bookTableId, TableBooking tablebooking) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt=con.prepareStatement("Update tablebooking set customerId=?,tableno=? where bookTableId=?");
            psmt.setInt(1,tablebooking.getCustomerId());
            psmt.setInt(2, tablebooking.getTableNo());
            psmt.setInt(3, bookTableId);
            count=psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TableBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return count;
    }
    
}
