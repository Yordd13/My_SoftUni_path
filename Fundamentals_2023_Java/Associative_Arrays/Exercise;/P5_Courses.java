package Associative_Arrays.Exercises;

import java.util.*;

public class P5_Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, List<String>> students = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> counts = new LinkedHashMap<>();

        while (true){
            String line = scan.nextLine();
            if(line.equals("end")){
                break;
            }
            String[] command = line.split(" : ");
            String courseName = command[0];
            String nameStudent = command[1];

            if(!students.containsKey(courseName)){
                students.put(courseName,new ArrayList<>());
                counts.put(courseName,0);
            }

            counts.put(courseName,counts.get(courseName) + 1);
            students.get(courseName).add(nameStudent);
        }

        for (Map.Entry<String,List<String>> kvp : students.entrySet()){
            System.out.printf("%s: %d%n",kvp.getKey(),counts.get(kvp.getKey()));
            System.out.printf("-- %s%n",String.join("\n-- ",kvp.getValue()));
        }
    }
}
