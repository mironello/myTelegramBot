import fis.ByteArrayInputStreamTest;

import java.io.*;

public class CopyPasterImpl implements CopyPaster{

    private final InputStream from;
    private final OutputStream to;

    public CopyPasterImpl(InputStream from, OutputStream to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void copy() throws IOException {
        while(from.available()>0){
            to.write(from.read());
        }
        from.close();
        to.close();
    }

    public static void main(String[] args) throws IOException {
        byte [] arr = {65,66,67,68,69};

        ByteArrayInputStream bais = new ByteArrayInputStream(arr);
        OutputStream os = new FileOutputStream("copy-paster1.txt");
        CopyPasterImpl cpi = new CopyPasterImpl(bais, os );
        cpi.copy();
    }
}
