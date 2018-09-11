/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organisation.Organisation;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import javax.swing.JPanel;

/**
 *
 * @author ajaygoel
 */
public class UserAccount {
    
    private String userName;
    private String password;
    private Role role;
    private Employee employee;
    private WorkQueue workQueue;
    
    public UserAccount()
    {
        workQueue = new WorkQueue();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    @Override
    public String toString()
    {
        return userName;
    }





    
}
