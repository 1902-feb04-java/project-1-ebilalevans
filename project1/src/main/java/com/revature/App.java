package com.revature;


import com.revature.employeeInfo.*;
import com.revature.reimbursementInfo.*;

public final class App {

    public static void main(String[] args) {
        
        
        String id = "4";
        Employee employee;

        employee = EmployeeGetter.getInfo(id);

        System.out.println(employee.name);
    
    }

}
