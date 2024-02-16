package ExamPrep;

import java.util.*;

public class P1_ChocolateTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Double> milkQueue = new ArrayDeque<>();

        String[] milkInput = scan.nextLine().split("\\s+");

        for (String s : milkInput) {
            milkQueue.offer(Double.parseDouble(s));
        }

        ArrayDeque<Double> cacaoStack = new ArrayDeque<>();

        String[] cacaoInput = scan.nextLine().split("\\s+");

        for (String s : cacaoInput) {
            cacaoStack.push(Double.parseDouble(s));
        }

        Map<String,Integer> mapChoco = new TreeMap<>();

        while (!cacaoStack.isEmpty() && !milkQueue.isEmpty()){
            double currMilk = milkQueue.poll();
            double currCacao = cacaoStack.pop();

            int cacaoPercentage = (int) (currCacao / (currCacao + currMilk) * 100);

            switch (cacaoPercentage){
                case 30:
                    mapChoco.putIfAbsent("Milk Chocolate",0);
                    mapChoco.put("Milk Chocolate",mapChoco.get("Milk Chocolate") + 1);
                    break;
                case 50:
                    mapChoco.putIfAbsent("Dark Chocolate",0);
                    mapChoco.put("Dark Chocolate",mapChoco.get("Dark Chocolate") + 1);
                    break;
                case 100:
                    mapChoco.putIfAbsent("Baking Chocolate",0);
                    mapChoco.put("Baking Chocolate",mapChoco.get("Baking Chocolate") + 1);
                    break;
                default:
                        currMilk += 10;
                        milkQueue.offer(currMilk);
                    break;
            }
        }

        if(mapChoco.size() == 3){
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        }
        else System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");

        for (Map.Entry<String,Integer> entry : mapChoco.entrySet()){
            System.out.printf("# %s --> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
