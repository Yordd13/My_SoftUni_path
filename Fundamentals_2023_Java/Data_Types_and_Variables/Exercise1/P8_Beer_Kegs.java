package L2.Data_Types_and_Variables.Exercise;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;
import java.util.function.DoublePredicate;

public class P8_Beer_Kegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double max = Integer.MIN_VALUE;
        String biggest = "";
        for (int i = 0; i < n; i++) {
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());

            if(max < Math.PI * radius * radius * height){
                biggest = "";
                biggest += model;
                max = Math.PI * radius * radius * height;
            }
        }
        System.out.println(biggest);
    }
}
