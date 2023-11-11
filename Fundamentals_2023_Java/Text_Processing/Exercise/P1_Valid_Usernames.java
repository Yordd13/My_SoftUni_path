package Text_Processing.Exercises;

import java.util.Scanner;

public class P1_Valid_Usernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = scan.nextLine().split(", ");

        for (String name : names) {
            if(name.length() >= 3 && name.length() <= 16){
                boolean condition = true;
                for (int i = 0; i < name.length(); i++) {
                    char digit = name.charAt(i);
                    if(!Character.isLetter(digit) && !Character.isDigit(digit) && !(digit == '-') && !(digit == '_')){
                        condition = false;
                    }
                }
                if(condition) System.out.println(name);
            }
        }
    }
}
