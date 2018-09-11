/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utility;

import Business.WorkQueue.WorkRequest;
import java.util.LinkedHashMap;

/**
 *
 * @author ankit
 */
public class Wallet {
    
    private double walletAmount;
    private LinkedHashMap<WorkRequest, Double> transactionList; 
    
    public Wallet(){
      transactionList= new LinkedHashMap<>();
    }
    
    public Wallet(Double walletAmount){
        //this.walletAmount=walletAmount;
         transactionList= new LinkedHashMap<>();
        addMoney(walletAmount);
       

    }
    
    public void addMoney(double amt){
        WorkRequest wrDummy= new WorkRequest();
        wrDummy.setMessage("Added Money to Wallet.");
        wrDummy.setResolveDate(wrDummy.getRequestDate());
        transactionList.put(wrDummy, amt);
        walletAmount=walletAmount+amt;
    }
    
    public void debitFromWallet(WorkRequest wr, Double amt){
        walletAmount= walletAmount-amt;
        amt=0-amt;
        transactionList.put(wr, amt);
    }

    public double getWalletAmount() {
        return walletAmount;
    }

    public LinkedHashMap<WorkRequest, Double> getTransactionList() {
        return transactionList;
    }
    
    
    
}
