import java.util.Locale;

public class Ex001 {

	public static void main(String[] args) {
		String product1, product2;		
		int age, code;
		char gender;		
		double price1, price2, measure;
		
		product1 = "Computer";
		product2 = "Office desk";
		age = 30;
		code = 5290;
		gender = 'F';
		price1 = 2100.0;
		price2 = 650.50;
		measure = 53.234567;
			
				
		
		System.out.println("Produsts:");
		System.out.printf("%s, which price is $ %.2f%n" , product1, price1);
		System.out.printf("Office desck, which orice is $ %.2f%n", price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eigth decimal places: %.6f%n", measure);		
		System.out.printf("Rouded (three decimal place): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);		
		

	}

}
