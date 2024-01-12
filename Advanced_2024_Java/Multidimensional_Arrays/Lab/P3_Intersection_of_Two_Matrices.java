package Multidimensional_Arrays.Lab;

import java.util.Scanner;

public class P3_Intersection_of_Two_Matrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());

        char[][] A = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] elements = scan.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                A[row][col] = elements[col].charAt(0);
            }
        }

        char[][] B = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] elements = scan.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                B[row][col] = elements[col].charAt(0);
            }
        }

        char[][] C = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(A[i][j] != B[i][j]){
                    C[i][j] = '*';
                }
                else C[i][j] = A[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
