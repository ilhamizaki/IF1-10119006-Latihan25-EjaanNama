/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119006.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : Menampilkan Ejaan Nama
 */
public class IF110119006Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        String nama, ejaan;
        
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = userInput.nextLine();
        
        //jumlah huruf
        int panjang = nama.length();
        
        //indeks substring
        int a = -1;
        int b = 0;
        
        //proses ejaan
        for (int i=1; i<=panjang; i++) {
            ejaan = nama.substring(a+i, b+i);
            System.out.println("Huruf ke-" + i +  " : " + ejaan);
        }
    }
    
}
