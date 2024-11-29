package sequencial;
import java.util.Locale;
import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int numFunc;
		double horasTrab, valorHora, salario;
		
		numFunc = sc.nextInt();
		horasTrab = sc.nextDouble();
		valorHora =	sc.nextDouble();
		salario = valorHora * horasTrab;
		System.out.printf("NUMBER = %d %n", numFunc);
		System.out.printf("LALARY = U$ %.2f", salario);
		
		
		
		sc.close();
		

	}

}
