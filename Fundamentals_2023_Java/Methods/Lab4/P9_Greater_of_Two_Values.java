package L4.Methods.Lab;

import java.util.Scanner;

public class P9_Greater_of_Two_Values {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        getMax(scan.nextLine());

    }
    public static void getMax(String type){
        Scanner scan = new Scanner(System.in);
        String result = "";
        if(type.equals("int")){
            int num1 = Integer.parseInt(scan.nextLine());
            int num2 = Integer.parseInt(scan.nextLine());

            if(num1 > num2){
                result += num1;
            }
            else result += num2;
        }
        else if(type.equals("char")){
            char first = scan.nextLine().charAt(0);
            char second = scan.nextLine().charAt(0);

            if(first > second){
                result += first;
            }
            else result += second;
        }
        else {
            String word1 = scan.nextLine();
            String word2 = scan.nextLine();

            if(word1.length() > word2.length()){
                result += word1;
            }
            else result += word2;
        }
        System.out.println(result);
    }
}
