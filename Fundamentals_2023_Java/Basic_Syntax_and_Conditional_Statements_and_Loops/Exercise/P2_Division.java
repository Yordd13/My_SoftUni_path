package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.Exercise;

import java.util.Scanner;

public class P2_Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        int divisible = 0;

        if(num % 2 == 0){
            divisible = 2;
        }
        if(num % 3 == 0){
            divisible = 3;
        }
        if(num % 6 == 0){
            divisible = 6;
        }
        if(num % 7 == 0){
            divisible = 7;
        }
        if(num % 10 == 0){
            divisible = 10;
        }

        if(divisible != 0){
            System.out.println("The number is divisible by " + divisible);
        }
        else System.out.println("Not divisible");
    }
}
