package L4.Methods.Lab;

import java.util.Scanner;

public class P1_Sign_of_Integer_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ReturnSign(Integer.parseInt(scan.nextLine()));

    }
    public static void ReturnSign(int number){
        if(number > 0){
            System.out.printf("The number %d is positive.", number);
        }
        else if(number < 0){
            System.out.printf("The number %d is negative.", number);
        }
        else System.out.println("The number 0 is zero.");
    }
}
