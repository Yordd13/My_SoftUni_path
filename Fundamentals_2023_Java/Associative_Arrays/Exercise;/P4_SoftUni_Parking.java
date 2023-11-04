package Associative_Arrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P4_SoftUni_Parking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String,String> parkingSlots = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scan.nextLine().split(" ");
            String command1 = command[0];
            String name = command[1];


            if(command1.equals("register")){
                String plate = command[2];
                if(parkingSlots.containsKey(name)){
                    System.out.printf("ERROR: already registered with plate number %s%n",parkingSlots.get(name));
                    continue;
                }
                else {
                    parkingSlots.put(name,"");
                }

                parkingSlots.put(name,plate);
                System.out.printf("%s registered %s successfully%n",name,plate);
            }
            else {
                if(!parkingSlots.containsKey(name)){
                    System.out.printf("ERROR: user %s not found%n",name);
                }
                else{
                    parkingSlots.remove(name);
                    System.out.printf("%s unregistered successfully%n",name);
                }
            }
        }

        for (Map.Entry<String,String> kvp : parkingSlots.entrySet()){
            System.out.printf("%s => %s%n",kvp.getKey(),kvp.getValue());
        }
    }
}
