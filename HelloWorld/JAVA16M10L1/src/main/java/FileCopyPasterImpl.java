import java.io.*;

public class FileCopyPasterImpl implements CopyPaster{

    private final CopyPasterImpl copyPaster;

    public FileCopyPasterImpl(FileInputStream fis, FileOutputStream fos) {
        this.copyPaster = new CopyPasterImpl(fis, fos);
    }

    @Override
    public void copy() throws IOException {
        copyPaster.copy();
    }

    public static void main(String[] args) throws IOException {
        new FileCopyPasterImpl(new FileInputStream("dir2/A.txt"),
        new FileOutputStream("dir2/A-to.txt")).copy();
    }
}
