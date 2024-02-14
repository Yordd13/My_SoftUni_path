package ExamPrep;

import java.util.Scanner;

public class P2_Sticky_fingers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String[][] arr = new String[n][n];

        String[] moves = scan.nextLine().split(",");

        int pocketMoney=0;

        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            String[] line =scan.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = line[j];
                if(line[j].equals("D")){
                    x = i;
                    y = j;
                }
            }
        }

        for (int i = 0; i < moves.length; i++) {
            switch (moves[i]){
                case "up":
                    if(x - 1 < 0){
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    else {
                        x--;
                        if(arr[x][y].equals("$")){
                            pocketMoney+= x * y;
                        }
                        changePosition(arr,x,y,n,pocketMoney);
                        arr[x+1][y] = "+";
                        if(arr[x][y].equals("#")){
                            for (int b = 0; b < n; b++) {
                                for (int j = 0; j < n; j++) {
                                    System.out.print(arr[b][j] + " ");
                                }
                                System.out.println();
                            }
                            return;
                        }
                        arr[x][y] = "D";
                    }
                    break;
                case "down":
                    if(x + 1 > n - 1){
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    else {
                        x++;
                        if(arr[x][y].equals("$")){
                            pocketMoney+= x * y;
                        }
                        changePosition(arr,x,y,n,pocketMoney);
                        arr[x-1][y] = "+";
                        if(arr[x][y].equals("#")){
                            for (int b = 0; b < n; b++) {
                                for (int j = 0; j < n; j++) {
                                    System.out.print(arr[b][j] + " ");
                                }
                                System.out.println();
                            }
                            return;
                        }
                        arr[x][y] = "D";
                    }
                    break;
                case "left":
                    if(y - 1 < 0){
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    else {
                        y--;
                        if(arr[x][y].equals("$")){
                            pocketMoney+= x * y;
                        }
                        changePosition(arr,x,y,n,pocketMoney);
                        arr[x][y+1] = "+";
                        if(arr[x][y].equals("#")){
                            for (int b = 0; b < n; b++) {
                                for (int j = 0; j < n; j++) {
                                    System.out.print(arr[b][j] + " ");
                                }
                                System.out.println();
                            }
                            return;
                        }
                        arr[x][y] = "D";
                    }
                    break;
                case "right":
                    if(y + 1 > n - 1){
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    else {

                        y++;
                        if(arr[x][y].equals("$")){
                            pocketMoney+= x * y;
                        }
                        changePosition(arr,x,y,n,pocketMoney);
                        arr[x][y-1] = "+";
                        if(arr[x][y].equals("#")){
                            for (int b = 0; b < n; b++) {
                                for (int j = 0; j < n; j++) {
                                    System.out.print(arr[b][j] + " ");
                                }
                                System.out.println();
                            }
                            return;
                        }
                        arr[x][y] = "D";
                    }
                    break;
            }

        }
        System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n",pocketMoney);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void changePosition(String[][] arr,int x, int y, int n,int pocketMoney){
        switch (arr[x][y]){
            case "$":
                System.out.printf("You successfully stole %d$.%n",x * y);
                arr[x][y] = "+";
                break;
            case "P":
                System.out.printf("You got caught with %d$, and you are going to jail.%n",pocketMoney);
                arr[x][y] = "#";
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if(arr[i][j].equals("D")){
                            arr[i][j] = "+";
                            return;
                        }
                    }
                }
                break;
        }
    }
}
