/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Network.Network;
import static Business.Role.Role.RoleType.Electricity;
import Business.UserAccount.UserAccount;
import Business.Utility.Event;
import Business.Utility.Notification;
import Business.Utility.Wallet;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author ankit
 */
public class Customer {

    private String First_name;
    private String Last_name;
    private int House_no;
    private String street;
    private String Location;
    private Network networkName;
    private int mobile_no;
    private int Credit_card_no;
    private String Mode_of_payment;
    private UserAccount userAcc;
    private WorkQueue workList;
    private ArrayList<Product> prodList;
    private Garbage garbageDetails;
    private double elecBill;
    private double waterBill;
    private Wallet wallet;
    private String Network_name;
    private String e_mail;
    private HashMap<String, Integer> parkingSlot;
    private int parkingThreshold;
    private Notification notification;
    private Electricity electricity;
    private Water water;
    private double eleUnits;
    private double waterUnits;
    private ArrayList<Event> myEvents;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int totalParkingBooked() {
        int count = 0;

        System.out.println(parkingSlot);

        Iterator it = parkingSlot.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            count = count + (Integer) pair.getValue();
            //  it.remove(); // avoids a ConcurrentModificationException
        }

        System.out.println("total booked= " + count);

        return count;
    }

    public Customer(Network network, UserAccount userAccount, String name, int house_no, String address) {
        this.networkName = network;
        this.userAcc = userAccount;
        workList = new WorkQueue();
        this.First_name = name;
        this.House_no = house_no;
        this.Location = address;
        prodList = new ArrayList<>();
        garbageDetails = new Garbage();
        parkingSlot = new HashMap<>();
        this.parkingThreshold = 5;
        wallet = new Wallet(1000.00);
        notification = new Notification();
        electricity = new Electricity();
        water = new Water();
        myEvents = new ArrayList<>();

    }

    public int getParkingThreshold() {
        return parkingThreshold;
    }

    public void setParkingThreshold(int parkingThreshold) {
        this.parkingThreshold = parkingThreshold;
    }

    public HashMap<String, Integer> getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(HashMap<String, Integer> parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public void addParking(String loc, int num) {

        if (parkingSlot.containsKey(loc)) {
            num = parkingSlot.get(loc) + num;
        }

        parkingSlot.put(loc, num);

        System.out.println("parking- " + parkingSlot.size());

    }

    public Customer() {
        workList = new WorkQueue();
        prodList = new ArrayList<>();
        garbageDetails = new Garbage();
        parkingSlot = new HashMap<>();
        this.parkingThreshold = 5;
        wallet = new Wallet(1000.00);
        notification = new Notification();
        electricity = new Electricity();
        water = new Water();
        myEvents = new ArrayList<>();

    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public Garbage getGarbageDetails() {
        return garbageDetails;
    }

    public void setGarbageDetails(Garbage garbageDetails) {
        this.garbageDetails = garbageDetails;
    }

    public Product addProduct() {
        Product p = new Product();
        prodList.add(p);
        return p;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }

    public int getHouse_no() {
        return House_no;
    }

    public void setHouse_no(int House_no) {
        this.House_no = House_no;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String address) {
        this.Location = address;
    }

    public int getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(int mobile_no) {
        this.mobile_no = mobile_no;
    }

    public int getCredit_card_no() {
        return Credit_card_no;
    }

    public void setCredit_card_no(int Credit_card_no) {
        this.Credit_card_no = Credit_card_no;
    }

    public String getMode_of_payment() {
        return Mode_of_payment;
    }

    public void setMode_of_payment(String Mode_of_payment) {
        this.Mode_of_payment = Mode_of_payment;
    }

    public Network getNetworkName() {
        return networkName;
    }

    public void setNetworkName(Network networkName) {
        this.networkName = networkName;
    }

    public UserAccount getUserAcc() {
        return userAcc;
    }

    public void setUserAcc(UserAccount userAcc) {
        this.userAcc = userAcc;
    }

    public WorkQueue getWorkList() {
        return workList;
    }

    public void setWorkList(WorkQueue workList) {
        this.workList = workList;
    }

    public ArrayList<Product> getProdList() {
        return prodList;
    }

    public void setProdList(ArrayList<Product> prodList) {
        this.prodList = prodList;
    }

    public double getElecBill() {
        return elecBill;
    }

    public void setElecBill(double elecBill) {
        this.elecBill = elecBill;
    }

    public double getWaterBill() {
        return waterBill;
    }

    public void setWaterBill(double waterBill) {
        this.waterBill = waterBill;
    }

    public double getWallet() {
        return wallet.getWalletAmount();
    }

    public void setWallet(double wallet) {
        this.wallet = new Wallet(wallet);
    }

    public String getNetwork_name() {
        return Network_name;
    }

    public void setNetwork_name(String Network_name) {
        this.Network_name = Network_name;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public double getWaterUnits() {
        return waterUnits;
    }

    public void setWaterUnits(double waterUnits) {
        this.waterUnits = waterUnits;
    }

    public double getEleUnits() {
        return eleUnits;
    }

    public void setEleUnits(double eleUnits) {
        this.eleUnits = eleUnits;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Electricity getElectricity() {
        return electricity;
    }

    public void setElectricity(Electricity electricity) {
        this.electricity = electricity;
    }

    @Override
    public String toString() {
        return First_name + " " + Last_name;
    }

    public void addMoney(double amt) {
        wallet.addMoney(amt);
    }

    public void debitMoney(WorkRequest wr, Double amt) {
        wallet.debitFromWallet(wr, amt);
    }

    public Wallet getWalletObj() {
        return wallet;

    }

    public ArrayList<Event> getMyEvents() {
        return myEvents;
    }

    public void setMyEvents(ArrayList<Event> myEvents) {
        this.myEvents = myEvents;
    }
    
    public void addEvent(Event event){
        event.setEventAdmin(this);
        myEvents.add(event);
    }
    public void deleteEvent(Event event){
        event.setEventAdmin(null);
    }
    
    public void changeEventDate(Date date,Event event){
        event.changeDate(date);
    }
}
