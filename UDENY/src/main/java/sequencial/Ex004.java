package sequencial;
import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, resul;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		resul = (A * B) - (C * D);
		System.out.print("DIFERENCA = ");
		System.out.println(resul);
		sc.close();

	}

}
