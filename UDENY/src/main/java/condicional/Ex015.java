package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, oito, dezoito;
		
		salario = sc.nextDouble();
		
		oito = 80.00;
		dezoito = 270.00;
		
		if (salario <= 2000.00) {
			System.out.println("Isento");
		}
		else if (salario <= 3000.00) {
			System.out.printf("R$ %.2f", (salario - 2000.00) / 100 * 8);
		}
		else if (salario <= 4500.00) {
			System.out.printf("R$ %.2f", ((salario - 3000.00) / 100 * 18) + oito);
		}
		else if (salario > 4500.00) {
			System.out.printf("R$ %.2f", ((salario - 4500.00) / 100 * 28) + oito + dezoito);
		}
		sc.close();

	}

}
