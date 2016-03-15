/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berat.homeworks.homework05;

/**
 *
 * @author 'Berat
 */
public class Odev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int temp =0;
        int [] sayi={1,2,3,4,5,6,7,8,9,10}; 
      
  
       
        
        for(int i:sayi) {
          System.out.println(i);
      }
        
      
   
  
      
      
      temp = sayi[7];
      sayi[7] = sayi[5];
      sayi[5] = temp;
      
        // System.out.println("elaman7:"+sayi[7]);
        //System.out.println("elemant5:"+sayi[5]);
      
          for (int i = 0; i < sayi.length; i++) {
         System.out.println(sayi[i] + " ");
        
        
    }
      
 
    }


}
