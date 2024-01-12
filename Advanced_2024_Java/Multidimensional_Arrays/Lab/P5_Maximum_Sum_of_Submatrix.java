package Multidimensional_Arrays.Lab;

import java.util.Scanner;

public class P5_Maximum_Sum_of_Submatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] sizes = scan.nextLine().split(", ");
        int rows = Integer.parseInt(sizes[0]);
        int cols = Integer.parseInt(sizes[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] elements = scan.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(elements[j]);
            }
        }

        int[][] res = new int[2][2];
        int max = 0;
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols - 1; j++) {
                if(matrix[i][j] + matrix[i-1][j] + matrix[i - 1][j + 1] + matrix[i][j + 1] > max){
                    res[0][0] = matrix[i-1][j];
                    res[0][1] = matrix[i - 1][j + 1];
                    res[1][0] = matrix[i][j];
                    res[1][1] = matrix[i][j+1];

                    max = matrix[i][j] + matrix[i-1][j] + matrix[i - 1][j + 1] + matrix[i][j + 1];
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(max);
    }
}
