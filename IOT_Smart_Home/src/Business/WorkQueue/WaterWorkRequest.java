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
public class WaterWorkRequest extends WorkRequest{
    private double reqCharges;
    private int water_bill_days;
   
   public double getReqCharges() {
        return reqCharges;
    }

    public void setReqCharges(double reqCharges) {
        this.reqCharges = reqCharges;
    }

    public int getWater_bill_days() {
        return water_bill_days;
    }

    public void setWater_bill_days(int water_bill_days) {
        this.water_bill_days = water_bill_days;
    }
    
    
}
