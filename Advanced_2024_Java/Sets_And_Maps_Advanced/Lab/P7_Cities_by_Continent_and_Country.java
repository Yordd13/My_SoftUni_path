package Sets_And_Maps_Advanced.Lab;

import java.util.*;

public class P7_Cities_by_Continent_and_Country {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String,Map<String, List<String>>> map = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            map.putIfAbsent(continent,new LinkedHashMap<>());
            map.get(continent).putIfAbsent(country,new ArrayList<>());
            map.get(continent).get(country).add(city);

        }

        for (Map.Entry<String, Map<String,List<String>>> kvp : map.entrySet()){
            System.out.println(kvp.getKey() + ":");
            for (Map.Entry<String,List<String>> entry : kvp.getValue().entrySet()){
                System.out.println("  " + entry.getKey() + " -> " + String.join(", ",entry.getValue()));
            }
        }
    }
}
