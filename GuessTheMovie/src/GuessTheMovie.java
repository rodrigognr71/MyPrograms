import java.util.ArrayList;

public class GuessTheMovie {

    private ArrayList<String> list;
    private int points;
    private int wrongLetterCount;
    private String wrongLetters;
    private char[] charMovie;
    private char[] charGuessMovie;

    private String randomMovie;


    //Constructor
    public GuessTheMovie() {
        int X = Reader.getList().size();//de la clase Reader conseguimos el tamano de la lista por medio del metodo get.
        int Y = 0;
        int number =(int) (Math.random() * ((X - Y) + 1) + Y);
        this.points = 10;
        this.wrongLetterCount = 0;
        this.wrongLetters = "";
        this.charMovie = Reader.readerMovies().get(number).toCharArray();
        this.charGuessMovie = guessMovie();
    }

    public char[] charMovie() {
        return charMovie;
    }

    public String randomMovie() {
        randomMovie = String.valueOf(charMovie);
        return randomMovie;
    }


    private char[] guessMovie() {
       // randomMovie = charMovie.toString();
        String guessMovie = randomMovie().replaceAll("[a-zA-Z0-9',-@&]", "_");
        System.out.println(guessMovie);
        return guessMovie.toCharArray();
    }

    public int getPoints() {// devuelve los puntos
        return points;
    }

    public char[] getGuessMovie() { //devuelve la pelicula q se eligio en ----
        return guessMovie();
    }

    public String getRandomMovie() {// devuelve la pelicula elegida en String
        return randomMovie();
    }

    public char[] getCharMovie() {//devuelve la pelicula en arreglo de caracteres.
        return charMovie();
    }

    public void setCharMovie(char[] charMovie) {
        this.charMovie = charMovie;
    }

    public GuessTheMovie getPoints(GuessTheMovie points) {
        return points;
    }

}
