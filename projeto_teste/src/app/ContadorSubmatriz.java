package app;

/* implemente uma função que, dado uma matriz A e uma submatriz B
(dimensões menores que A), esta função retorne quantas vezes esta submatriz B
pode ser encontrada na matriz A.*/

public class ContadorSubmatriz {
    public static int countSubmatriz(int[][] A, int[][] B) {
        int count = 0;
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        for (int i = 0; i <= rowsA - rowsB; i++) {
            for (int j = 0; j <= colsA - colsB; j++) {
                if (isSubmatriz(A, B, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean isSubmatriz(int[][] A, int[][] B, int startRow, int startCol) {
        int rowsB = B.length;
        int colsB = B[0].length;

        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                if (A[startRow + i][startCol + j] != B[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3, 4},
            {2, 3, 4, 5},
            {3, 4, 5, 6},
            {4, 2, 6, 7}
        };

        int[][] B = {
            {3, 4},
            {4, 5}
        };

        int cont = countSubmatriz(A, B);
        System.out.println("Qtd em que a Submatriz B foi encontrada na Matriz A: " + cont);
    }
}


