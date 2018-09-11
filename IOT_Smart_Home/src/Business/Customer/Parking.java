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
   public class Parking {

       
        private String location;
        private int numberOfLocation;
        private int numOfAvailableLoc;
       
        
        public Parking(String location){
            this.location=location;
            this.numberOfLocation=10;
            this.numOfAvailableLoc=10;
           
            
        }
        
        

        public int getNumberOfLocation() {
            return numberOfLocation;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public int getNumOfAvailableLoc() {
            return numOfAvailableLoc;
        }

        public void setNumOfAvailableLoc(int numOfAvailableLoc) {
            this.numOfAvailableLoc = numOfAvailableLoc;
        }

        public void bookParking(int num){
          
           numOfAvailableLoc=numOfAvailableLoc-num;
            
        }
        
        public void clearParking(int slots){
            numOfAvailableLoc=numOfAvailableLoc+slots;
        }

    @Override
    public String toString() {
        return "Parking{" + "location=" + location + ", numberOfLocation=" + numberOfLocation + ", numOfAvailableLoc=" + numOfAvailableLoc + '}';
    }

       
        

    }
