package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.Exercise;

import java.util.Scanner;

public class P5_Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();

        String password = "";
        for (int i = username.length() - 1; i >= 0 ; i--){
            password += username.charAt(i);
        }

        int guesses = 0;
        String passwordTyped = scan.nextLine();
        while(!passwordTyped.equals(password)){
            guesses++;
            if(guesses > 3){
                System.out.printf("User %s blocked!", username);
                return;
            }

            System.out.println("Incorrect password. Try again.");

            passwordTyped = scan.nextLine();
        }

        System.out.printf("User %s logged in.", username);
    }
}
