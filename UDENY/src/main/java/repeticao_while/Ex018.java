package repeticao_while;

import java.util.Scanner;

public class Ex018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Inválida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		
		sc.close();

	}

}
