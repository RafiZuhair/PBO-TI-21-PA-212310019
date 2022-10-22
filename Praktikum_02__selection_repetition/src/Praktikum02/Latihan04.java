package Praktikum02;
import java.util.Scanner;

public class Latihan04 {

	
	public static void main(String[] args) {
		int angka;
		int i;
		Scanner input = new Scanner(System.in);
		System.out.println("masukkan angka = ");
		angka = input.nextInt();
				
		
				for (i = angka; i>0; i--) {
					if (angka%i == 0) {
						System.out.println("Hasil Faktorisasi dari "+angka+" =");
						String koma = (i>1)?",":".";
						String result = " "+i+koma;
				}
		}
	}
}