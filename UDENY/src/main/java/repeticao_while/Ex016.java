package repeticao_while;

import java.util.Locale;
import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class Ex016 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double X = 1;
		double Y = 1;
		
		while ( X != 0 && Y != 0) {			
			X = sc.nextDouble();
			Y = sc.nextDouble();
			if (X > 0 && Y > 0) {
				System.out.println("Primeiro");
			}
			else if (X < 0 && Y > 0) {
				System.out.println("Segundo");
			}
			else if (X < 0 && Y < 0) {
				System.out.println("Terceiro");
			}
			else if (X > 0 && Y < 0) {
				System.out.println("Quarto");
			}
			System.out.println();
		}
		sc.close();
		

	}

}
