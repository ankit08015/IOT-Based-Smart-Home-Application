/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.MarketEnterpriseRole;
import Business.Role.Role;
import Business.Role.SecurityEnterpriseRole;
import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */
public class MarketEnterprise extends Enterprise{
    
    public MarketEnterprise(String name,EnterpriseType type) {
        super(name,type.Market);
    }
    
@Override
public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList<>();
    roles.add(new MarketEnterpriseRole());
    return roles; //To change body of generated methods, choose Tools | Templates.
}
    
}
