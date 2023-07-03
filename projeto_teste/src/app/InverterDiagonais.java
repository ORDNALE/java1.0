package app;

/*implemente uma função que inverta as diagonais de uma matriz
  quadrada.*/

public class InverterDiagonais {
    public static void inverterDiagonais(int[][] matriz) {
        int tamanho = matriz.length;

        // Invertendo a diagonal principal
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[tamanho - i - 1][tamanho - i - 1];
            matriz[tamanho - i - 1][tamanho - i - 1] = temp;
        }

        // Invertendo a diagonal secundária
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = matriz[i][tamanho - i - 1];
            matriz[i][tamanho - i - 1] = matriz[tamanho - i - 1][i];
            matriz[tamanho - i - 1][i] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriz original:");
        exibirMatriz(matriz);

        inverterDiagonais(matriz);

        System.out.println("\nMatriz com diagonais invertidas:");
        exibirMatriz(matriz);
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}


 