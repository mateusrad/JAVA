package antities;

public class CorrencyConverter {
	
	public static double imposto = 0.06;
	
	
	
	public static double ValorPagar(double dolar, double qtdDolar) {
		return qtdDolar * dolar + ((qtdDolar * dolar) * imposto);
		
	}


}
