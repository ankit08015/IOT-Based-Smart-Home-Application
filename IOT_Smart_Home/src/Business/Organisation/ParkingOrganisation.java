/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.ParkingAdmin;
import Business.Customer.Parking;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */
public class ParkingOrganisation extends Organisation {

    //  String name= "Parking Organization";
    private ArrayList<Parking> parkSlots;
    
    private double moneyBalance;

    public double getMoneyBalance() {
        return moneyBalance;
    }

    public void setMoneyBalance(double moneyBalance) {
        this.moneyBalance = moneyBalance;
    }
    
    

    public ArrayList<Parking> getParkSlots() {
        return parkSlots;
    }

    public void setParkSlots(ArrayList<Parking> parkSlots) {
        this.parkSlots = parkSlots;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ParkingAdmin());
        return roles;
    }

 

    public ParkingOrganisation() {

        super(SocietyType.ParkingAdmin.getValue());
        System.out.println("in parking org");
        parkSlots = new ArrayList<>();

        String str[] = {"Clearway Street","Boston Harbour","NorthEnd","Washigton street","Oliver street","Aquarium","Fort Point","Stuart street","St Germaine Street"};
        
        for (String str1 : str) {
            Parking park = new Parking(str1);
            parkSlots.add(park);
        }
        
        
        
    }


    

}
