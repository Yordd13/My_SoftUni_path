package Streams_Files_And_Directories.Lab;

import java.io.*;
import java.util.Scanner;

public class P4_Extract_Integers {
    public static void main(String[] args) {


        String inputPath = "C:\\Users\\yordd\\OneDrive\\Работен плот\\input.txt";

        try (FileReader fileReader = new FileReader(inputPath)){

            Scanner scan = new Scanner(fileReader);

            while (scan.hasNext()){
                if(scan.hasNextInt()){
                    System.out.println(scan.nextInt());
                }
                scan.next();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
