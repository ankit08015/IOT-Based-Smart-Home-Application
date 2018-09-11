/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.ElectricityRole;
import Business.Role.MarketAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */
public class MarketOrganisation extends Organisation {
    
        public MarketOrganisation() {
        super(MarketType.MarketAdmin.getValue());
    }

        

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MarketAdmin());
        return roles;
    }
    
}
