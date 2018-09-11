/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.ElectricityRole;
import Business.Role.EventManagementRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ankit
 */
public class EventManagementOrganization extends Organisation  {
    
    public EventManagementOrganization() {
        super(SocietyType.EventAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EventManagementRole());
        return roles;
    }
    
}
