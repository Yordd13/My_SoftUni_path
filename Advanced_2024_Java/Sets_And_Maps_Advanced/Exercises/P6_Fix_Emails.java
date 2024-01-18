package Sets_And_Maps_Advanced.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P6_Fix_Emails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String,String> map = new LinkedHashMap<>();

        String name = scan.nextLine();
        while (!name.equals("stop")){
            String email = scan.nextLine();

            String[] emailEnd = email.split("\\.");

            if(!emailEnd[emailEnd.length - 1].equals("com") && !emailEnd[emailEnd.length - 1].equals("uk") && !emailEnd[emailEnd.length - 1].equals("us")){
                map.putIfAbsent(name,"");
                map.put(name,email);
            }

            name = scan.nextLine();
        }

        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.printf("%s -> %s%n",entry.getKey(),entry.getValue());
        }
    }
}
