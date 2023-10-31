package Associative_Arrays.Lab;

import java.util.*;

public class P2_Word_Synonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        LinkedHashMap<String , List<String>> synonyms = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();

            if(!synonyms.containsKey(word)){
                synonyms.put(word, new ArrayList<>());
            }

            synonyms.get(word).add(synonym);
        }

        for (Map.Entry<String, List<String >> kvp : synonyms.entrySet()){
            System.out.printf("%s - %s%n",kvp.getKey(), String.join(", ", kvp.getValue()));
        }
    }
}
