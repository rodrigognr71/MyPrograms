import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GuessTheMovie {

    public void Jugar(){
        Scanner scanner = new Scanner(System.in);
        File file = new File("Movies.txt");
        ArrayList<String> list = new ArrayList<String>();
        boolean hasWon = false;
        BufferedReader file2 = null;
        String lines = "";

        //reading the file.
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

        System.out.println("Welcome to the game!");
        System.out.println("Choose the movie");
        //Choose randomly the movie from the ArrayList "List".
        int X = list.size();
        int Y = 0;
        int numero = (int) (Math.random() * ((X - Y) + 1) + Y);
        int cont = 0;

        Object[] pelicula = list.toArray();
        String randomMovie = pelicula[numero].toString();
        String guessMovie = randomMovie.replaceAll("[a-z0-9',-@&]", "_");
        System.out.println(pelicula[numero]);
        System.out.println(guessMovie);

        //Changing to Char Arrays.
        char[] charMovie = randomMovie.toCharArray();
        char[] charGuessMovie = guessMovie.toCharArray();

        //Choosing the movie.
        for (int j = 10; j > 0; j--) {
            if (String.valueOf(charGuessMovie).equals(randomMovie)){
                hasWon = true;
                break;
            } else {
                System.out.println("Guess a letter:");
                String letter = scanner.nextLine();
                // System.out.println(letter);
                for (int i = 0; i < charMovie.length; i++) {
                    if (charMovie[i] == letter.charAt(0)) {
                        String a = Character.toString(charGuessMovie[i]);
                        charGuessMovie[i] = a.replaceAll("_", letter).charAt(0);
                    }
                }
                if (!(randomMovie.contains(letter))){
                    cont++;
                    System.out.println("You have guessed " + cont +" wrong letters");
                }
                System.out.println("You are guessing: " + String.valueOf(charGuessMovie));
            }
        }
        if(hasWon){
            System.out.println("you won.");
        } else {
            System.out.println("You loose.");
        }
    }

    public static void main(String[] args) throws Exception {
        GuessTheMovie juego = new GuessTheMovie(); //crear el objeto de la clase
        juego.Jugar(); //llamamos al metodo jugar.
    }
}