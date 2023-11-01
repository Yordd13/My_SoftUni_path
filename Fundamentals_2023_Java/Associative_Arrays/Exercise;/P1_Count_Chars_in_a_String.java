package Associative_Arrays.Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class P1_Count_Chars_in_a_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> words = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

        LinkedHashMap<Character,Integer> count = new LinkedHashMap<>();

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if(!count.containsKey(word.charAt(i))){
                    count.put(word.charAt(i),1);
                }
                else {
                    count.put(word.charAt(i), count.get(word.charAt(i)) + 1);
                }
            }
        }

        for (Map.Entry<Character,Integer> kvp : count.entrySet()){
            System.out.printf("%c -> %d%n",kvp.getKey(),kvp.getValue());
        }
    }
}
