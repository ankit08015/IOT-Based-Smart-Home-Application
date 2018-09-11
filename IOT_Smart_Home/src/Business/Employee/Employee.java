/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author ankit
 */
public class Employee {
    private String name;
    private WorkQueue workQueue;
    private static int empId=6000;
    private UserAccount empUserAcc;
    private Role role;
    
    public Employee()
    {
        empId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return empUserAcc.getWorkQueue();
    }

//    public void setWorkQueue(WorkQueue workQueue) {
//        this.workQueue = workQueue;
//    }

    public static int getEmpId() {
        return empId;
    }

    public static void setEmpId(int empId) {
        Employee.empId = empId;
    }

    public UserAccount getEmpUserAcc() {
        return empUserAcc;
    }

    public void setEmpUserAcc(UserAccount empUserAcc) {
        this.empUserAcc = empUserAcc;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    
    @Override
    public String toString(){
        return name;
    }
}
