package repeticao_while;

import java.util.Scanner;

public class Principal {
    static Scanner scanner = new Scanner(System.in);

    public static int[] sort(int[] entrada) {        
        int[] auxiliar = new int[entrada.length];     
        
        for (int i = 0; i < entrada.length; i++) {
            for (int j = 0; j < entrada.length; j++) {
                if (entrada[j] < entrada[i]) {
                    auxiliar[i]++;
                }
            }
        }       
        
        int[] saida = new int[entrada.length];        
        
        for (int i = 0; i < entrada.length; i++) {
            int posicao = auxiliar[i];
            while (saida[posicao] != 0) {
                posicao++;
            }
            saida[posicao] = entrada[i];
        }
        
        return saida;
    }

    public static void main(String[] args) {
        String entrada = scanner.nextLine(); // recebe a string de entrada
        String[] in = entrada.split(",");
        int[] entradaInt = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            entradaInt[i] = Integer.valueOf(in[i].trim());
        }
        int[] out = sort(entradaInt);
        printArray("Saída: ", out);
    }

    public static void printArray(String desc, int[] in) {
        String tmp = "[";
        for (int i : in)
            tmp += i + ", ";
        System.out.println(desc + tmp.substring(0, tmp.length() - 2) + "]");
    }
}
