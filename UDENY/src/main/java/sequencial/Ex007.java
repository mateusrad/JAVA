package sequencial;
import java.util.Locale;
import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A, B, C, tri, cir, tra, qua, ret;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		tri = (A * C) / 2;
		
		tra = ((A + B) * C) / 2;
		qua = Math.pow(B,2);
		ret = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", tri);
		System.out.printf("TRAPEZIO: %.3f%n", tra);
		System.out.printf("QUADRADO: %.3f%n", qua);
		System.out.printf("RETANGULO: %.3f%n", ret);
		
		
		sc.close();

	}

}
