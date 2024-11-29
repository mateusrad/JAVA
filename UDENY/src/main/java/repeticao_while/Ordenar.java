package repeticao_while;

public class Ordenar {

	public static int[] bubbleSort(int[] arr) {
        int n = arr.length; //recupera o tamanho do vetor
        for (int i = 0; i < n; i++) { // percorre o vetor da posição 0 até a posição n-1
            for (int j = i; j < n; j++) { // percorre o vetor da posição i até a posição n-1
                if (arr[i] > arr[j]) { // Caso o valor observado na posição j seja menor que o da posição i 
                    int temp = arr[j]; //
                    arr[j] = arr[i];   // é executada a troca de posição dos elementos
                    arr[i] = temp;     //               
                }
            }        
        }
        return arr; // ao final dos laços é retornado o vetor ordenado
    }
    public static void main(String[] args) {
        int [] in = {6, 7, 8, 9, 5}; // vetor de entrada

        int [] out = bubbleSort(in); // invocação do método bubblesort<br>
        for (int i:out) {// impressão do vetor ordenado na tela
            System.out.println(i);
        }
        
    }

}


