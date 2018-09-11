/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organisation.Grocery.GroceryOrganisation;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author ankit
 */
public class RetailerAdmin extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organization, Enterprise enterprise, Ecosystem business) {
        return new Interface.Retailer.RetailerWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }
    
}
