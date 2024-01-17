package Sets_And_Maps_Advanced.Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P4_Count_Symbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        Map<Character,Integer> map = new TreeMap<>();

        for (int i = 0; i < line.length(); i++) {
            char el = line.charAt(i);

            map.putIfAbsent(el,0);
            map.put(el,map.get(el) + 1);
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.printf("%c: %d time/s%n",entry.getKey(),entry.getValue());
        }
    }
}
