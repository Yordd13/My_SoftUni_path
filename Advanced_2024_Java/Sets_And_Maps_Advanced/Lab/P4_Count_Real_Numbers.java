package Sets_And_Maps_Advanced.Lab;

import java.util.*;

public class P4_Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] values = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double,Integer> numbersCount = new LinkedHashMap<>();

        for (double num : values) {

            if(!numbersCount.containsKey(num)){
                numbersCount.put(num,1);
            }
            else {
                numbersCount.put(num,numbersCount.get(num) + 1);
            }
        }

        for (Double key : numbersCount.keySet()){
            System.out.printf("%.1f -> %d%n",key,numbersCount.get(key));
        }
    }
}
