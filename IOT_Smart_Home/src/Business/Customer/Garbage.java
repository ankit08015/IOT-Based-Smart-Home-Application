/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author ankit
 */
public class Garbage {
    
    private int garbageContainerWeight;
    private int garbageContainerThreshold;

    public Garbage() {
        garbageContainerWeight=0;
        garbageContainerThreshold=10;
    }

    public int getGarbageContainerWeight() {
        return garbageContainerWeight;
    }

    public void setGarbageContainerWeight(int garbageContainerWeight) {
        this.garbageContainerWeight = garbageContainerWeight;
    }

    public int getGarbageContainerThreshold() {
        return garbageContainerThreshold;
    }

    public void setGarbageContainerThreshold(int garbageContainerThreshold) {
        this.garbageContainerThreshold = garbageContainerThreshold;
    }
    
    public void addGarbage(int value){
        garbageContainerWeight=garbageContainerWeight+value;
    }

}
