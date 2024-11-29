package repeticao_while;

import java.util.Locale;
import java.util.Scanner;

public class Ex017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int alccol, gasolina, diesel, cod;
		
		alccol = 0;
		gasolina = 0;
		diesel = 0;
		
		cod = sc.nextInt();
		while (cod != 4) {
			if (cod == 1) {
				alccol += 1;
			}
			else if (cod == 2) {
				gasolina += 1;
			}
			else if (cod == 3) {
				diesel += 1;
			}
			cod = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", alccol);
		System.out.printf("Alcool: %d%n", gasolina);
		System.out.printf("Alcool: %d%n", diesel);
			
		
		
		sc.close();

	}

}
