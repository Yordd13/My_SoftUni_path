package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P3_Wild_Zoo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, Integer> food = new LinkedHashMap<>();
        LinkedHashMap<String,String> area = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> count = new LinkedHashMap<>();


        while (true){
            String line = scan.nextLine();

            if(line.equals("EndDay")){
                break;
            }

            String[] command = line.split(" ");
            String[] information = command[1].split("-");

            switch (command[0]){
                case "Add:":
                    if(!food.containsKey(information[0])){
                        food.put(information[0],Integer.parseInt(information[1]));
                        area.put(information[0],information[2]);
                        if(!count.containsKey(information[2])){
                            count.put(information[2],0);
                        }
                    }
                    else {
                        food.put(information[0],food.get(information[0]) + Integer.parseInt(information[1]));
                        continue;
                    }

                    count.put(information[2],count.get(information[2]) + 1);
                    break;
                case "Feed:":
                    String name = information[0];
                    int givenFood = Integer.parseInt(information[1]);
                    if(food.containsKey(name)){
                        food.put(name,food.get(name) - givenFood);
                        if(food.get(name) <= 0){
                            System.out.printf("%s was successfully fed%n",name);
                            food.remove(name);
                            count.put(area.get(name),count.get(area.get(name)) - 1);
                        }
                    }
                    break;
            }
        }

        System.out.println("Animals:");
        for (Map.Entry<String,Integer>  kvp : food.entrySet()) {
            System.out.printf("%s -> %dg%n",kvp.getKey(),kvp.getValue());
        }

        System.out.println("Areas with hungry animals:");
        for (Map.Entry<String,Integer> kvp : count.entrySet()) {
            if(!(kvp.getValue() <= 0)){
                System.out.printf("%s: %d%n",kvp.getKey(),kvp.getValue());
            }
        }
    }
}
