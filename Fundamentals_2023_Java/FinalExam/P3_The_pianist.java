package FInalExamPrep;

import java.util.*;
import java.util.regex.Pattern;

public class P3_The_pianist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String,List<String>> songs = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\|");

            if(!songs.containsKey(input[0])){
                songs.put(input[0],new ArrayList<>());
            }

            songs.get(input[0]).add(input[1]);
            songs.get(input[0]).add(input[2]);
        }

        while (true){
            String[] input = scan.nextLine().split("\\|");

            if(input[0].equals("Stop")){
                break;
            }

            String command = input[0];

            switch (command){
                case "Add":
                    String songName = input[1];
                    String author = input[2];
                    String key = input[3];

                    if(!songs.containsKey(songName)) {
                        songs.put(songName, new ArrayList<>());
                        songs.get(songName).add(author);
                        songs.get(songName).add(key);

                        System.out.printf("%s by %s in %s added to the collection!%n",songName,author,key);
                    }
                    else{
                        System.out.printf("%s is already in the collection!%n",songName);
                    }

                    break;
                case "Remove":
                    if(songs.containsKey(input[1])){
                        songs.remove(input[1]);
                        System.out.printf("Successfully removed %s!%n",input[1]);
                    }
                    else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",input[1]);
                    }
                    break;
                case "ChangeKey":
                    String piece = input[1];
                    String newKey = input[2];

                    if(songs.containsKey(piece)){
                        songs.get(piece).remove(1);
                        songs.get(piece).add(newKey);
                        System.out.printf("Changed the key of %s to %s!%n",piece,newKey);
                    }
                    else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                    }
            }
        }

        for (Map.Entry<String,List<String>> hvp : songs.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n",hvp.getKey(),hvp.getValue().get(0),hvp.getValue().get(1));
        }
    }
}
