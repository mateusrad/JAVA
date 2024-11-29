package application;

import java.util.Locale;
import java.util.Scanner;

import antities.Estudante;

public class Programa03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Estudante estudante = new Estudante();
		
		System.out.println("Digite o nome e as suas 3 respectivas notas");
		estudante.Aluno = sc.nextLine();
		estudante.Nota1 = sc.nextDouble();
		estudante.Nota2 = sc.nextDouble();
		estudante.Nota3 = sc.nextDouble();
		System.out.println();
		
		if (estudante.NotaFinal() > 60) {
			System.out.printf("Nota Final = %.2f%n", estudante.NotaFinal());
			System.out.println("PASS");
		}
		else {
			System.out.printf("Nota Final = %.2f%n", estudante.NotaFinal());
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60 - estudante.NotaFinal());
			
		}
		
		
		
		
		
		
		sc.close();
	}

}
