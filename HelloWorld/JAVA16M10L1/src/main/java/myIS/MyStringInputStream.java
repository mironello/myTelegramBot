package myIS;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

public class MyStringInputStream extends InputStream {

    private Queue<Character> elements;

    public MyStringInputStream(String row) {
        char[] chars = row.toCharArray();
        elements = new ArrayDeque<>();

        for (char el :
                chars) {
            elements.add(el);
        }
    }

    @Override
    public int available() throws IOException {
        return elements.size();
    }

    @Override
    public int read() throws IOException {
        if (available() == 0) {
            return -1;
        }
        return elements.poll();
    }

    public static void main(String[] args) throws IOException {
        MyStringInputStream ms = new MyStringInputStream("  java hello");

        System.out.println("args = " + ms.available());

        while (ms.available() > 0) {
            int readed = ms.read();
            System.out.println("(char)ms.read()= " + (char)readed);
            System.out.println("ms.read()= " + readed );
        }
        System.out.println("ms.available()= " + ms.available());
    }
}

