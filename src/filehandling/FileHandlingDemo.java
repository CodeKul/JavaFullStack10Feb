package filehandling;

import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {
        File file =  new File("/home/vaibhav/workspace/JavaFullStack10Feb/src/filehandling/sample.txt");

        //byte stream class
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String str = "Today is Wednesday";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("file write successfully..");

        }  catch (IOException e){
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("/home/vaibhav/workspace/JavaFullStack10Feb/src/filehandling/sample.txt");
            int i = fileInputStream.read();

            while (i>0){
                System.out.print((char) i);
                i = fileInputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
