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
public class odev3 {
   
    public static void main(String[] args) {
        
        int deger = 0;
        
        String[] sehirler = new String[34]; //34 ili yazdım, boş ili null pointer döndürmesin diye 81 vermedim , her şehri teker teker yazmak istemedim adımın baş harfi b olduğu için.
        sehirler[0] = "Adana";
        sehirler[1] = "Adıyaman";
        sehirler[2] = "Afyon";
        sehirler[3] = "Ağrı";
        sehirler[4] = "Amasya";
        sehirler[5] = "Ankara";
        sehirler[6] = "Antalya";
        sehirler[7] = "Artvin";
        sehirler[8] = "Aydın";
        sehirler[9] = "Balıkesir";
        sehirler[10] = "Bilecik";
        sehirler[11] = "Bingöl";
        sehirler[12] = "Bitlis";
        sehirler[13] = "Bolu";
        sehirler[14] = "Burdur";
        sehirler[15] = "Bursa";
        sehirler[16] = "Çanakkale";
        sehirler[17] = "Çankırı";
        sehirler[18] = "Çorum";
        sehirler[19] = "Denizli";
        sehirler[20] = "Diyarbakır";
        sehirler[21] = "Edirne";
        sehirler[22] = "Elazığ";
        sehirler[23] = "Erzincan";
        sehirler[24] = "Erzurum";
        sehirler[25] = "Eskişehir";
        sehirler[26] = "Gaziantep";
        sehirler[27] = "Giresun";
        sehirler[28] = "Gümüşhane";
        sehirler[29] = "Hakkari";
        sehirler[30] = "Hatay";
        sehirler[31] = "Isparta";
        sehirler[32] = "İçel";
        sehirler[33] = "Istanbul";
        
        
        
             
        
        
        
        System.out.println("1.Sehir:"+sehirler[0]);
        
        for (int i = 0; i<sehirler.length; i++) {
         
                 
        
            if (sehirler[i].substring(0, 1).equals("B")) {
                System.out.println(sehirler[i]);
            
            }
            
            if (sehirler[i].substring(sehirler[i].length()-1,sehirler[i].length()).equals("n")) {
            
            deger++;
            }
        
        }
        System.out.println("34 sehirden sonu n ile biten sehir : "+deger);
        
        
        
        
            
        
    }
    
    
}
