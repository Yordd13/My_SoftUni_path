package Multidimensional_Arrays.Lab;

import java.util.Scanner;

public class P1_Compare_Matrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] indexes1 = scan.nextLine().split("\\s+");
        int rows1 = Integer.parseInt(indexes1[0]);
        int cols1 = Integer.parseInt(indexes1[1]);

        int[][] matrix1 = new int[rows1][cols1];

        for (int row = 0; row < rows1; row++) {
            String[] elements = scan.nextLine().split("\\s+");
            for (int col = 0; col < cols1; col++) {
                matrix1[row][col] = Integer.parseInt(elements[col]);
            }
        }

        String[] indexes2 = scan.nextLine().split("\\s+");
        int rows2 = Integer.parseInt(indexes2[0]);
        int cols2 = Integer.parseInt(indexes2[1]);
        int[][] matrix2 = new int[rows2][cols2];

        for (int row = 0; row < rows2; row++) {
            String[] elements = scan.nextLine().split("\\s+");
            for (int col = 0; col < cols2; col++) {
                matrix2[row][col] = Integer.parseInt(elements[col]);
            }
        }


        if(rows1 != rows2 || cols1 != cols2){
            System.out.println("not equal");
        }
        else {
            boolean condition = true;
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    if(matrix1[i][j] != matrix2[i][j]){
                        condition = false;
                        break;
                    }
                }
            }
            if(condition){
                System.out.println("equal");
            }
            else System.out.println("not equal");
        }

    }
}
