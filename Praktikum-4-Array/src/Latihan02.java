import java.util.Scanner;


public class Latihan02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] angka = new int[5];
		
		angka[1] = 1;
		angka[2] = 1;
		angka[3] = 1;
		angka[4] = 1;
		angka[5] = 1;
		
		
		for (int i = 0; i <=4; i++) {
			System.out.println("number["+i+"]= " + angka[i]);
		}
	}

}
