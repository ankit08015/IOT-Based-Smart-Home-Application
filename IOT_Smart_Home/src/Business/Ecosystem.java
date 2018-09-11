/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.Role.AdminRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */
public class Ecosystem extends Organisation{

    private ArrayList<Network> NetworkDirectory;
    //private CustomerDirectory customerDirectory;
    //private UserAccountDirectory userAccountDirectory;
    //private EmployeeDirectory employeeDirectory;

    private static Ecosystem ecoSystem;

    public static Ecosystem getInstance() {
                      System.out.println("getting instance 2");

        if (ecoSystem == null) {
                          System.out.println("getting instance 3");

        System.out.println("in business0--creating object");

            ecoSystem = new Ecosystem();
             System.out.println("getting instance 3.5="+ecoSystem.getNetworkDirectory().size());
             System.out.println("getting instance 3.9="+ecoSystem);
             
            
        }
          System.out.println("getting instance 4");

        return ecoSystem;
    }
    
       @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new AdminRole());
        return roleList;
    }
    
    private Ecosystem(){
        super(null);
        System.out.println("after orgs");
        NetworkDirectory=new ArrayList<Network>();
                System.out.println("after constructor");

    }

    public ArrayList<Network> getNetworkDirectory() {
        return NetworkDirectory;
    }


    public static Ecosystem getEcoSystem() {
        return ecoSystem;
    }

     public Network createAndAddNetwork() {
        Network network = new Network();
        NetworkDirectory.add(network);
        return network;
    }
     
    
    public void DeleteNetwork(Network n) {
        NetworkDirectory.remove(n);
    }
    
    public boolean checkIfNetworkisUnique(String networkName) {

        for (Network n : this.NetworkDirectory) {
            if (n.getName().equals(networkName)) {
                return true;

            }

        }
        return false;

    }
    
    
        public boolean checkIfUsernameIsUnique(String username) {

        for (UserAccount ua : this.getUserAccountDir().getUserAccountDirectory()) {
            
            if (ua.getUserName().equals(username)) {
                return false;
            }
            for (Network n : this.getNetworkDirectory()) {
                for (Enterprise ent : n.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserAccount ucc : ent.getUserAccountDir().getUserAccountDirectory()) {
                        
                        if (ucc.getUserName().equals(username)) {
                            return false;
                        }
                        for (Organisation org : ent.getOrganisationDirectory().getOrganizationlist()) {
                            for (UserAccount accOrg : org.getUserAccountDir().getUserAccountDirectory()) {
                                if (accOrg.getUserName().equals(username)) {
                                    return false;
                                }
                            }

                        }
                    }

                }
            }

        }
        return true;
    }

    @Override
    public String toString() {
        return "Ecosystem{" + "NetworkDirectory=" + NetworkDirectory + '}';
    }
        
        


}
