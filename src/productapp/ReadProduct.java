/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productapp;

import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author xxzom
 */
public class ReadProduct {
    private ArrayList<Product> listProduct = new ArrayList();
    private HashMap<String, Product> mapCodeProduct = new HashMap();
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    
public void readProductFile(){    
    
    
    try{
    File productFile = new File("Products.txt");
            FileReader reader = new FileReader(productFile);
            BufferedReader bReader = new BufferedReader(reader);
            String line = bReader.readLine();
            
            while (line != null) {
                String[] col = line.split(",");
                Product prod = new Product();
                prod.setCode(col[0]);
                prod.setName(col[1]);
                prod.setPrice(Float.parseFloat(col[2]));
                listProduct.add(prod);
                line = bReader.readLine();
                
                mapCodeProduct.put(col[0], prod);
                
            }
}
    catch(Exception e) {
            System.out.println(e);
        }
    System.out.println(listProduct);
     
}

public ArrayList<Product> getListProduct(){
    System.out.println(listProduct);
    return listProduct; 
}

public HashMap<String, Product> getMapCodeProduct() {
    return mapCodeProduct;
}
}
