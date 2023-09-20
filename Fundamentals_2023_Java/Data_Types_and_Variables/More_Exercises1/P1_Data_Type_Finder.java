package L2.Data_Types_and_Variables.More_exercise;

import java.util.Scanner;

public class P1_Data_Type_Finder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();

        while(!type.equals("END")){
            Scanner input = new Scanner(type);
            if(input.hasNextBoolean()){
                System.out.printf("%s is boolean type%n", type);
            } else if (input.hasNextInt()) {
                System.out.printf("%s is integer type%n", type);
            } else if (input.hasNextDouble()) {
                System.out.printf("%s is floating point type%n", type);
            } else if(type.length() == 1){
                System.out.printf("%s is character type%n", type);
            }
            else System.out.printf("%s is string type%n", type);

            type = scan.nextLine();
        }
    }
}
