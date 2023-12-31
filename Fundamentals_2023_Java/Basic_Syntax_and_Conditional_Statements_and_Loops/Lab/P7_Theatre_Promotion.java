package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class P7_Theatre_Promotion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String typeDay = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());

        if(age >= 0 && age <= 18){
            switch (typeDay){
                case "Weekday":
                    System.out.println("12$");
                    break;
                case "Weekend":
                    System.out.println("15$");
                    break;
                case "Holiday":
                    System.out.println("5$");
                    break;
            }
        }
        else if (age > 18 && age <= 64) {
            switch (typeDay){
                case "Weekday":
                    System.out.println("18$");
                    break;
                case "Weekend":
                    System.out.println("20$");
                    break;
                case "Holiday":
                    System.out.println("12$");
                    break;
            }
        }
        else if (age > 64 && age <= 122) {
            switch (typeDay){
                case "Weekday":
                    System.out.println("12$");
                    break;
                case "Weekend":
                    System.out.println("15$");
                    break;
                case "Holiday":
                    System.out.println("10$");
                    break;
            }
        }
        else {
            System.out.println("Error!");
        }
    }
}
