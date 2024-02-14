package ExamPrep;

import java.util.*;

public class P1_Blacksmith {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> steel = new ArrayDeque<>();
        String[] input1 = scan.nextLine().split(" ");

        for (int i = 0; i < input1.length; i++) {
            steel.offer(Integer.parseInt(input1[i]));
        }

        ArrayDeque<Integer> carbon = new ArrayDeque<>();
        String[] input2 = scan.nextLine().split(" ");

        for (int i = 0; i < input2.length; i++) {
            carbon.push(Integer.parseInt(input2[i]));
        }

        Map<String,Integer> swords = new TreeMap<>();

        int counter = 0;
        while (!steel.isEmpty() && !carbon.isEmpty()){
            int sum = steel.peek() + carbon.peek();

            boolean forged = false;
            switch (sum){
                case 70:
                    forged = true;
                    steel.poll();
                    carbon.pop();
                    swords.putIfAbsent("Gladius",0);
                    swords.put("Gladius",swords.get("Gladius") + 1);
                    break;
                case 80:
                    forged = true;
                    steel.poll();
                    carbon.pop();
                    swords.putIfAbsent("Shamshir",0);
                    swords.put("Shamshir",swords.get("Shamshir") + 1);
                    break;
                case 90:
                    forged = true;
                    steel.poll();
                    carbon.pop();
                    swords.putIfAbsent("Katana",0);
                    swords.put("Katana",swords.get("Katana") + 1);
                    break;
                case 110:
                    forged = true;
                    steel.poll();
                    carbon.pop();
                    swords.putIfAbsent("Sabre",0);
                    swords.put("Sabre",swords.get("Sabre") + 1);
                    break;
            }

            if(!forged){
                steel.poll();
                int carbonCurr = carbon.pop() + 5;
                carbon.push(carbonCurr);
            }
            else counter++;
        }

        if(counter > 0){
            System.out.printf("You have forged %d swords.%n",counter);
        }
        else System.out.println("You did not have enough resources to forge a sword.");

        if(steel.isEmpty()){
            System.out.println("Steel left: none");
        }
        else {
            System.out.print("Steel left: ");
            for (int i = 0; i < steel.size(); i++) {
                if (steel.size() > 1) {
                    System.out.print(steel.poll() + ", ");
                    i--;
                } else System.out.println(steel.poll());
            }
        }

        if(carbon.isEmpty()){
            System.out.println("Carbon left: none");
        }
        else {
            System.out.print("Carbon left: ");
            for (int i = 0; i < carbon.size(); i++) {
                if (carbon.size() > 1) {
                    System.out.print(carbon.pop() + ", ");
                    i--;
                } else System.out.println(carbon.pop());
            }
        }

        if(counter > 0){
            for (Map.Entry<String,Integer> entry : swords.entrySet()){
                if(entry.getValue() > 0){
                    System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
                }
            }
        }
    }
}
