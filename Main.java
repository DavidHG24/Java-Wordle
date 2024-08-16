import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    
    // Do not modify the method signature.
    public static WordleGame startGame(Scanner scanner) throws FileNotFoundException {
        System.out.println("Select a game between 0 and 2135: ");
        int numberGuess = scanner.nextInt();
        if(numberGuess >= 0 && numberGuess <= 2315){
            WordleGame game = new WordleGame(numberGuess);
            return game;
        }
        return null;  // TODO - implement and replace me
    }

    // Do not modify the method signature.
    public static void playGame(Scanner scanner, WordleGame game) throws FileNotFoundException {
        // TODO - implement
        while(!game.isGameOver()){
            System.out.println("Enter a word of 5 letters: ");
            String latestGuess = scanner.next();
            while(!WordBank.checkInDictionary(latestGuess)){
                System.out.println();
                System.out.println("Invalid guess!!! ");
                System.out.println("Enter a valid word: ");
                latestGuess = scanner.next();
            }
            game.guess(latestGuess);
            System.out.println(game.toString());
        }
    }

    // Do not modify the method signature.
    public static void reportGameOutcome(WordleGame game) {
        // TODO - implement
        if(game.isGameWin()){
            System.out.println("You Win :D");
        }else{
            System.out.println("The correct answer was " + game.getAnswer());
        }
    }

    // This main method body should not be modified.
    public static void main(String[] args) throws FileNotFoundException {
        // Only use this Scanner for user input, do not create new ones via `new Scanner(System.in)`.
        Scanner scanner = new Scanner(System.in);
        WordleGame game = startGame(scanner);
    
        playGame(scanner, game);
        reportGameOutcome(game);
    }
}
