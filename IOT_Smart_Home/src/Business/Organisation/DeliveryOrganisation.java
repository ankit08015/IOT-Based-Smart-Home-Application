/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.DeliveryAdmin;
import Business.Role.DeliveryManRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */
public class DeliveryOrganisation extends Organisation {
    
    public DeliveryOrganisation() {
        super(MarketType.DeliveryAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DeliveryAdmin());
        return roles;
    }
    
}
