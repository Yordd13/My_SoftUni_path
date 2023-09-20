package L2.Data_Types_and_Variables.More_exercise;

import java.util.Scanner;

public class P5_Decrypting_Message {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int key = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        String output = "";
        for (int i = 0; i < n; i++) {
            char letter = scan.nextLine().charAt(0);
            letter += key;
            output += Character.toString(letter);
        }
        System.out.println(output);
    }
}
