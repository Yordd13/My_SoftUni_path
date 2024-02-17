package RealExam;

import java.util.Scanner;

public class P2_Clear_Skies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String[][] arr = new String[n][n];

        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().split("");
            System.arraycopy(line, 0, arr[i], 0, n);
        }

        int armour = 300;
        int x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            boolean toBreak = false;
            for (int j = 0; j < n; j++) {
                if(arr[i][j].equals("J")){
                    x = i;
                    y = j;
                    toBreak = true;
                    break;
                }
            }
            if(toBreak){
                break;
            }
        }

        int countPlanesToFight = 4;
        while (true){
            String line = scan.nextLine();

            switch (line){
                case "up":
                    arr[x][y] = "-";
                    x--;
                    switch (arr[x][y]){
                        case "-":
                            arr[x][y] = "J";
                            break;
                        case "E":
                            if(countPlanesToFight >= 1){
                                armour-=100;
                            }
                            arr[x][y] = "-";
                            countPlanesToFight--;
                            break;
                        case "R":
                            armour = 300;
                            arr[x][y] = "-";
                            break;
                    }

                    break;
                case "down":
                    arr[x][y] = "-";
                    x++;
                    switch (arr[x][y]){
                        case "-":
                            arr[x][y] = "J";
                            break;
                        case "E":
                            if(countPlanesToFight >= 1){
                                armour-=100;
                            }
                            arr[x][y] = "-";
                            countPlanesToFight--;
                            break;
                        case "R":
                            armour = 300;
                            arr[x][y] = "-";
                            break;
                    }
                    break;
                case "left":
                    arr[x][y] = "-";
                    y--;
                    switch (arr[x][y]){
                        case "-":
                            arr[x][y] = "J";
                            break;
                        case "E":
                            if(countPlanesToFight >= 1){
                                armour-=100;
                            }
                            arr[x][y] = "-";
                            countPlanesToFight--;
                            break;
                        case "R":
                            armour = 300;
                            arr[x][y] = "-";
                            break;
                    }
                    break;
                case "right":
                    arr[x][y] = "-";
                    y++;
                    switch (arr[x][y]){
                        case "-":
                            arr[x][y] = "J";
                            break;
                        case "E":
                            if(countPlanesToFight >= 1){
                                armour-=100;
                            }
                            arr[x][y] = "-";
                            countPlanesToFight--;
                            break;
                        case "R":
                            armour = 300;
                            arr[x][y] = "-";
                            break;
                    }
                    break;
            }

            if(armour == 0){
                System.out.printf("Mission failed, your jetfighter was shot down! Last coordinates [%d, %d]!%n",x,y);
                break;
            }
            if(countPlanesToFight == 0){
                System.out.println("Mission accomplished, you neutralized the aerial threat!");
                break;
            }
        }

        arr[x][y] = "J";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
