package condicional;

import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num;
		
		num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("POSITIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		
		
		
		
		sc.close();


	}

}
