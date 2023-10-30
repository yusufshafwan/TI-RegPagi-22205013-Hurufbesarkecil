/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanner;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class latihan27 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat:");
        String kalimat = scanner.nextLine();

        // Menampilkan hasil formatting
        System.out.println("\n======Hasil Formatting======");
        System.out.println("Huruf Besar: " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil: " + kalimat.toLowerCase());

        // Menutup scanner
        scanner.close();
    }
    
}  

