package org.lessons.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Scanner fileReader = null;
        try{
            fileReader = new Scanner(new File("./resources/data.txt"));
            while (fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e) {
            System.out.println("File non trovato");
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
}
