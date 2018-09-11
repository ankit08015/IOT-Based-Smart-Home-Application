/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organisation.Organisation;
import Business.Organisation.OrganisationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */
public class Enterprise extends Organisation{

    private String enterpriseName;
    private OrganisationDirectory organisationDirectory;
    private static int entpriseId = 10000;
    private EnterpriseType enterpriseType;

    public Enterprise(String name,EnterpriseType type) {
        super(name);
        enterpriseName=name ;
        this.enterpriseType=type;
        entpriseId++;
        organisationDirectory = new OrganisationDirectory();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public enum EnterpriseType {
        Government("Government"), Market("Market"), Security("Security"), Society("Society");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

   
//    private int Enterprise_ID;
//    private String Enterprise_email;
//    private int Enterprise_Phone_no;
//    private String Enterprise_Address;
    public String getEnterpriseName() {
        return enterpriseName;
    }

    public OrganisationDirectory getOrganisationDirectory() {
        return organisationDirectory;
    }

    public static int getEntpriseId() {
        return entpriseId;
    }

    public static void setEntpriseId(int entpriseId) {
        Enterprise.entpriseId = entpriseId;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    
    

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        organisationDirectory = new OrganisationDirectory();
    }
    
    
    @Override
    public String toString()
    {
        return getOrgName();
    }


}
