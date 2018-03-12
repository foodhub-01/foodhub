/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.dao;

import com.project.food_hub.entities.Employee;
import java.util.List;

/**
 *
 * @author RaHuL
 */
public interface EmployeeDAO {
    int addEmployee(Employee employee);
    int deleteEmployee(int employeeId);
    List<Employee> getAllEmployee();
    Employee getEmployeeById(int employeeId);
    int updateEmployee(int employeeId,Employee employee);
    
}
