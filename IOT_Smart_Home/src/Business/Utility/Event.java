/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utility;

import Business.Customer.Customer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author ankit
 */
public class Event {
    
    private String eventName;
    private String eventDescription;
    private int eventCapacity;
    private int addedSeat;
    private int vacantSeat;
    private Date eventDate;
    private Customer eventAdmin;
    private String location;
    private ArrayList<String> eventChatBox;
    private String status;
    private HashMap<Customer,Integer> attendeesList;
    
    
    public Event(String eventName, String  eventDescription,int eventCapacity, Date eventDate,String location){
        this.eventName=eventName;
        this.eventDescription=eventDescription;
        this.eventCapacity=eventCapacity;
        addedSeat=0;
        vacantSeat=eventCapacity;
        this.eventDate=eventDate;
        eventChatBox= new ArrayList<>();
        eventChatBox.add("Start of chat");
        eventChatBox.add("Have fun :)");
        status="PENDING";
        this.location=location;
        attendeesList=new HashMap<>();
        
    }

    public HashMap<Customer, Integer> getAttendeesList() {
        return attendeesList;
    }

    public void setAttendeesList(HashMap<Customer, Integer> attendeesList) {
        this.attendeesList = attendeesList;
    }
    
    

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<String> getEventChatBox() {
        return eventChatBox;
    }

    public void setEventChatBox(ArrayList<String> eventChatBox) {
        this.eventChatBox = eventChatBox;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

    public Customer getEventAdmin() {
        return eventAdmin;
    }

    public void setEventAdmin(Customer eventAdmin) {
        this.eventAdmin = eventAdmin;
    }
    
    

    public Date getEventDate() {
        return eventDate;
    }
    
    

    public String getEventName() {
        return eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public int getEventCapacity() {
        return eventCapacity;
    }

    public int getAddedSeat() {
        return addedSeat;
    }

    public int getVacantSeat() {
        return vacantSeat;
    }
    
    public void bookSeat(int n, Customer customer){
        addedSeat=addedSeat+n;
        vacantSeat=eventCapacity-addedSeat;
        attendeesList.put(customer, n);
    }
    
    public void deleteBooking(Customer customer){
        int n= attendeesList.get(customer);
        addedSeat=addedSeat-n;
        vacantSeat=eventCapacity-addedSeat;
        attendeesList.remove(customer);
    }
    
    public void changeDate(Date date){
        eventDate= date;
    }
    
    
    
}
