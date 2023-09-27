package L3.Arrays.Lab;

import java.util.Scanner;

public class P4_Reverse_Array_of_Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        String[] reverse = new String[input.length];

        int reverseCounter = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            reverse[reverseCounter] = input[i];
            reverseCounter++;
        }

        System.out.println(String.join(" ", reverse));
    }
}
