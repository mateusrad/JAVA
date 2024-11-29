import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG ";
		
		//CONVERTE ORIGINAL PARA MINUSCULA
		String s01 = original.toLowerCase(); //-abcde fghij abc abc defg -		
		
		//CONVERTE ORIGINAL PARA MAIUSCULA
		String s02 = original.toUpperCase(); //-ABCDE FGHIJ ABC ABC DEFG -
		
		//ELIMINA OS ESPACOS NAS EXTREMDADES DA STRING
		String s03 = original.trim(); //-abcde FGHIJ ABC abc DEFG-
		
		// CRIA UMA NOVA STRING INICIANDO A PARTIR DO CARACTER "2"
		String s04 = original.substring(2); //-cde FGHIJ ABC abc DEFG -
		
		// CRIA UMA NOVA STRING INICIANDO A PARTIR DO CARACTER "2" ATE ANTES DO "9"
		String s05 = original.substring(2, 9); //-cde FGH-
		
		// SUBSTITUI UM CARACTER POR OUTRO "a" POR "x"
		String s06 = original.replace('a', 'x'); //-xbcde FGHIJ ABC xbc DEFG -
		
		// SUBSTITUI A SUBSTRING POR OUTRA 
		String s07 = original.replace("abc", "xy"); //-xyde FGHIJ ABC xy DEFG -
		
		// FAZ COM QUE "i" RECEBA O VALOR DA PRIMEIRA OCORRENCIA DA SUBSTRING "bc" NO CASO 1
		int i = original.indexOf("bc"); //1
		

		// FAZ COM QUE "j" RECEBA A ULTIMA OCORRENCIA DA SUBSTRING "bc" NO CASO 17
		int j = original.lastIndexOf("bc"); //17
		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
	}
}
