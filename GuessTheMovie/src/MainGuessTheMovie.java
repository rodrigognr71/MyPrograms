public class MainGuessTheMovie {
    public static void main (String [] args){
        GuessTheMovie guessTheMovie = new GuessTheMovie();
        Player player = new Player(guessTheMovie);
        player.start();
    }
}
