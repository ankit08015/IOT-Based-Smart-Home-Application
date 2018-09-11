/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author ankit
 */
public class ParkingRequest extends WorkRequest {
    
    private int numOfSlots;
    private String parkingLoc;
    
     private double reqCharges;

    public double getReqCharges() {
        return reqCharges;
    }

    public void setReqCharges(double reqCharges) {
        this.reqCharges = reqCharges;
    }

    public int getNumOfSlots() {
        return numOfSlots;
    }

    public void setNumOfSlots(int numOfSlots) {
        this.numOfSlots = numOfSlots;
    }

    public String getParkingLoc() {
        return parkingLoc;
    }

    public void setParkingLoc(String parkingLoc) {
        this.parkingLoc = parkingLoc;
    }
    
    
    
}
