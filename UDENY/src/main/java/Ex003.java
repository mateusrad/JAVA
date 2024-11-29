import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		soma = x + y;
		System.out.print("A soma de x + y é: ");
		System.out.println(soma);
		
		sc.close();		

	}

}
