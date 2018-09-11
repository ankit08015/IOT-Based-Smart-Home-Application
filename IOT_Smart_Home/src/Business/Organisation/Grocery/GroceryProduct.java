/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation.Grocery;

/**
 *
 * @author ajaygoel
 */
public abstract class GroceryProduct {
    
       
    private static int count = 0;
    private String prodName;
    private int price;
    private int modelNumber;
    private int avail;  
    private String imgLoc;
    private String Categories;
    
    public GroceryProduct() 
    {
        count++;
        modelNumber = count;
    }
    

    public String getCategories() {
        return Categories;
    }

    public void setCategories(String Categories) {
        this.Categories = Categories;
    }

    public String getImgLoc() {
        return imgLoc;
    }

    public void setImgLoc(String imgLoc) {
        this.imgLoc = imgLoc;
    }
    
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }
    
    
    
    @Override
    public String toString() {
        return prodName;
    }
    
    
}
