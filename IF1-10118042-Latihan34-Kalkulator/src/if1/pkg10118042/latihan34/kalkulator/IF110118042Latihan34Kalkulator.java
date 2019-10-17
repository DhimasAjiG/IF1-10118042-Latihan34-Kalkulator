
package if1.pkg10118042.latihan34.kalkulator;

import java.util.Scanner;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi sebagai kalkulator
 * 
 */
public class IF110118042Latihan34Kalkulator {
     
	public static double value1;
	public static double value2;

	public static double tambahBilangan() {

	   return value1 + value2;
	}

	public static double kurangBilangan() {
                        return value1 - value2;
	}

	public static double kaliBilangan() {
	  return value1 * value2;
	}

	public static double bagiBilangan() {
                        return value1 / value2 ;
	}

	public static double sisaBilangan() {
                        return value1 % value2;
	}

                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    
                    //input
                    System.out.println("=====Aplikasi Kalkulator=====");
                    System.out.print("Masukkan nilai ke-1 : ");
                    value1 = scanner.nextDouble();
                    System.out.print("Masukkan nilai ke-2 : ");
                    value2 = scanner.nextDouble();
                    
                    //output
                    
                    System.out.println("\nHasil Pertambahan : " + tambahBilangan());
                    System.out.println("Hasil Pengurangan : " + kurangBilangan());
                    System.out.println("Hasil Perkalian : " + kaliBilangan());
                    System.out.println("Hasil Pembagian : " + bagiBilangan());
                    System.out.println("Hasil Sisa : " + sisaBilangan());
                    
                    
                    
                    
                        
    }
}