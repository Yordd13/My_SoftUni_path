package L4.Methods.Lab;

import java.util.Scanner;

public class P4_Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ReturnCalculation(scan.nextLine(),Integer.parseInt(scan.nextLine()), Integer.parseInt(scan.nextLine()));

    }

    public static void ReturnCalculation(String action, int num1 , int num2){
        if(action.equals("add")){
            System.out.println(num1 + num2);
        }
        else if(action.equals("multiply")){
            System.out.println(num1 * num2);
        } else if (action.equals("subtract")) {
            System.out.println(num1 - num2);
        }
        else System.out.println(num1 / num2);
    }

}
