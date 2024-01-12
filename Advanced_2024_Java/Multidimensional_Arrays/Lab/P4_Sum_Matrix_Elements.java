package Multidimensional_Arrays.Lab;

import java.util.Scanner;

public class P4_Sum_Matrix_Elements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] sizes = scan.nextLine().split(", ");
        int rows = Integer.parseInt(sizes[0]);
        int cols = Integer.parseInt(sizes[1]);

        int[][] matrix = new int[rows][cols];

        System.out.println(rows);
        System.out.println(cols);

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            String[] elements = scan.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(elements[j]);
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
