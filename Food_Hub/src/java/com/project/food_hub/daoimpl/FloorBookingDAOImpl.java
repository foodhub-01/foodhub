/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.daoimpl;

import com.project.food_hub.dao.FloorBookingDAO;
import com.project.food_hub.entities.FloorBooking;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RaHuL
 */
public class FloorBookingDAOImpl implements FloorBookingDAO{
    

    @Override
    public int addFloorBooking(FloorBooking floorbooking) {
        int count = 0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt = con.prepareStatement("Insert FloorBooking(floorno,customerid) into values(?,?)");
            psmt.setInt(1,floorbooking.getBookFloorId());
            psmt.setInt(2,floorbooking.getFloorNo());
            count = psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FloorBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public int deleteCustomer(int bookFloorId) {
        int count = 0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt = con.prepareStatement("delete from floorbooking where bookFloorId=?");
            psmt.setInt(1,bookFloorId);
            count = psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FloorBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<FloorBooking> getAllFloorBooking() {
        List<FloorBooking> floorBookingList = null;
        try {
            Connection connection = DBConnection.getConnection(); 
            PreparedStatement psmt = connection.prepareStatement("select * from FloorBooking");
            ResultSet resultSet = psmt.executeQuery();
            floorBookingList = new ArrayList<FloorBooking>();
            if(resultSet!=null){
                while(resultSet.next()){
                    int bookFloorid = resultSet.getInt(1);
                    int floorNo = resultSet.getInt(2);
                    int customerId = resultSet.getInt(3);
                    FloorBooking floorBooking = new FloorBooking(bookFloorid,floorNo,customerId);
                    floorBookingList.add(floorBooking);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FloorBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return floorBookingList;
    }

    @Override
    public FloorBooking getFloorBookingbyId(int bookFloorId) {
           List<FloorBooking> floorBookingList = null;
        try {
            Connection connection = DBConnection.getConnection(); 
            PreparedStatement psmt = connection.prepareStatement("select * from FloorBooking where bokkFloorId=?");
            psmt.setInt(1, bookFloorId);
            ResultSet resultSet = psmt.executeQuery();
            floorBookingList = new ArrayList<FloorBooking>();
            if(resultSet!=null){
                while(resultSet.next()){
                    int BookFloorid = resultSet.getInt(1);
                    int floorNo = resultSet.getInt(2);
                    int customerId = resultSet.getInt(3);
                    FloorBooking floorBooking = new FloorBooking(BookFloorid,floorNo,customerId);
                    floorBookingList.add(floorBooking);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FloorBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(floorBookingList.size()>0) return floorBookingList.get(0);
        else return null;
    }

    @Override
    public int updateFloorBooking(int bookfloorId, FloorBooking floorbooking) {
        int count = 0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt = con.prepareStatement("update floorbooking set floorNo=?,customerId=?");
            psmt.setInt(1,floorbooking.getFloorNo());
            psmt.setInt(2,floorbooking.getCustomerId());
            count = psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FloorBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
    
}
