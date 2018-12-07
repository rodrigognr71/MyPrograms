import java.util.Scanner;

public class Player {

    private GuessTheMovie guessTheMovie;//
    private GuessTheMovie randomMovie;
    private GuessTheMovie charMovie;

    private boolean hasWon = false;
    private GuessTheMovie charGuessMovie;


    private int wrongL = 0;
    private int points = 10;


    public Player(GuessTheMovie guessTheMovie) {
        this.guessTheMovie = guessTheMovie;
        this.randomMovie = charMovie;
        this.points = points;

    }


    public void start() {
        Scanner scanner = new Scanner(System.in);

        String wrongLetters = "";
        System.out.println("Welcome to the game!");
        System.out.println("Guess the movie");

        while (guessTheMovie.getPoints() > 0) {
            //d ela funcion charMovie, conseguimos la pelicula en formato _ y verificamos si es igual a randomMovie(String)
            if (String.valueOf(charMovie).equals(randomMovie)) {
                hasWon = true;
                break;
            } else {
                System.out.println("Guess a letter:");
                String letter = scanner.nextLine();
                // System.out.println(letter);
                for (int i = 0; i < guessTheMovie.getCharMovie().length; i++) {
                    if (guessTheMovie.getCharMovie()[i] == letter.charAt(0)) {
                        //de la funcion guessTheMovie, conseguimos la posicion i de
                        //del metodo getCharMovie.
                        String a = Character.toString(guessTheMovie.getGuessMovie()[i]);
                       guessTheMovie.getGuessMovie()[i] = a.replaceAll("_", letter).charAt(0);
                    }
                }
                if (!(guessTheMovie.getRandomMovie().contains(letter))) {
                    points -= 1;
                    wrongLetters += letter + " ";
                    wrongL++;
                    System.out.println("You have guessed " + wrongL + " wrong letters: " + wrongLetters);
                }
                System.out.println("You are guessing: " + String.valueOf(guessTheMovie.getGuessMovie()));
            }
        }
        if (hasWon) {
            System.out.println("you won.");
        } else {
            System.out.println("You loose.");
        }
    }


}
