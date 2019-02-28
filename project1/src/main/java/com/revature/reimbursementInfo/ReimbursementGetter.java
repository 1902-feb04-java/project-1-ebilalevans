package com.revature.reimbursementInfo;

public class ReimbursementGetter {
    
    public static Reimbursement getLines(String id) {
        String submitDate, employee, amount, status, manager;


        //try-catch to get reimbursements from SQL table

        Reimbursement reimbursement = new Reimbursement(id,submitDate,employee,amount,status,manager);
        return reimbursement;
    }
    
}