/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Himani Solanki
 */
public class ElectricityWorkRequest extends WorkRequest{
   private double reqCharges;
   private int elec_bill_days;
   
   public double getReqCharges() {
        return reqCharges;
    }

    public void setReqCharges(double reqCharges) {
        this.reqCharges = reqCharges;
    }

    public int getElec_bill_days() {
        return elec_bill_days;
    }

    public void setElec_bill_days(int elec_bill_days) {
        this.elec_bill_days = elec_bill_days;
    }
    
    
    
    
}
