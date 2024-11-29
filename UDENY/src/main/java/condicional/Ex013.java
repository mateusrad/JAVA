package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double val;
		val = sc.nextDouble();
		
		if (val < 0 || val > 100) {
			System.out.println("Fora de intervalo");
		}
		else if (val >= 0 && val <= 25.00) {
			System.out.println("Intervalo [0,25]");			
		}
		else if (val <= 50.00 ) {
			System.out.println("Intervalo [25,50]");
		}
		else if (val <= 75.00 ) {
			System.out.println("Intervalo [50,75]");
		}
		else if (val <= 100.00 ) {
			System.out.println("Intervalo [75,100]");
		}
		
		sc.close();

	}

}
