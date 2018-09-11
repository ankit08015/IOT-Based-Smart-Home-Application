/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author Himani Solanki
 */
public class Water {
    private int waterDays;
    private int waterThreshold;
    private int charge;

    public Water()
    {
       waterDays=0;
       waterThreshold=10;
    }
    
    public int getWaterDays() {
        return waterDays;
    }

    public void setWaterDays(int waterDays) {
        this.waterDays = waterDays;
    }

    public int getWaterThreshold() {
        return waterThreshold;
    }

    public void setWaterThreshold(int waterThreshold) {
        this.waterThreshold = waterThreshold;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }
    
    public void addWaterDays(int value)
    {
        waterDays=waterDays+value;
    }
    
}
