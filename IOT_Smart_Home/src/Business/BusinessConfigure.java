/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ajaygoel
 */
public class BusinessConfigure {
    
    public static Ecosystem configureABusiness() {
        
                            System.out.println("in configure business");

         
        Ecosystem ecoSystem = Ecosystem.getInstance();  
        
        Employee employee = new Employee();
        employee.setName("Ajay");
        employee.setRole(new AdminRole());
        UserAccount ua = ecoSystem.getUserAccountDir().addUserAccount("sysadmin", "sysadmin", employee,employee.getRole());
        return ecoSystem;
    }
    
}
