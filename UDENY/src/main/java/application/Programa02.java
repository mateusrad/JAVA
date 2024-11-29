package application;

import java.util.Locale;
import java.util.Scanner;

import antities.Employee;

public class Programa02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		Employee funcionario = new Employee();
		
		System.out.print("Nome: ");
		funcionario.Nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		funcionario.SalarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.Imposto = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Funcionario: " + funcionario.Nome + ", $ %.2f%n", funcionario.SalarioLiquido());
		
		
		
		
		sc.close();	
		

	}

}
