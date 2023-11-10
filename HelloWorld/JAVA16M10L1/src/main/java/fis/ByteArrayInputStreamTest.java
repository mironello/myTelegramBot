package fis;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteArrayInputStreamTest {

    public static void main(String[] args) throws IOException {

        byte [] bytes = {65, 66, 67, 68};
        ByteArrayInputStream ba = new ByteArrayInputStream(bytes);
        ByteArrayInputStream ba2 = new ByteArrayInputStream(bytes);

        Scanner scanner = new Scanner(ba);
        System.out.println("scanner.nextLine() = " + scanner.nextLine());

        while(ba2.available() > 0){
            System.out.println("((char)  ba2.read()) = " + ((char)ba2.read()));
        }

        ba.close();
        ba2.close();
    }
}
