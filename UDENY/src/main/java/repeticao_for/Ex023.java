package repeticao_for;

import java.util.Scanner;

public class Ex023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fat = 1;
		
		for(int i=1; i<=n; i++) {
			fat *= i;			
		}
		System.out.println(fat);
		
		sc.close();

	}

}
