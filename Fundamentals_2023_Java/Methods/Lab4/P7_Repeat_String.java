package L4.Methods.Lab;

import java.util.Scanner;

public class P7_Repeat_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int times = Integer.parseInt(scan.nextLine());

        String output = ReturnText(input , times);
        System.out.println(output);

    }
    public static String ReturnText(String input, int times){
        String result = "";
        for (int i = 0; i < times; i++) {
            result += input;
        }
        return result;
    }
}
