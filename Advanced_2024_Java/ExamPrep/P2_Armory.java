package ExamPrep;

import java.util.Scanner;

public class P2_Armory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String[][] arr = new String[n][n];

        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().split("");
            System.arraycopy(line, 0, arr[i], 0, n);
        }

        int xA = 0;
        int yA = 0;

        for (int i = 0; i < n; i++) {
            boolean toBreak = false;
            for (int j = 0; j < n; j++) {
                if(arr[i][j].equals("A")){
                    xA = i;
                    yA = j;
                    toBreak = true;
                    break;
                }
            }
            if(toBreak){
                break;
            }
        }


        String line = scan.nextLine();

        int priceSwords = 0;
        while (true){
            boolean end = false;

            switch (line){
                case "up":
                    arr[xA][yA] = "-";
                    xA--;
                    if(xA < 0){
                        end = true;
                    }
                    else {
                        if(arr[xA][yA].equals("-")){
                            arr[xA][yA] = "A";
                        }
                        else if(arr[xA][yA].equals("M")){
                            Mirror(n,arr,xA,yA);
                            for (int i = 0; i < n; i++) {
                                boolean toBreak = false;
                                for (int j = 0; j < n; j++) {
                                    if(arr[i][j].equals("A")){
                                        xA = i;
                                        yA = j;
                                        toBreak = true;
                                        break;
                                    }
                                }
                                if(toBreak){
                                    break;
                                }
                            }
                        }
                        else {
                            int num = Integer.parseInt(arr[xA][yA]);
                            priceSwords += num;
                            arr[xA][yA] = "A";
                        }
                    }
                    break;
                case "down":
                    arr[xA][yA] = "-";
                    xA++;
                    if(xA == n){
                        end = true;
                    }
                    else {
                        if(arr[xA][yA].equals("-")){
                            arr[xA][yA] = "A";
                        }
                        else if(arr[xA][yA].equals("M")){
                            Mirror(n,arr,xA,yA);
                            for (int i = 0; i < n; i++) {
                                boolean toBreak = false;
                                for (int j = 0; j < n; j++) {
                                    if(arr[i][j].equals("A")){
                                        xA = i;
                                        yA = j;
                                        toBreak = true;
                                        break;
                                    }
                                }
                                if(toBreak){
                                    break;
                                }
                            }
                        }
                        else {
                            int num = Integer.parseInt(arr[xA][yA]);
                            priceSwords += num;
                            arr[xA][yA] = "A";
                        }
                    }
                    break;
                case "left":
                    arr[xA][yA] = "-";
                    yA--;
                    if(yA < 0){
                        end = true;
                    }
                    else {
                        if(arr[xA][yA].equals("-")){
                            arr[xA][yA] = "A";
                        }
                        else if(arr[xA][yA].equals("M")){
                            Mirror(n,arr,xA,yA);
                            for (int i = 0; i < n; i++) {
                                boolean toBreak = false;
                                for (int j = 0; j < n; j++) {
                                    if(arr[i][j].equals("A")){
                                        xA = i;
                                        yA = j;
                                        toBreak = true;
                                        break;
                                    }
                                }
                                if(toBreak){
                                    break;
                                }
                            }
                        }
                        else {
                            int num = Integer.parseInt(arr[xA][yA]);
                            priceSwords += num;
                            arr[xA][yA] = "A";
                        }
                    }
                    break;
                case "right":
                    arr[xA][yA] = "-";
                    yA++;
                    if(yA == n){
                        end = true;
                    }
                    else {
                        if(arr[xA][yA].equals("-")){
                            arr[xA][yA] = "A";
                        }
                        else if(arr[xA][yA].equals("M")){
                            Mirror(n,arr,xA,yA);
                            for (int i = 0; i < n; i++) {
                                boolean toBreak = false;
                                for (int j = 0; j < n; j++) {
                                    if(arr[i][j].equals("A")){
                                        xA = i;
                                        yA = j;
                                        toBreak = true;
                                        break;
                                    }
                                }
                                if(toBreak){
                                    break;
                                }
                            }
                        }
                        else {
                            int num = Integer.parseInt(arr[xA][yA]);
                            priceSwords += num;
                            arr[xA][yA] = "A";
                        }
                    }
                    break;
            }

            if(priceSwords >= 65){
                System.out.println("Very nice swords, I will come back for more!");
                break;
            }

            if(end){
                System.out.println("I do not need more swords!");
                break;
            }

            line = scan.nextLine();
        }
        System.out.printf("The king paid %d gold coins.%n",priceSwords);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void Mirror(int n,String[][] arr,int xA,int yA){
        int xM = 0;
        int yM = 0;
        for (int i = 0; i < n; i++) {
            boolean toBreak = false;
            for (int j = 0; j < n; j++) {
                if(arr[i][j].equals("M") && xA != i && yA != j){
                    xM = i;
                    yM = j;
                    toBreak = true;
                    break;
                }
            }
            if(toBreak){
                break;
            }
        }
        arr[xA][yA] = "-";
        arr[xM][yM] = "A";
    }
}
