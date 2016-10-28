package edu.technopolis.homework;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Matrix multiplication home task.
 * <br/>
 * Matrix dimension and elements are passed as CLI arguments.
 */
public class MatrixMultiplication {
    public static void main(String... args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        if (n <= 0 | m <= 0 | x <= 0 | y <= 0) {
            System.out.println("Некорректные аргументы!");
            System.exit(0);
        }
        if (m != x) {
            System.out.println("Матрицы невозможно перемножить!");
            System.exit(0);
        }
        int lengthMatrixNM = n * m;
        int lengthMatrixXY = x * y;
        int[][] matrixNM = new int[n][m];
        int[][] matrixXY = new int[x][y];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                matrixNM[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                matrixXY[i][j] = in.nextInt();
            }
        }

        int [][] matrixResult = new int [n][y];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < y; k++) {

                    matrixResult[i][j] = matrixResult[i][j] + matrixNM[i][k] * matrixXY[k][j];
                }
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < y; j++){
                System.out.print(matrixResult[i][j] + " ");
            }
            System.out.println();
        }
    }
}

