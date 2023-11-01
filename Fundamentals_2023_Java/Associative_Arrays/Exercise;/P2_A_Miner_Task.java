package Associative_Arrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P2_A_Miner_Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String,Integer> count = new LinkedHashMap<>();

        while (true){
            String command1 = scan.nextLine();
            if(command1.equals("stop")){
                break;
            }

            int command2 = Integer.parseInt(scan.nextLine());

            if(!count.containsKey(command1)){
                count.put(command1,0);
            }

            count.put(command1,count.get(command1) + command2);
        }

        for(Map.Entry<String,Integer> kvp : count.entrySet()){
            System.out.printf("%s -> %d%n", kvp.getKey(),kvp.getValue());
        }
    }
}
