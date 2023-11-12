package Text_Processing.Exercises;

import java.util.Scanner;

public class P4_Caesar_Cipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char letter = (char) (input.charAt(i) + 3);
            output += Character.toString(letter);
        }
        System.out.println(output);
    }
}
