package readerWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {

    public static void main(String[] args) throws IOException {

//        FileWriter fr = new FileWriter("new-file.txt");
//        fr.write("this is test from java app\n");
//        fr.write("this is test from java app\n");
//        fr.write("this is test from java app\n");
//
//        fr.flush();
//        fr.close();

        File file = new File("new-file2.txt");

        FileOutputStream fos = new FileOutputStream(file);
        fos.write('h');
        fos.write('e');
        fos.write('l');
        fos.write('l');
        fos.write('o');

        fos.flush();
        fos.close();
    }
}
