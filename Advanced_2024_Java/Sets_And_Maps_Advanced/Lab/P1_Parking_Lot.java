package Sets_And_Maps_Advanced.Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P1_Parking_Lot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> parking = new LinkedHashSet<>();

        String input = scan.nextLine();

        while (!input.equals("END")){
            String[] commands =input.split(", ");

            if(commands[0].equals("IN")){
                parking.add(commands[1]);
            }
            else if(commands[0].equals("OUT")){
                parking.remove(commands[1]);
            }

            input = scan.nextLine();
        }

        if(parking.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }
        else {
            for (String carNum : parking) {
                System.out.println(carNum);
            }
        }
    }
}
