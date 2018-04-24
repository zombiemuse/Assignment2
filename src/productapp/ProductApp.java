/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productapp;

import java.util.Scanner;

/**
 *
 * @author xxzom
 */
public class ProductApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Type 'code' to search by product code, or type 'list' to list inventory (Type 'quit' to end): ");
        Scanner sc = new Scanner(System.in);
        
        outer:
        while (true){
            System.out.print("> ");
            String command = sc.nextLine();
            command = command.toLowerCase();
            
            switch(command){
                case "code":
                    ReadProduct codeList = new ReadProduct();
                    codeList.getMapCodeProduct();
                    System.out.print("Product code: ");
                    Scanner code = new Scanner(System.in);
                    
                   
                    break;
                
                case "list":
                    ReadProduct list = new ReadProduct();
                    list.readProductFile();
                    
                    
                    break;
                   
                case "quit":
                    break outer;
                    
                default:
                    System.out.println(command + " is not a valid option!\nTry again!");
                    break;
            }
        }
        
        
//        ReadProduct list = new ReadProduct();
//        list.readProductFile();
        
        
        
    }
    
}
