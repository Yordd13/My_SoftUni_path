package Streams_Files_And_Directories.Lab;

import java.io.FileInputStream;
import java.io.IOException;

public class P1_Read_File {
    public static void main(String[] args) {

        String path = "C:\\input.txt";

        try (FileInputStream fileInputStream = new FileInputStream(path)){
            int oneBite = fileInputStream.read();
            while (oneBite >= 0){
                System.out.print(Integer.toBinaryString(oneBite) + " ");
                oneBite = fileInputStream.read();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
