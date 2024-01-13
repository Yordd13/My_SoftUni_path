package Multidimensional_Arrays.Exercises;

import java.util.Scanner;

public class P5_Matrix_shuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];


        for (int i = 0; i < rows; i++) {
            String[] el = scan.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = el[j];
            }
        }

        while (true){
            String[] line = scan.nextLine().split("\\s+");
            if(line[0].equals("END")){
                break;
            }
            String comm = line[0];
            if(line.length != 5){
                System.out.println("Invalid input!");
                continue;
            }

            int row1 = Integer.parseInt(line[1]);
            int col1 = Integer.parseInt(line[2]);
            int row2 = Integer.parseInt(line[3]);
            int col2 = Integer.parseInt(line[4]);



            if(comm.equals("swap") && (row1 >= 0 && row1 < rows) && (col1 >= 0 && col1 < cols) && (row2 >= 0 && row2 < rows) && (col2 >= 0 && col2 < cols)){
                String num1 = matrix[row1][col1];
                String num2 = matrix[row2][col2];

                matrix[row1][col1] = num2;
                matrix[row2][col2] = num1;

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            else System.out.println("Invalid input!");
        }

    }
}
