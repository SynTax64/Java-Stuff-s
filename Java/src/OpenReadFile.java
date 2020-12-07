import java.io.*;
import java.nio.file.Path;

public class OpenReadFile {
    public static void main(String[] args) {

        String path = "C:/tmp.txt";
        StringBuilder content = new StringBuilder();
        try {
            int lines = 0;
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while (reader.read() != -1) {
                content.append(reader.readLine());
                lines++;
            }
            System.out.println();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
