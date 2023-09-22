package L2.Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P7_Water_Overflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int tank = 255;
        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(scan.nextLine());

            if(liters <= tank){
                tank -= liters;
            }
            else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(255-tank);
    }
}
