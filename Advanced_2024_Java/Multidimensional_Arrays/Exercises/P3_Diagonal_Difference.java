package Multidimensional_Arrays.Exercises;

import java.util.Scanner;

public class P3_Diagonal_Difference {
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

        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += matrix[i][i];
        }

        int sum2 = 0;
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = count; j < count + 1; j++) {
                sum2 += matrix[i][j];
            }
            count++;
        }

        System.out.println(Math.abs(sum2 - sum1));
    }
}
