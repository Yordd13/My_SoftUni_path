package Multidimensional_Arrays.Exercises;

import java.util.Scanner;

public class P1_Fill_the_Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[n][n];

        int num = 1;
        switch (pattern){
            case "A":
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        matrix[j][i] = num;
                        num++;
                    }
                }
                break;
            case "B":
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if(i % 2 == 0){
                            matrix[j][i] = num;
                        }
                        else {
                            for (int k = n - 1; k >= 0 ; k--) {
                                matrix[k][i] = num;
                                num++;
                            }
                            break;
                        }
                        num++;
                    }
                }
                break;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
