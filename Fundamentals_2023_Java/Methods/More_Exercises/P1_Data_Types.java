package L4.Methods.More_Exercise;

import java.util.Scanner;

public class P1_Data_Types {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dataType = scan.nextLine();
        String input = scan.nextLine();

        getResult(dataType,input);
    }

    public static void getResult(String dataType, String input){
        if(dataType.equals("int")){
            int num = Integer.parseInt(input);
            System.out.println(num * 2);
        }
        else if(dataType.equals("real")){
            double num = Double.parseDouble(input);
            System.out.printf("%.2f",num * 1.5);
        }
        else {
            System.out.printf("$%s$",input);
        }
    }

}
