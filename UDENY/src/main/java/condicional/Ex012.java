package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		int cod, qtd;
		double cachorro, salada, bacon, torrada, refri;
		
		cod = sc.nextInt();
		qtd = sc.nextInt();
		cachorro = 4.0;
		salada = 4.5;
		bacon = 5.0;
		torrada = 2.0;
		refri = 1.5;
		
		if (cod == 1) {			
			System.out.printf("Total: R$ %.2f", cachorro * qtd);
		}
		else if (cod == 2) {			
			System.out.printf("Total: R$ %.2f", salada * qtd);
		}
		else if (cod == 3) {			
			System.out.printf("Total: R$ %.2f", bacon * qtd);
		}
		else if (cod == 4) {			
			System.out.printf("Total: R$ %.2f", torrada * qtd);
		}
		else if (cod == 5) {			
			System.out.printf("Total: R$ %.2f", refri * qtd);
		}
			
			
			
		sc.close();

	}

}
