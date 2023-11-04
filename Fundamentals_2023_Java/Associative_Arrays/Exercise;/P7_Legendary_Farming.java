package Associative_Arrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P7_Legendary_Farming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String,Integer> materialsJunk = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> keyMaterials = new LinkedHashMap<>();
        keyMaterials.put("shards",0);
        keyMaterials.put("fragments",0);
        keyMaterials.put("motes",0);


        boolean br = false;
        String legendaryItem = "";
        while (true){

            String[] input = scan.nextLine().split(" ");
        for (int i = 0; i < input.length; i+=2) {
            String material = input[i+1].toLowerCase();
            int amount = Integer.parseInt(input[i]);

            if(!materialsJunk.containsKey(material) && !material.equals("shards") && !material.equals("fragments") && !material.equals("motes")){
                materialsJunk.put(material,0);
            }
            if(!material.equals("shards") && !material.equals("fragments") && !material.equals("motes")){
                materialsJunk.put(material,materialsJunk.get(material) + amount);
            }

            if(material.equals("shards") || material.equals("fragments") || material.equals("motes")){

                keyMaterials.put(material,keyMaterials.get(material) + amount);


                if(keyMaterials.containsKey("shards")){
                if(keyMaterials.get("shards") >= 250){
                    keyMaterials.put(material,keyMaterials.get(material) - 250);
                    legendaryItem = "Shadowmourne";
                    br = true;
                    break;
                }
            }
                if(keyMaterials.containsKey("fragments")){
                if(keyMaterials.get("fragments") >= 250){
                    keyMaterials.put(material,keyMaterials.get(material) - 250);
                    legendaryItem = "Valanyr";
                    br = true;
                    break;
                }
            }
                if(keyMaterials.containsKey("motes")){
                if(keyMaterials.get("motes") >= 250){
                    keyMaterials.put(material,keyMaterials.get(material) - 250);
                    legendaryItem = "Dragonwrath";
                    br = true;
                    break;
                }
            }
            }
        }
        if(br){
            break;
        }
        }

        System.out.printf("%s obtained!%n",legendaryItem);
        for (Map.Entry<String,Integer> kvp : keyMaterials.entrySet()){
            System.out.printf("%s: %d%n",kvp.getKey(),kvp.getValue());
        }
        for (Map.Entry<String,Integer> kvp : materialsJunk.entrySet()){
            System.out.printf("%s: %d%n",kvp.getKey(),kvp.getValue());
        }
    }
}
