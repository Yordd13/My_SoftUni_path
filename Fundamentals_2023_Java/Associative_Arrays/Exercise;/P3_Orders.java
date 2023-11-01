package Associative_Arrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P3_Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, Double> price = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> quantity = new LinkedHashMap<>();

        while (true){
            String[] commands = scan.nextLine().split(" ");
            if(commands[0].equals("buy")){
                break;
            }

            String command1 = commands[0];
            double command2 = Double.parseDouble(commands[1]);
            int command3 = Integer.parseInt(commands[2]);

            if(!price.containsKey(command1)){
                price.put(command1,0.0);
                quantity.put(command1,0);
            }
            quantity.put(command1, quantity.get(command1) + command3);
            price.put(command1,quantity.get(command1) * command2);

        }

        for (Map.Entry<String,Double> kvp : price.entrySet()){
            System.out.printf("%s -> %.2f%n", kvp.getKey(), kvp.getValue());
        }
    }
}
