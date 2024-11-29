package sequencial;
import java.util.Locale;
import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		int codP1, codP2, qtdP1, qtdP2;
		double valP1, valP2, valTotal;
		
		codP1 = sc.nextInt();
		qtdP1 = sc.nextInt();
		valP1 = sc.nextDouble();
		codP2 = sc.nextInt();
		qtdP2 = sc.nextInt();
		valP2 = sc.nextDouble();
		valTotal = (qtdP1 * valP1) + (qtdP2 * valP2);
		System.out.printf("VALOR A PAGAR: %.2f", valTotal);
		
		
		
		
	sc.close();

	}

}
