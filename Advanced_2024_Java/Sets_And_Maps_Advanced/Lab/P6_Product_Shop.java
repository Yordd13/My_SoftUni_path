package Sets_And_Maps_Advanced.Lab;

import java.util.*;

public class P6_Product_Shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Map<String,Double>> products = new TreeMap<>();

        String input = scan.nextLine();

        while (!input.equals("Revision")){
            String[] comm = input.split(", ");
            if(!products.containsKey(comm[0])){
                products.put(comm[0],new LinkedHashMap<>());
            }

            products.get(comm[0]).putIfAbsent(comm[1],0.0);
            products.get(comm[0]).put(comm[1],Double.parseDouble(comm[2]));

            input = scan.nextLine();
        }

        for (Map.Entry<String,Map<String,Double>> kvp : products.entrySet()){
            System.out.println(kvp.getKey() + "->");
            for (Map.Entry<String,Double> kvp1 : kvp.getValue().entrySet()){
                System.out.printf("Product: %s, Price: %.1f%n",kvp1.getKey(),kvp1.getValue());
            }
        }

    }
}
