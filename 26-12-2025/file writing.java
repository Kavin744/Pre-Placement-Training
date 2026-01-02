import java.io.FileWriter;
class FileWrite {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("data.txt");
        fw.write("Java File Handling");
        fw.close();
    }
}
