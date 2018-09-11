/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Customer.CustomerDirectory;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */
public class Network {
    
  private String name;
  String Latitude;
  String Longitude;
    
    private EnterpriseDirectory enterpriseDirectory;
    private CustomerDirectory customerDirectory;

    public Network() {
        enterpriseDirectory= new EnterpriseDirectory();
        customerDirectory = new CustomerDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }
    

    @Override
    public String toString()
    {
        return name;
    }
    
    public boolean uniEnterprise(String name) {
        for (Enterprise e : enterpriseDirectory.getEnterpriseList()) {
            System.out.println(e.getOrgName());
            System.out.println(name);
            
            if (e.getOrgName().equals(name)) {
                return true;
            }
            
        }
        return false;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }
    
    
    
    
    
}