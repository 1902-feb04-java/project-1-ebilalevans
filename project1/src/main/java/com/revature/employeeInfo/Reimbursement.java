package com.revature.employeeInfo;

public class Reimbursement {
    public String id, submitDate, employee, amount, status, manager;


    Reimbursement(String id, String submitDate, String employee, String amount, String status, String manager) {
        this.id = id;
        this.submitDate = submitDate;
        this.employee = employee;
        this.amount = amount;
        this.status = status;
        this.manager = manager;
    }

}