/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.MaintenanceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */
public class MaintenanceOrganisation extends Organisation  {
    
    private double moneyBalance;

    public double getMoneyBalance() {
        return moneyBalance;
    }

    public void setMoneyBalance(double moneyBalance) {
        this.moneyBalance = moneyBalance;
    }
    
    
    public MaintenanceOrganisation() {
        super(SocietyType.MaintenanceAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MaintenanceRole());
        return roles;
    }
    
}
