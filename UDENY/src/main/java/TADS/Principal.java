package TADS;

import java.util.Scanner;


public class Principal {
    public static boolean verifica(List<String> fechadura, List<String> chave) {
    	int acertos = 0;
    	
    	for (int i = 0; i < fechadura.size(); i++) {
    		
    		char fec = fechadura.get(i).charAt(0);
    		char cha = chave.get(i).charAt(0);
    		
    		
    		boolean chaIsNumero = Character.isDigit(cha);
    		boolean chaIsLetra = Character.isLetter(cha);
    		
    		
    		switch (fec) {
    			
    			case '!':
    				
    				if (chaIsLetra == true) {
    					acertos++;
    				}
    				break;
    		
    			case '%':
    				
    				if (chaIsNumero == true) {
    					
    					acertos++;
    				}
    				break;
    			
    			default:
    				
    				if (fec == cha) {
    					
    					acertos++;
    				}
    				break;		
    		}    		
    	}
    	
    	if (acertos == fechadura.size()) {
    		
    		return true;
    	} else {
    		
    		return false;
    	}
    	
    }

    public static List<String> montaLista(String entrada) {
        List<String> ret = new ArrayList<String>();        
        for (char i : entrada.toCharArray()) {            
            ret.add(String.valueOf(i));
        }
        return ret;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> fechadura = montaLista(scanner.nextLine());        
        List<String> chave =  montaLista(scanner.nextLine());
        System.out.println(verifica(fechadura, chave));

    }
}