package L2.Data_Types_and_Variables.More_exercise;

import java.util.Scanner;

public class P3_Floating_Equality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num1 = Double.parseDouble(scan.nextLine());
        double num2 = Double.parseDouble(scan.nextLine());

        if(Math.abs(num1 - num2) >= 0.000001){
            System.out.println("False");
        }
        else System.out.println("True");
    }
}
