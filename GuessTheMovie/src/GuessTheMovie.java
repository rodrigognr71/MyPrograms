import java.util.List;

public class GuessTheMovie {

    private int points;
    private int wrongLetterCount;
    private String wrongLetters;

    private char[] charMovie;
    private char[] charGuessMovie;
    private List list;


    //Constructor
    public GuessTheMovie() {
        int X = list.size();
        int Y = 0;
        int number =(int) (Math.random() * ((X - Y) + 1) + Y);
        this.points = 10;
        this.wrongLetterCount = 0;
        this.wrongLetters = "";
        this.charMovie = Reader.readerMovies().get(number).toCharArray();
        this.charGuessMovie = guessMovie();
    }

    private char[] guessMovie() {
        String randomMovie = charMovie.toString();
        String guessMovie = randomMovie.replaceAll("[a-zA-Z0-9',-@&]", "_");
        System.out.println(guessMovie);
        return guessMovie.toCharArray();
    }

    public int getPoints() {
        return points;
    }

    public char[] getGuessMovie() {
        return guessMovie();
    }
}
