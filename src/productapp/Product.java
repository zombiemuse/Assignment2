/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productapp;

import java.text.NumberFormat;

/**
 *
 * @author xxzom
 */
public class Product {
    private String code;
    private String name;
    private float price;
    
    public Product(){
        code = "";
        name = "";
        price = 0;
    }
    
    public void setCode(String code){
      this.code = code;  
    }
    
    public String getCode(){
        return code;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setPrice(float price){
        this.price = price;
    }
    
    public float getPrice(){
        return price;
    }
//    public String getFormattedPrice(){
//        NumberFormat nf = NumberFormat.getCurrencyInstance();
//        return nf.format(price);
//    }
    
    @Override
    public String toString(){
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        String s = code + " " + name + " " + nf.format(price);
        return s;
    }
}
