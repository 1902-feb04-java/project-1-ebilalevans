package com.revature.employeeInfo;

public class Employee {
    public String name;
    String address;
    String manager;
    String dateHired;
    String id;

    Employee(String name, String address, String manager, String dateHired, String id){
        this.name = name;
        this.address = address;
        this.manager = manager;
        this.dateHired = dateHired;
        this.id = id;
    }

}
