package L3.Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P9_Array_Modifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        String input = scan.nextLine();
        while (!input.equals("end")){
            String[] tokens = input.split(" ");
            if(tokens[0].equals("decrease")){
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] -= 1;
                }
            }
            else if(tokens[0].equals("swap")){
                int pos1 = Integer.parseInt(tokens[1]);
                int pos2 = Integer.parseInt(tokens[2]);

                int swap = numbers[pos1];
                numbers[pos1] = numbers[Integer.parseInt(tokens[2])];
                numbers[pos2] = swap;
            }
            else {
                int pos1 = Integer.parseInt(tokens[1]);
                int pos2 = Integer.parseInt(tokens[2]);

                numbers[pos1] *= numbers[pos2];
            }

            input = scan.nextLine();
        }
        System.out.println(String.join(", ", Arrays.stream(numbers).mapToObj(e -> String.valueOf(e)).toArray(String[]::new)));
    }
}
