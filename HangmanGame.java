
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    private static final String[] WORDS = {"java", "programming", "hangman", "computer", "algorithm", "developer"};
    private String targetWord;
    private StringBuilder guessedWord;
    private List<Character> guessedLetters;
    private int incorrectGuesses;

    public HangmanGame() {
        
        targetWord = WORDS[new Random().nextInt(WORDS.length)].toLowerCase();
        guessedWord = new StringBuilder("_".repeat(targetWord.length()));
        guessedLetters = new ArrayList<>();
        incorrectGuesses = 0;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (incorrectGuesses < 6) {
            displayGameState();

            
            System.out.print("Enter a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            
            if (targetWord.contains(String.valueOf(guess))) {
                updateGuessedWord(guess);
            } else {
                incorrectGuesses++;
                System.out.println("Incorrect guess! Try again.");
            }

            
            if (guessedWord.toString().equals(targetWord)) {
                displayGameState();
                System.out.println("Congratulations! You guessed the word: " + targetWord);
                break;
            }
        }

        if (incorrectGuesses == 6) {
            System.out.println("Sorry, you ran out of guesses. The correct word was: " + targetWord);
        }

        scanner.close();
    }

    private void updateGuessedWord(char guess) {
        for (int i = 0; i < targetWord.length(); i++) {
            if (targetWord.charAt(i) == guess) {
                guessedWord.setCharAt(i, guess);
            }
        }

        guessedLetters.add(guess);
    }

    private void displayGameState() {
        System.out.println("Currently, times you guessed wrongly: " + incorrectGuesses);
        System.out.println("The guessing word is: " + guessedWord);
        System.out.println("You already guessed the letters: " + guessedLetters);
    }

    public static void main(String[] args) {
        HangmanGame hangmanGame = new HangmanGame();
        hangmanGame.playGame();
    }
}
