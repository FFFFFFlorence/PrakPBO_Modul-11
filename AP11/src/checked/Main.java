package checked;
import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        try {
            FileReader file = new FileReader("src/data.txt");
            BufferedReader reader = new BufferedReader(file);
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}