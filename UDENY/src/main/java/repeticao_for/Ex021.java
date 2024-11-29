package repeticao_for;

import java.util.Locale;
import java.util.Scanner;

public class Ex021 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double valor = 0;
		double media = 0;
		
		for (int i=0; i<n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			media = (a*0.2)+(b*0.3)+(c*0.5);
			System.out.printf("%.1f%n", media);
						
		}
				
		
		sc.close();

	}

}
