public class MainGuessTheMovie {
    public static void main (String [] args){
        Reader reader = new Reader();
        GuessTheMovie guessTheMovie = new GuessTheMovie();
       // GuessTheMovie randomMovie = new GuessTheMovie();

        Player player = new Player(guessTheMovie);
        player.start();
    }
}
