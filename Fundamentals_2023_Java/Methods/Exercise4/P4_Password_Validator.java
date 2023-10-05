package L4.Methods.Exercise;

import java.util.Scanner;

public class P4_Password_Validator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        validPass(password);
    }

    public static void validPass(String password){
        boolean condition1 = false;
        boolean condition2 = false;
        boolean condition3 = false;

        if(password.length() < 6 || password.length() > 10){
            condition1 = true;
        }

        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char curr = password.charAt(i);
            if(curr >= 48 && curr <=57 || curr >= 65 && curr <= 90 || curr >= 97 && curr <= 122){
            }
            else {
                condition2 = true;
                break;
            }

            if(curr <= 57){
                count++;
            }
        }

        if(count < 2){
            condition3 = true;
        }

        if(condition1) System.out.println("Password must be between 6 and 10 characters");
        if(condition2) System.out.println("Password must consist only of letters and digits");
        if(condition3) System.out.println("Password must have at least 2 digits");

        if(!condition1 && !condition2 && !condition3){
            System.out.println("Password is valid");
        }
    }
}
