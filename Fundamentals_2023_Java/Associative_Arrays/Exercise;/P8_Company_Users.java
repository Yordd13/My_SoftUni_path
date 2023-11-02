package Associative_Arrays.Exercises;

import java.util.*;

public class P8_Company_Users {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, List<String>> users = new LinkedHashMap<>();

        while (true){
            String line  = scan.nextLine();
            if(line.equals("End")){
                break;
            }

            String[] command = line.split(" -> ");
            String name = command[0];
            String id = command[1];

            if(!users.containsKey(name)){
                users.put(name,new ArrayList<>());
            }

            if(users.containsKey(name)){
                if(users.get(name).contains(id)){
                    continue;
                }
            }

            users.get(name).add(id);
        }

        for (Map.Entry<String , List<String>> kvp : users.entrySet()){
            System.out.printf("%s%n-- %s%n",kvp.getKey(),String.join("\n-- ",kvp.getValue()));

        }
    }
}
