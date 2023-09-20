package L2.Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class P6_Chars_to_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String output = "";
        for (int i = 0; i < 3; i++) {
            String input = scan.nextLine();
            output += input;
        }
        System.out.println(output);
    }
}
