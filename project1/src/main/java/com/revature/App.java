package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.com.revature.employeeInfo.*;

public final class App {

    public static void main(String[] args) {
        
        String url = "jdbc:postgresql://postgres.cvoui7q38caj.us-east-2.rds.amazonaws.com:5432/postgres";
        String username = "postgres";
        String password = "pgAdmin";
        String id = "4";
        Employee employee;

        employee = EmployeeGetter(url, username, password, id);

        System.out.println(employee.name);
    
    }

}
