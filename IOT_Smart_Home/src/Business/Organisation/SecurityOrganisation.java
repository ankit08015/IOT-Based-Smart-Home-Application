/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.Role;
import Business.Role.SecurityAdminRole;
import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */
public class SecurityOrganisation extends Organisation  {
    
    public SecurityOrganisation() {
        super(SecurityType.SecurityAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SecurityAdminRole());
        return roles;
    }
    
}
