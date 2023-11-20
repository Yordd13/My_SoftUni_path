package FInalExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P3_Plant_Discovery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String,Integer> rarity = new LinkedHashMap<>();
        LinkedHashMap<String,Double> rating = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> count = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("<->");

            if(!rarity.containsKey(input[0])){
                rarity.put(input[0],0);
                rating.put(input[0],0.0);
                count.put(input[0],0);
            }

            rarity.put(input[0],Integer.parseInt(input[1]));
        }

        while (true){
            String line = scan.nextLine();
            if(line.equals("Exhibition")){
                break;
            }

            String[] commands = line.split(": ");
            String[] commands2 = commands[1].split(" - ");
            String plant = commands2[0];
            if(!rarity.containsKey(plant)){
                System.out.println("error");
                continue;
            }

            switch (commands[0]){
                case "Rate":
                    double rating1 = Double.parseDouble(commands2[1]);
                    rating.put(plant,rating1 + rating.get(plant));
                    count.put(plant,count.get(plant) + 1);

                    break;
                case "Update":
                    int rarity1 = Integer.parseInt(commands2[1]);
                    rarity.put(plant,rarity1);
                    break;
                case "Reset":
                    rating.put(plant,0.0);
                    count.put(plant,0);
                    break;
            }

        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String,Integer> kvp : rarity.entrySet()) {
            if(count.get(kvp.getKey()) == 0){
                System.out.printf("- %s; Rarity: %d; Rating: 0.00%n", kvp.getKey(),kvp.getValue());
            }
            else {
                System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", kvp.getKey(),kvp.getValue(), rating.get(kvp.getKey())/count.get(kvp.getKey()));
            }
        }
    }
}
