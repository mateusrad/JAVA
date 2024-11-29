package repeticao_for;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String linha = JOptionPane.showInputDialog("digite");
		System.out.println("teste" + linha);
		
		for(int i=1; i<=n; i++) {
			System.out.printf("%d ", i);
			System.out.printf("%d ",i*i);
			System.out.printf("%d%n", i*i*i);
			
			
		}
		sc.close();

	}

}
