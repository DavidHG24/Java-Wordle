import java.io.FileNotFoundException;

/**
 * Tester file.
 *
 * Use this main method to test classes and methods as you create them.
 * Feel free to modify this file as you wish.
 */
public class Tester {
  public static void main(String[] args) throws FileNotFoundException {
    System.out.println(WordBank.checkInDictionary("hello"));  // true
    System.out.println(WordBank.checkInDictionary("asdfg"));  // false

    System.out.println(WordBank.getAnswerForPuzzleNumber(0)); // bused
    System.out.println(WordBank.getAnswerForPuzzleNumber(0)); // bused
    System.out.println(WordBank.getAnswerForPuzzleNumber(1)); // plumb

    // TODO add tests for Wordle Letter
    WordleLetter color = new WordleLetter('A');
    color.setColor("green");
    System.out.println(color.isColorSet());//checking if the color is set
    System.out.println(color.isGreen());//checking if the color is green
    
    // TODO add tests for Wordle Game
    WordleGame testgame = new WordleGame(2);//create a wordle game
    testgame.guess("plumb");//create different guesses
    testgame.guess("plumb");
    testgame.guess("hotly");
    System.out.println(testgame.getNumberGuessesSoFar());//check the number of guesses
    System.out.println(testgame.isGameOver());//check if the game is over
    testgame.guess("plumb");
    System.out.println();
    System.out.println(testgame.toString());//see if all my guesses are printed and with the corresponding color
    testgame.guess("plumb");
    testgame.guess("plumb");
    System.out.println(testgame.isGameOver());//checking again if the game is over
    System.out.println(testgame.getAnswer());//checking the answer of the game

    

    // TODO add tests for Main

  }
}
