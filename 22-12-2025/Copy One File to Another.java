import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("a.txt");
        FileOutputStream out = new FileOutputStream("b.txt");

        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }

        in.close();
        out.close();
        System.out.println("File Copied Successfully");
    }
}
