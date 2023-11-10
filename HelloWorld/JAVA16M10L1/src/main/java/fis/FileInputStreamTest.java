package fis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {

        File file = new File("hello.txt");
        File dir1 = new File("dir1");

         System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.exist() = " + file.exists());
        System.out.println("file.isDirectory() = " + dir1.isDirectory());
        System.out.println("file.getCanonicalFile() = " + file.getCanonicalFile());
        System.out.println("file.exists() = " + file.exists());

        InputStream is = new FileInputStream(file);
//            while(is .available()>0){
//                int read = is.read();
//                System.out.println("(char)read = " + (char) read);
//                System.out.println("read = " + read);
//            }

        Scanner s = new Scanner(is);
        while (s.hasNextLine()) {
            System.out.println("s.nextLine() = " + s.nextLine().trim());
        }
        s.close();
    }
}
