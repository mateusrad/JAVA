package application;

import java.util.Locale;
import java.util.Scanner;

import antities.Rectangle;

public class Programa01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle retangulo = new Rectangle();
		System.out.println("Entre com a largura e altura: ");
		retangulo.Width = sc.nextDouble();
		retangulo.Height = sc.nextDouble();
				
		System.out.printf("Area = %.2f%n", retangulo.Area());
		System.out.printf("Perimetro = %.2f%n", retangulo.Perimeter());
		System.out.printf("Diagonal = %.2f%n", retangulo.Diagonal());
		
		
		
		
		
		sc.close();

	}

}
