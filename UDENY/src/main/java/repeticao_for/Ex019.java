package repeticao_for;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("digite um int"));
		double y = Double.parseDouble(JOptionPane.showInputDialog("digite um numero"));
		System.out.println(y);
		
		for (int i=1; i<=x; i++ ) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}
