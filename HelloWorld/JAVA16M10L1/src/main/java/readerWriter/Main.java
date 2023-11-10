package readerWriter;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File dir = new File("dir2");

        dir.mkdirs();
        System.out.println("dir.getCanonicalFile() = " + dir.getCanonicalFile());
        System.out.println("dir.getAbsolutePath() = " + dir.getAbsolutePath());

        File [] files = dir.listFiles();

        for (File file :
                files) {
            System.out.println("file.isDirectory() = " + file.isDirectory());
            System.out.println("file.isFile() = " + file.isFile());
            System.out.println("file.getName() = " + file.getName());
            System.out.println();
        }
    }

}
