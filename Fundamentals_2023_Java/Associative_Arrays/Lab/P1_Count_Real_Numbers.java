package Associative_Arrays.Lab;

import java.text.DecimalFormat;
import java.util.*;

public class P1_Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double,Integer> count = new TreeMap<>();

        for (double num : numbers) {
            if(!count.containsKey(num)){
                count.put(num,0);
            }
            count.put(num,count.get(num) + 1);
        }

        for (Map.Entry<Double, Integer> kvp : count.entrySet()){
            String keyFormatted = new DecimalFormat("#.####").format(kvp.getKey());
            System.out.printf("%s -> %d%n",keyFormatted, kvp.getValue());
        }
    }
}
