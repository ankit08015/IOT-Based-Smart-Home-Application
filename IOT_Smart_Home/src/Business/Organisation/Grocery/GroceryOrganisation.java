/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation.Grocery;

import Business.Organisation.Organisation;
import Business.Role.GroceryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */
public class GroceryOrganisation extends Organisation  {
    
    private ArrayList<GroceryProduct> groceryProductDirectory;
    
        public GroceryOrganisation() 
    {
        super(MarketType.MarketAdmin.getValue());
                    System.out.println("in grocery orgs");

        groceryProductDirectory = new ArrayList<>();
    }

    public ArrayList<GroceryProduct> getGroceryProductDirectory() {
        
        return groceryProductDirectory;
    }
    
    public GroceryProduct addProduct()
    {
        GroceryProduct pd = new GroceryProduct() {} ;
        groceryProductDirectory.add(pd);
        return pd;
    }
    
    public void removeProd(GroceryProduct pd)
    {
        groceryProductDirectory.remove(pd);
           
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new GroceryRole());
        return roles;
    }
    
}
