package L2.Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class P5_Concat_Names {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        String delimiter = scan.nextLine();

        System.out.println(name1 + delimiter +name2);
    }
}
