/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ankit
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeDirectory;
    
    public EmployeeDirectory(){
        employeeDirectory= new ArrayList<>();
        
    }

    public ArrayList<Employee> getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    
    public Employee createEmployee(String name, Role role)
    {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setRole(role);
        
        //employee.setEmpUserAcc(empUserAcc);
        /////
        //ROLE and WORK QUEUE????
        /////
        employeeDirectory.add(employee);
        return employee;
    
    }
    
    
    
}
