package antities;

public class Employee {
	
	public String Nome;
	public double SalarioBruto;
	public double Imposto;
	
	public double SalarioLiquido() {
		return SalarioBruto - Imposto;
	}
	

}
