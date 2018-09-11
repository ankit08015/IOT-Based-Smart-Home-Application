/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author ankit
 */
public abstract class Role {
    
        public enum RoleType{
        Admin("Admin"), Customer("Customer"), DeliveryMan("DeliveryMan"), Electricity("Electricity"), Garbage("GarbageAdmin"), Grocery("Grocery"),
        Maintenance("Maintenance"), SecurityStaff("SecurityStaff"),  EventManagement("EventManagement"), Water("Water"),
        GovernmentAdmin("GovernmentAdmin"),SocietyAdmin("SocietyAdmin"),MarketAdmin("MarketAdmin"),SecurityAdmin("SecurityAdmin")
        ,DeliveryAdmin("DeliveryAdmin"),RetailerAdmin("RetailerAdmin"),GarbageStaff("GarbageStaff"),ParkingAdmin("ParkingAdmin") ;
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
        
public abstract JPanel createWorkArea(
        JPanel userProcessContainer, 
        UserAccount account, 
        Organisation organization, 
        Enterprise enterprise, 
        Ecosystem business);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    
}
}
