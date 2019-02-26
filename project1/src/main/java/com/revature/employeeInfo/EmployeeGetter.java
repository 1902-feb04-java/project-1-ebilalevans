package com.revature.employeeInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeGetter {
    String name;
    String address;
    String manager;
    String dateHired;
    String id;

    EmployeeGetter(url, username, password, id) {  
        
        try(Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employees WHERE id = " + id);

            while (rs.next()) {
                name = rs.getString("first_name") + rs.getString("last_name");
                address = rs.getString("address_line1") + rs.getString("address_line2");
                manager = rs.getString("manager_id");
                dateHired = rs.getString("date_hired");
                this.id = id;
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Employee employee = new Employee(name, address, manager, dateHired, id);
    
        return employee;

    }


}