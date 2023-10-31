package Associative_Arrays.Lab;

import java.util.*;

public class P3_Odd_Occurrences {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String[] words = scan.nextLine().split(" ");

            LinkedHashMap<String , Integer> counter = new LinkedHashMap<>();

            for (String word : words){
                word = word.toLowerCase();
                if(!counter.containsKey(word)){
                    counter.put(word,1);
                }
                else {
                    counter.put(word,counter.get(word) + 1);
                }
            }

            List<String> result = new ArrayList<>();
            for (Map.Entry<String, Integer> kvp : counter.entrySet()){
                if(kvp.getValue() % 2 != 0){
                    result.add(kvp.getKey());
                }
            }

            System.out.println(String.join(", ",result));
        }
    }

