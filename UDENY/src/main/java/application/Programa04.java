package application;

import java.util.Locale;
import java.util.Scanner;

import antities.CorrencyConverter;



public class Programa04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Qual o valor do dolar hoje? ");
		double dolar = sc.nextDouble();
		System.out.println();
		
		System.out.print("Quantos dolar voce vai comprar? ");
		double qtdDolar = sc.nextDouble();
		System.out.println();
		
		System.out.printf("Valor total a pagar em reais = %.2f", CorrencyConverter.ValorPagar(dolar, qtdDolar));
		
		
		
		
		
		sc.close();

	}

}
