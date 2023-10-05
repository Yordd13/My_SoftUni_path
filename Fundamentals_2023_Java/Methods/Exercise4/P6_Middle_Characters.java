package L4.Methods.Exercise;

import java.util.Scanner;

public class P6_Middle_Characters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        getMiddleLetter(input);
    }
    public static void getMiddleLetter(String input){
        if(input.length() % 2 == 0){
            System.out.println(Character.toString(input.charAt(input.length() / 2 -1)) + Character.toString(input.charAt(input.length() / 2)));
        }
        else System.out.println(input.charAt(input.length()/2));
    }
}
