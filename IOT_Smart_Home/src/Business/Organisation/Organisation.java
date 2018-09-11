/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.Utility.Wallet;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */
public abstract class Organisation {

    private String orgName;
    private EmployeeDirectory empList;
    private UserAccountDirectory userAccountDirectory;
    private ArrayList<Role> roleList;
    private WorkQueue workQueue;
    private Wallet wallet;
    //double profit = 0;

    private static int orgId = 2000;

    public Organisation() {
                            System.out.println("in orgs");

        orgId++;
        empList = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        roleList = new ArrayList<>();
        workQueue = new WorkQueue();
        wallet = new Wallet(0.00);

    }
    
    public Organisation(String name) {
                            System.out.println("in orgs");

        this.orgName = name;
        orgId++;
        empList = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        roleList = new ArrayList<>();
        workQueue = new WorkQueue();
        wallet = new Wallet(0.00);

    }

    

    
      public enum GovernmentType {
        ElectricityAdmin("Admin Electricity"),WaterAdmin("Admin Water");
        private String value;

        private GovernmentType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
      
     public enum SocietyType {
        EventAdmin("Admin Event"),GarbageAdmin("Admin Garbage"),MaintenanceAdmin("Admin Maintenance"),ParkingAdmin("Admin Parking");
        private String value;

        private SocietyType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    

          
    public enum MarketType {
        MarketAdmin("Admin Grocery"),DeliveryAdmin("Admin Delivery"),RetailerAdmin("Admin Retailer");
        private String value;

        private MarketType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
               


                 
    public enum SecurityType {
        SecurityAdmin("Admin Security");
        private String value;

        private SecurityType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
        public enum CustomerType {
        CustomerType("Admin Customer");
        private String value;

        private CustomerType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public EmployeeDirectory getEmpList() {
        return empList;
    }

    public void setEmpList(EmployeeDirectory empList) {
        this.empList = empList;
    }

    public UserAccountDirectory getUserAccountDir() {
        return userAccountDirectory;
    }

    public void setUserAccountDir(UserAccountDirectory userAccountDir) {
        this.userAccountDirectory = userAccountDir;
    }

    public ArrayList<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(ArrayList<Role> roleList) {
        this.roleList = roleList;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public static int getOrgId() {
        return orgId;
    }

    public static void setOrgId(int orgId) {
        Organisation.orgId = orgId;
    }
    
    public abstract ArrayList<Role> getSupportedRole();

//    public double getProfit() {
//        return profit;
//    }
//
//    public void setProfit(double profit) {
//        this.profit = profit;
//    }
    
    public double getWallet() {
        return wallet.getWalletAmount();
    }

    public void setWallet(double wallet) {
        this.wallet = new Wallet(wallet);
    }

public void addMoney(double amt){
        wallet.addMoney(amt);
    }
    
    public void debitMoney(WorkRequest wr,Double amt){
        wallet.debitFromWallet(wr, amt);
    }

    public Wallet getWalletObj() {
        return wallet;

    }
    
    
    
@Override
    public String toString() {
        return orgName;
    }
}
