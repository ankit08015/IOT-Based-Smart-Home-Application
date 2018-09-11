/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.DeliveryManRole;
import Business.Role.ElectricityRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */
public class ElectricityOrganisation extends Organisation {
    
    public ElectricityOrganisation() {
        super(GovernmentType.ElectricityAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ElectricityRole());
        return roles;
    }
    
}
