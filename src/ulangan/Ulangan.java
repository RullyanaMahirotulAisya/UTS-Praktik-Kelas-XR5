/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulangan;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Ulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String identitas = "Rullyana Mahirotul Aisya ";
         System.out.println("Identitas : "+ identitas);
         
           Scanner scanner = new Scanner (System.in);
          
           System.out.println("Nama Barang ");
            System.out.println("1. buku");
             System.out.println("2. sepatu");
         
        Scanner masukan = new Scanner (System.in);
        int harga, diskon;
        System.out.print("Masukkan harga: ");
        harga = masukan.nextInt();
        System.out.print("Masukkan diskon: ");
        diskon = masukan.nextInt();
                
        

        int hasil = harga-(harga*diskon/100);
        System.out.println("hasil : " + hasil );
        
        
        // TODO code application logic here
    }
    
}
