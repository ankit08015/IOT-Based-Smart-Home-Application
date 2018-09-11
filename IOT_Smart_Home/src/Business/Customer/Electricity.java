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
public class Electricity {
    private int elecDays;
    private int elecThreshold;
    private int charge;
    

    
    public Electricity()
    {
        elecDays=0;
        elecThreshold=10;
    }
    
    public int getElecDays() {
        return elecDays;
    }

    public void setElecDays(int elecDays) {
        this.elecDays = elecDays;
    }

    public int getElecThreshold() {
        return elecThreshold;
    }

    public void setElecThreshold(int elecThreshold) {
        this.elecThreshold = elecThreshold;
    }
    
    public void addElecDays(int value)
    {
        elecDays=elecDays+value;
    }
        
}
