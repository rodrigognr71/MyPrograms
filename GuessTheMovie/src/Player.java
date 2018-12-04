public class Player {
    private GuessTheMovie guessTheMovie;//

    public Player(GuessTheMovie guessTheMovie) {
        this.guessTheMovie = guessTheMovie;
    }

    public void start() {
        System.out.println("Welcome to the game!");
        System.out.println("Guess the movie");

        while(guessTheMovie.getPoints() > 0) {
            if (String.valueOf(guessTheMovie.getGuessMovie()).equals(get.randomMovie)){
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
                    points--;
                    wrongLetters += letter + " ";
                    wrongL ++;
                    System.out.println("You have guessed " + wrongL +" wrong letters: " + wrongLetters);
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
}
