package Multidimensional_Arrays.Lab;

import java.util.Scanner;

public class P6_Print_Diagonals_of_Square_Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] elements = scan.nextLine().split("\\s+");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(elements[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < i + 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();

        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
                System.out.print(matrix[i][j] + " ");
                j++;
        }
    }
}
