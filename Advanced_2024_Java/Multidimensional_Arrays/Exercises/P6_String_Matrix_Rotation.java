package Multidimensional_Arrays.Exercises;

import java.util.Scanner;

public class P6_String_Matrix_Rotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split("\\(");
        String[] line2 = line[1].split("\\)");

        int num = Integer.parseInt(line2[0]);
        String[] input = new String[1000];
        while (num > 360){
            num-=360;
        }

        int count = 0;
        int max = 0;
        while (true){
            String in = scan.nextLine();
            if(in.equals("END")){
                break;
            }
            if(max < in.length()){
                max = in.length();
            }
            input[count] = in;

            count++;
        }


        if(num % 360 == 0){
            Character[][] matrix = new Character[count][max];
            int counter = 0;
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < input[counter].length(); j++) {
                    matrix[i][j] = input[counter].charAt(j);
                }
                counter++;
            }
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < max; j++) {
                    if(matrix[i][j] != null) {
                        System.out.print(matrix[i][j]);
                    }
                    else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
        else if(num % 270 == 0){
            Character[][] matrix = new Character[max][count];

            int counter = 0;
            for (int i = max - 1; i >= 0; i--) {
                int counter2 = 0;
                for (int j = 0; j < count; j++) {
                    if(input[j].length() > counter){
                        matrix[i][counter2] = input[j].charAt(counter);
                    }
                    else{
                        matrix[i][counter2] = ' ';
                    }
                    counter2++;
                }
                counter++;
            }

            for (int i = 0; i < max; i++) {
                for (int j = 0; j < count ; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }
        else if(num % 180 == 0){
            Character[][] matrix = new Character[count][max];

            int counter1 = count - 1;
            for (int i = 0; i < count; i++) {
                int counter = 0;
                for (int j = max - 1; j >= 0; j--) {
                    if(input[counter1].length()  - 1>= counter){
                        matrix[i][j] = input[counter1].charAt(counter);
                    }
                    else{
                        matrix[i][j] = ' ';
                    }
                    counter++;
                }
                counter1--;
            }

             for (int i = 0; i < count; i++) {
                 for (int j = 0; j < max; j++) {
                     System.out.print(matrix[i][j]);
                 }
                 System.out.println();
             }
        }
        else{
            Character[][] matrix = new Character[max][count];

            int counter = 0;

            for (int i = 0; i < max; i++) {
                for (int j = 0; j < count; j++) {
                    if(input[j].length() > counter){
                        matrix[i][count - 1 - j] = input[j].charAt(counter);
                    }
                    else {
                        matrix[i][count - 1 - j] = ' ';
                    }
                }
                counter++;
            }

            for (int i = 0; i < max; i++) {
                for (int j = 0; j < count; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }



    }
}
