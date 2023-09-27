package L3.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P7_Condense_Array_to_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();


        while(input.length > 1){

            int[] condensed = new int[input.length - 1];

            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = input[i] + input[i + 1];
            }
            input = condensed;

        }
        System.out.println(input[0]);
    }
}
