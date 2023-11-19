package FInalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1_The_Imitation_game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Character> letters = new ArrayList<>();
        String word = scan.nextLine();

        for (int i = 0; i < word.length(); i++) {
            letters.add(word.charAt(i));
        }

        while (true){
            String[] input = scan.nextLine().split("\\|");

            if(input[0].equals("Decode")){
                break;
            }

            String command = input[0];

            switch (command){
                case "Move":
                    int n = Integer.parseInt(input[1]);

                    for (int i = 0; i < n; i++) {
                        char current = letters.get(0);
                        letters.remove(letters.indexOf(current));
                        letters.add(current);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(input[1]);
                    String value = input[2];
                    for (int i = value.length()-1; i >=0; i--) {
                        letters.add(index,value.charAt(i));
                    }

                    break;
                case "ChangeAll":
                    char substring = input[1].charAt(0);
                    char replacement = input[2].charAt(0);

                    for (int i = 0; i < letters.size(); i++) {
                        if(letters.contains(substring)){
                            int index1 = letters.indexOf(substring);
                            letters.remove(index1);
                            letters.add(index1,replacement);
                        }
                    }
                    break;
            }
        }
        System.out.print("The decrypted message is: ");
        letters.forEach(System.out::print);
    }
}
