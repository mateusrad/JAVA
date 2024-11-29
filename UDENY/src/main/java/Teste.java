import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		String linha = JOptionPane.showInputDialog("Digite um literal");
		System.out.println("literal: " + linha);
		
		int inteiro = Integer.parseInt(JOptionPane.showInputDialog("digite um numero int"));
		System.out.println(inteiro);

	}

}
