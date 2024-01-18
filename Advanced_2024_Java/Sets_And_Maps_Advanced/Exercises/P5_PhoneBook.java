package Sets_And_Maps_Advanced.Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P5_PhoneBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String,String> map = new HashMap<>();

        String line = scan.nextLine();
        while (!line.equals("search")){
            String[] tokens = line.split("-");
            map.putIfAbsent(tokens[0],"");
            map.put(tokens[0],tokens[1]);

            line = scan.nextLine();
        }

        line = scan.nextLine();
        while (!line.equals("stop")){

            if(map.containsKey(line)){
                System.out.printf("%s -> %s%n",line,map.get(line));
            }
            else {
                System.out.printf("Contact %s does not exist.%n",line);
            }

            line = scan.nextLine();
        }
    }
}

