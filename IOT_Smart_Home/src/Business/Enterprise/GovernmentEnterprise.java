/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.GovernmentEnterpriseRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */
public class GovernmentEnterprise extends Enterprise {
    
    public GovernmentEnterprise(String name,EnterpriseType type) {
        super(name,type.Government);
    }
    
@Override
public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList<>();
    roles.add(new GovernmentEnterpriseRole());
    return roles; //To change body of generated methods, choose Tools | Templates.
}

   
}
