package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws FileNotFoundException {
        //Code to create a file.
        File myFile = new File("fileEx.txt");
        try {
            myFile.createNewFile();
        }catch (IOException e){
            System.out.println("unable to create a file");
            e.printStackTrace();                                                 //handling io exception
        }

        //Code to write a file
        try {
            FileWriter fileWriter = new FileWriter("file_ex.txt");
            fileWriter.write("This is our first file from me!!!");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Reading a file.
        File myFile2 = new File("file_ex.txt");
        try {
            Scanner sc = new Scanner(myFile2);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //deleting a file.

        File myFile3 = new File("fileEx.txt");
        if(myFile3.delete()){
            System.out.println("deleted!!!!!");
        }else {
            System.out.println("some error happeneddd!!!!!");
        }
    }
}
