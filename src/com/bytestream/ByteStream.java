package com.bytestream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteStream {
    public static void main(String args[]) throws IOException {
        //Creating FileInputStream object
        File file = new File("D:/myFile.txt");
        FileInputStream filestream = new FileInputStream(file);
        byte bytes[] = new byte[(int) file.length()];
        //Reading data from the file
        filestream.read(bytes);
        //Writing data to another file
        File out = new File("D:/CopyOfmyFile.txt");
        FileOutputStream outputStream = new FileOutputStream(out);
        //Writing data to the file
        outputStream.write(bytes);
        outputStream.flush();
        System.out.println("Data successfully written in the specified file!!!!!!");
    }
}