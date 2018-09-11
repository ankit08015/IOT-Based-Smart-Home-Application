/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Organisation.Grocery.GroceryProduct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author ankit
 */
public class Product extends GroceryProduct{
 
    
    String name;
    int productQuant;
    int threshold;
    //double price;
    int quantity_left;
    String order_status;
    Date delivery_date;
    Boolean auto_refill;
    
    public Product()
    {
        Timer tim = new Timer (50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity_left--;
            }

        });
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductQuant() {
        return productQuant;
    }

    public void setProductQuant(int productQuant) {
        this.productQuant = productQuant;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }

    public int getQuantity_left() {
        return quantity_left;
    }

    public void setQuantity_left(int quantity_left) {
        this.quantity_left = quantity_left;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public Date getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(Date delivery) {
        this.delivery_date = delivery_date;
    }

    public Boolean getAuto_refill() {
        return auto_refill;
    }

    public void setAuto_refill(Boolean auto_refill) {
        this.auto_refill = auto_refill;
    }
    
    
        @Override
    public String toString() {
        return name;
    }
    
    
    
    
    
    
}
