package L4.Methods.Lab;

import java.util.Scanner;

public class P2_Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ReturnGrade(Double.parseDouble(scan.nextLine()));

    }
    public static void ReturnGrade (double grade){
        if(grade >= 5.50){
            System.out.println("Excellent");
        } else if (grade >= 4.50) {
            System.out.println("Very good");
        } else if (grade >= 3.50) {
            System.out.println("Good");
        } else if (grade >= 3.00) {
            System.out.println("Poor");
        }
        else System.out.println("Fail");
    }
}
