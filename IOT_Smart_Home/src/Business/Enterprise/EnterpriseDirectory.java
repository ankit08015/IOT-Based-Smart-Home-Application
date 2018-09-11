/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */

public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Government){
            enterprise = new GovernmentEnterprise(name, type);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.Market){
            enterprise = new MarketEnterprise(name, type);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.Security){
            enterprise = new SecurityEnterprise(name, type);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.Society){
            enterprise = new SocietyEnterprise(name, type);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
     public void DelEnterprise(Enterprise enterprise) {
       
        enterpriseList.remove(enterprise);
    }
}