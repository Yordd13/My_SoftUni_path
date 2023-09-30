package L3.Arrays.More_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P6_LadyBugs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sizeField = Integer.parseInt(scan.nextLine());

        int[] bug = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] field = new int[sizeField];

        for(int value : bug){
            if(value <= field.length -1 && value >=0){
                field[value] = 1;
            }
        }

        String input = scan.nextLine();

        while(!input.equals("end")){
            String[] tokens = input.split(" ");

            int indexBug = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int flyLengthBug = Integer.parseInt(tokens[2]);


            if(indexBug >= 0 && indexBug <= field.length - 1 && field[indexBug] == 1){
                field[indexBug] = 0;
                if(direction.equals("right")){
                    indexBug += flyLengthBug;
                    while (indexBug <= field.length - 1 && field[indexBug]==1){
                        indexBug += flyLengthBug;
                    }
                    if(indexBug <= field.length - 1){
                        field[indexBug] = 1;
                    }
                }

            if(direction.equals("left")){
                indexBug -= flyLengthBug;

                while(indexBug >= 0 && field[indexBug]==1){
                    indexBug -= flyLengthBug;
                }
                if(indexBug >= 0){
                    field[indexBug] = 1;
                }
            }}


            input = scan.nextLine();
        }

        System.out.println(String.join(" ",Arrays.stream(field).mapToObj(e -> String.valueOf(e)).toArray(String[]::new)));
    }
}
