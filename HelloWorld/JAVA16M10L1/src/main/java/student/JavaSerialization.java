package student;

import fis.FileInputStreamTest;

import java.io.*;

public class JavaSerialization {
    public static void main(String[] args) {

    }

    public static  void writeToFile() throws FileNotFoundException {
        Student student = new Student("asd", 34);
        File file = new File("dir1/serialized.bin");
    }

    public static void readFromFile(){

    }
}
