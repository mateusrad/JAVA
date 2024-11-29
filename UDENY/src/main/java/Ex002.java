import java.util.Locale;
import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		Locale.setDefault(Locale.US);
		System.out.println("Voce digitou: " + x);
		
		sc.close();

	}

}
