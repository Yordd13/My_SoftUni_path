package L2.Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class P7_Reversed_Chars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] characters = new char[3];
        for (int i = 0; i < characters.length; i++) {
            characters[i] = scan.nextLine().charAt(0);
        }

        for (int i = characters.length -1 ; i >= 0; i--) {
            System.out.print(characters[i] + " ");
        }
    }
}
