/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.dao;

import com.project.food_hub.entities.Floor;
import java.util.List;

/**
 *
 * @author RaHuL
 */
public interface FloorDAO {
    int addFloor(Floor floor);
    int deleteFloor(int floorNo);
    List<Floor> getAllFloor();
    Floor getFloorById(int floorNo);
    int updateFloor(int floorNo,Floor floor);
}
