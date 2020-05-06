package by.epam.module02.twodimensional_array;

/*Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,...,n2 так, что
суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.*/

import by.epam.module02.MainModule02;

public class Task16A {

    public static void main(String[] args) {
        MainModule02.outTwoDimensionalArray(createMagicSquare(6));
    }

    public static int[][] createMagicSquare(int n){

        int[][] outMagicSquare;

        if ((n - 1) % 2 == 0) {
            outMagicSquare = createSquareWithOddN(n);
        } else if (n % 4 == 0) {
            outMagicSquare = createSquareWithSingleEvenN(n);
        } else {
            outMagicSquare = createSquareWithDoubleEvenN(n);
        }

        return outMagicSquare;
    }

    private static int[][] createSquareWithDoubleEvenN(int n) {
        int[][] square = new int[n][n];
        int[][] squareT = createSquareWithSingleEvenN(n - 2);
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                square[i][j] = squareT[i - 1][j - 1] + 2 * (n - 1);
            }
        }
        int l = n / 2;
        int d = n * n + 1;

        square[0][0] = 3 * l - 1;
        square[0][n - 1] = 1;
        square[n - 1][0] = d - 1;
        square[n - 1][n - 1] = d - 3 * l + 1;

        int i, j;
        for (i = 1; i <= l - 2; i++) {
            square[0][i] = 2 * i + 1;
        }
        for (j = 1; j <= l; j++) {
            square[0][j + i - 1] = d - 2 * j;
        }
        for (j = 1; j < n - 1; j++) {
            square[n - 1][j] = n * n + 1 - square[0][j];
        }
        square[1][0] = 2 * l - 1;
        for (i = 1; i <= l / 2; i++) {
            square[i + 1][0] = 3 * l - 1 - i;
        }
        i--;
        for (j = 1; j <= l / 2 + 1; j++) {
            square[i + j + 1][0] = d - 4 * l + 1 + j;
        }
        j--;
        for (int q = 1; q <= l / 2 - 1; q++, i++) {
            square[i + j + q + 1][0] = 3 * l - 1 + q;
            square[i + j + q + 2][0] = d - 2 * l - q;
        }

        for (i = 1; i < n - 1; i++) {
            square[i][n - 1] = n * n + 1 - square[i][0];
        }

        return square;
    }

    private static int[][] createSquareWithSingleEvenN(int n) {
        int[][] magicSquare = new int[n][n];
        int element = 1;

        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                magicSquare[i][j] = element;
                element++;
            }
        }

        for (int i = 0; i < n; i += 4) {
            for (int j = 1; j < n; j += 4) {
                magicSquare[i][j] = n * n + 1 - magicSquare[i][j];
                magicSquare[i + 3][j] = n * n + 1 - magicSquare[i + 3][j];
                magicSquare[i][j + 1] = n * n + 1 - magicSquare[i][j + 1];
                magicSquare[i + 3][j + 1] = n * n + 1 - magicSquare[i + 3][j + 1];
            }
        }
        for (int i = 1; i < n; i += 4) {
            for (int j = 0; j < n; j += 4) {
                magicSquare[i][j] = n * n + 1 - magicSquare[i][j];
                magicSquare[i + 1][j] = n * n + 1 - magicSquare[i + 1][j];
                magicSquare[i][j + 3] = n * n + 1 - magicSquare[i][j + 3];
                magicSquare[i + 1][j + 3] = n * n + 1 - magicSquare[i + 1][j + 3];
            }
        }
        return magicSquare;
    }

    private static int[][] createSquareWithOddN(int n) {
        int[][] magicSquare;
        int i;
        int j;

        magicSquare = new int[n][n];
        i = n / 2;
        j = n - 1;

        for (int num = 1; num <= n * n; ) {
            if (i == -1 && j == n) {
                j = n - 2;
                i = 0;
            } else {
                if (j == n) {
                    j = 0;
                }
                if (i < 0) {
                    i = n - 1;
                }
            }
            if (magicSquare[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else {
                magicSquare[i][j] = num++;
            }
            j++;
            i--;
        }
        return magicSquare;
    }

}
