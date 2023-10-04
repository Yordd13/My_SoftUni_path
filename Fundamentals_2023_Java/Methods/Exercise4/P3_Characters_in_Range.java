package L4.Methods.Exercise;

import java.util.Scanner;

public class P3_Characters_in_Range {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char start = scan.nextLine().charAt(0);
        char end = scan.nextLine().charAt(0);

        getBetween(start,end);
    }

    public static void getBetween(char start, char end){

        if(start < end) {
            for (int i = start + 1; i < end; i++) {
                System.out.print(Character.toString(i) + " ");
            }
        }
        else for (int i = end + 1; i < start; i++) {
            System.out.print(Character.toString(i) + " ");
        }
    }
}
