package Praktikum02;
import java.util.Scanner;
public class Latihan02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bil, cek = 0;
		System.out.print("masukkan nilai = ");
		bil = input.nextInt();
		
		for(int i = 2; i <= bil; i++) {
			if(bil % i == 0) {
				cek++;	
			}
		}
		if(cek == 1) {
			System.out.println("Termasuk bilangan prima");
		} else {
			System.out.println("Bukan termasuk bilangan prima karena dapat dibagi");
		}
	}
}
