package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.employeeInfo.*;

public final class App {

    public static void main(String[] args) {
        
        
        String id = "4";
        Employee employee;

        employee = EmployeeGetter.getInfo(id);

        System.out.println(employee.name);
    
    }

}
