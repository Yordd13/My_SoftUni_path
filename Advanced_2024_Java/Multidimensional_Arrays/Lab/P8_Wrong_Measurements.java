package Multidimensional_Arrays.Lab;

import java.util.Scanner;

public class P8_Wrong_Measurements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[rows][1000];

        for (int i = 0; i < rows; i++) {
            String[] elements = scan.nextLine().split("\\s+");
            matrix[i] = new int[elements.length];
            for (int j = 0; j < elements.length; j++) {
                matrix[i][j] = Integer.parseInt(elements[j]);
            }
        }

        String[] value = scan.nextLine().split("\\s+");
        int row = Integer.parseInt(value[0]);
        int column = Integer.parseInt(value[1]);

        int num = matrix[row][column];

        int[][] res = new int[rows][];

        for (int i = 0; i < rows; i++) {
            res[i] = new  int[matrix[i].length];
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == num){
                    if(i + 1 < rows){
                        if(matrix[i + 1][j] != num){
                            sum+= matrix[i + 1][j];
                        }
                    }


                    if(i - 1 >= 0){
                        if(matrix[i - 1][j] != num){
                            sum+= matrix[i - 1][j];
                        }
                    }

                    if(j + 1 < matrix[i].length){
                        if(matrix[i][j + 1] != num){
                            sum += matrix[i][j + 1];
                        }
                    }

                    if(j - 1 >= 0){
                        if(matrix[i][j - 1] != num){
                            sum += matrix[i][j - 1];
                        }
                    }

                    res[i][j] = sum;
                }
                else res[i][j] = matrix[i][j];
                sum = 0;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
