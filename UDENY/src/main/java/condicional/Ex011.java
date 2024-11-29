package condicional;

import java.util.Scanner;

public class Ex011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaIni, horaFin;
		
		horaIni = sc.nextInt();
		horaFin = sc.nextInt();
		
		if ( horaFin < horaIni) {
			System.out.printf("O JOGO DUROU %d HORA (S)", (24 - horaIni) + horaFin);
		}
		else if (horaIni == horaFin) {
			System.out.println("O JOGO DUROU 24 HORA (S)");
		}
		else {
			System.out.printf("O JOGO DUROU %d HORA (S)", horaFin - horaIni);			
		}
		
		sc.close();

	}

}
