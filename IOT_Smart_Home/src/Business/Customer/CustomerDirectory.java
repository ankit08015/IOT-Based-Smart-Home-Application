/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author ankit
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> custList;
    
    
    public CustomerDirectory(){
    custList= new ArrayList<>();
    }
    
    public Customer addCustomer(){
        Customer cust= new Customer();
        custList.add(cust);
        return cust;
    }

    public ArrayList<Customer> getCustList() {
        return custList;
    }

    public void setCustList(ArrayList<Customer> custList) {
        this.custList = custList;
    }
    
    
    
}
