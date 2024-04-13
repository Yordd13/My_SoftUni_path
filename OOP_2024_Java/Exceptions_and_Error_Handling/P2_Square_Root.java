package Exceptions_and_Error_Handling;

import java.util.Scanner;

public class P2_Square_Root {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number = scan.nextLine();
        int num;

        try{
            num = Integer.parseInt(number);
            if(num < 0){
                throw new RuntimeException("Invalid");
            }
            System.out.printf("%.2f\n",Math.sqrt(num));
        }
        catch (RuntimeException ex){
            System.out.println("Invalid");
        }
        finally {
            System.out.println("Goodbye");
        }
    }
}
