package Sets_And_Maps_Advanced.Exercises;

import java.util.*;

public class P7_Hands_Of_Cards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String , Set<String>> map = new LinkedHashMap<>();

        String line =scan.nextLine();
        while (!line.equals("JOKER")){
            String[] splitter1 = line.split(": ");
            String name = splitter1[0];
            String[] cards = splitter1[1].split(", ");

            map.putIfAbsent(name,new HashSet<>());
            for (String s : cards) {
                map.get(name).add(s);
            }


            line = scan.nextLine();
        }

        for (Map.Entry<String, Set<String>> entry : map.entrySet()){

            int value1 = 0;
            for (String card : entry.getValue()) {
                int value = 0;
                if(card.charAt(1) == '0'){
                    value = 10;
                    char el2 = card.charAt(2);
                    switch (el2){
                        case 'S':
                            value *= 4;
                            break;
                        case 'H':
                            value *= 3;
                            break;
                        case 'D':
                            value *= 2;
                            break;
                    }
                }
                else {
                    char el = card.charAt(0);
                    switch (el) {
                        case 'J':
                            value = 11;
                            break;
                        case 'Q':
                            value = 12;
                            break;
                        case 'K':
                            value = 13;
                            break;
                        case 'A':
                            value = 14;
                            break;
                        default:
                            value = Integer.parseInt(Character.toString(el));
                    }
                    char el2 = card.charAt(1);
                    switch (el2){
                        case 'S':
                            value *= 4;
                            break;
                        case 'H':
                            value *= 3;
                            break;
                        case 'D':
                            value *= 2;
                            break;
                    }
                }

                value1 += value;

            }

            System.out.printf("%s: %d%n",entry.getKey(),value1);
        }
    }
}
