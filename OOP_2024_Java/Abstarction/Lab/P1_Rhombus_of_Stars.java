package Abstraction.Lab;

import java.util.Scanner;

public class P1_Rhombus_of_Stars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i++) {
            printRow(i,n-i);
        }
        for (int i = n - 1; i > 0; i--) {
            printRow(i,n-i);
        }
    }

    public static void printRow(int countStars, int countSpaces){
        for (int spaces = 0; spaces < countSpaces; spaces++) {
            System.out.print(" ");
        }

        for (int stars = 0; stars < countStars; stars++) {
            System.out.print("* ");
        }

        System.out.println();
    }
}
