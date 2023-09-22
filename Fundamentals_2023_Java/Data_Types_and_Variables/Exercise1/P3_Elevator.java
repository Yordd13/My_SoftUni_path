package L2.Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P3_Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());

        int counterAmount = 0;
        while(people > 0){
            counterAmount++;
            people -= capacity;
        }
        System.out.println(counterAmount);
    }
}
