/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.daoimpl;

import com.project.food_hub.dao.FloorDAO;
import com.project.food_hub.entities.Floor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RaHuL
 */
public class FloorDAOImpl implements FloorDAO{

    @Override
    public int addFloor(Floor floor) {
        
        int count = 0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt = con.prepareStatement("insert into floor(floorCapacity) value(?)");
            psmt.setInt(1,floor.getFloorCapacity());
            count = psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FloorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public int deleteFloor(int floorNo) {
        int count = 0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt = con.prepareStatement("delete from floor where floorNo=?");
            psmt.setInt(1,floorNo);
            count = psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FloorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<Floor> getAllFloor() {
        List<Floor> floorList = null;
        try {
            Connection con = DBConnection.getConnection(); 
            PreparedStatement psmt = con.prepareStatement("select * from floor");
            ResultSet resultSet = psmt.executeQuery();
            floorList = new ArrayList<Floor>();
            if(resultSet!=null){
                  while(resultSet.next()){
                    int floorNo = resultSet.getInt(1);
                    int floorCapacity = resultSet.getInt(2);
                    Floor floor = new Floor(floorNo,floorCapacity);
                    floorList.add(floor);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return floorList;
    
    }

    @Override
    public Floor getFloorById(int floorNo) {
     List<Floor> floorList = null;
        try {
            Connection con = DBConnection.getConnection(); 
            PreparedStatement psmt = con.prepareStatement("select * from floor where floorNo=?");
            psmt.setInt(1,floorNo);
            ResultSet resultSet = psmt.executeQuery();
            floorList = new ArrayList<Floor>();
            if(resultSet!=null){
                  while(resultSet.next()){
                    int floorno = resultSet.getInt(1);
                    int floorCapacity = resultSet.getInt(2);
                    Floor floor = new Floor(floorno,floorCapacity);
                    floorList.add(floor);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(floorList.size()>0) return floorList.get(0);
        else return null;
    }

    @Override
    public int updateFloor(int floorNo, Floor floor) {
       int count = 0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt = con.prepareStatement("update floor set floorCapacity=? where floorNo=?");
            psmt.setInt(1,floor.getFloorCapacity());
            psmt.setInt(2,floorNo);
            count = psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FloorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
    
}
