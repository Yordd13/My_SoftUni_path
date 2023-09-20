package L2.Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class P8_Lower_or_Upper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char letter = scan.nextLine().charAt(0);

        if(letter >= 97){
            System.out.println("lower-case");
        }
        else System.out.println("upper-case");
    }
}
