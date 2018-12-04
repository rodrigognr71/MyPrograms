import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

    public static ArrayList<String> readerMovies() {
        Scanner scanner = new Scanner(System.in);
        File file = new File("Movies.txt");
        ArrayList<String> list = new ArrayList<>();
        boolean hasWon = false;
        BufferedReader file2 = null;
        String lines;
        try {
            FileReader fileReader = new FileReader(file);
            file2 = new BufferedReader(fileReader);
        } catch (Exception e) {
            System.out.println("No se encontro el archivo " + file.getName());
        }

        try {
            while ((lines = file2.readLine()) != null) {
                // System.out.println(lines);
                list.add(lines);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
