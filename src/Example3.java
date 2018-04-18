/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author R
 */
public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [ ][ ] inventory = new double [3][2];
        inventory [0][0] = 10; 
        inventory[0][1] = 1.99;
        inventory [1][0] = 13;
       inventory[1][1] = 7.99;
       inventory [2][0] = 23;
       inventory[2][1] = 3.87;
       
        double total=0;
     for (int row = 0; row <= 2; row++) {
          total = total + (inventory[row][0] * inventory[row][1]);
     }    
     System.out.println("Total Value of Inventory: $"+ total);
    }
        
   }
    

