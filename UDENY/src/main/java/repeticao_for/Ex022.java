package repeticao_for;

import java.util.Locale;
import java.util.Scanner;

public class Ex022 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num1 = 0;
		int num2 = 0;
		double resul = 0;
		
		for( int i=0; i<n; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if( num2==0) {
				System.out.println("divisão impossível");
			}
			else {
				System.out.printf("%.1f%n", (double)num1/num2);
			}
			
		}
		
		
		sc.close();

	}

}
