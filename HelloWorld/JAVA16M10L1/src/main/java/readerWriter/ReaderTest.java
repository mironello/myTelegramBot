package readerWriter;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class ReaderTest {
    public static void main(String[] args) throws IOException {
        String asd = "lsldflsfsfsdfs";
        Reader reader = new StringReader(asd);

        for (int i = 0; i < asd.length(); i++) {
            char c = (char)reader.read();
            System.out.println(c);
        }

        reader.close();
    }
}
