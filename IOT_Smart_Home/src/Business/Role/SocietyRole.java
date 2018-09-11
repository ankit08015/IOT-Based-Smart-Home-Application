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
public class SocietyRole extends Role {

    
    @Override
    public String toString() {
        return RoleType.DeliveryAdmin.getValue();
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organization, Enterprise enterprise, Ecosystem business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
