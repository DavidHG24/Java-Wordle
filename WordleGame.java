import java.io.FileNotFoundException;

public class WordleGame {
  // TODO - implement according to spec
  private WordleLetter[][] wordleLetterArray = new WordleLetter[6][5];
  private String answer;
  private int guessNumber;
 

  public WordleGame(int puzzleNumber) throws FileNotFoundException{
    this.answer = WordBank.getAnswerForPuzzleNumber(puzzleNumber);
    this.guessNumber = 0;

  }

  public String getAnswer(){
    return this.answer;
  } 
  
  public void guess(String guessword){
    for(int i = 0; i < guessword.length(); i++){
      WordleLetter currentLetter = new WordleLetter(guessword.charAt(i));
    
      if((guessword.charAt(i)) == getAnswer().charAt(i)){
        currentLetter.setColor("green");        
      }else if(getAnswer().contains(String.valueOf(guessword.charAt(i)))){
        currentLetter.setColor("yellow");
      }else{
        currentLetter.setColor("red");
      }
      wordleLetterArray[guessNumber][i] = currentLetter;
    }
    guessNumber++;
  }

  public int getNumberGuessesSoFar(){
    return this.guessNumber;
  }

  public WordleLetter[] getGuess(int guessNumberIn){
    WordleLetter[] guessArray = new WordleLetter[5];
    for(int i = 0; i < guessArray.length; i++){
      guessArray[i] = wordleLetterArray[guessNumberIn][i];
    }
    return guessArray;
  }

  public boolean isGameOver(){
    if(isGameWin() || (getNumberGuessesSoFar() == 6)){
      return true;
    }
    return false;
  }

  public boolean isGameWin(){
    if(getNumberGuessesSoFar() == 0){
      return false;
    }
    String guess = arrayString(getGuess(getNumberGuessesSoFar() - 1));
    if (guess.equals(getAnswer())){
      return true;    
    }
    return false;
  }

  public String arrayString(WordleLetter[] arr){
    String guess = "";
    for(int i = 0; i < arr.length; i++){
      guess += arr[i].getLetter();
    }
    return guess;
  }

  // TODO - include the remainder of the below code back in once rest of class is implemented.
  // Do not modify this method implementation.
  public String toString() {
    // result will be used to build the full answer String
    String result = "";
     // for each word guessed so far
     for (int i = 0; i < getNumberGuessesSoFar(); i++) {
      // get each letter of each word
      for (int j = 0; j < 5; j++) {
        // concatenate it to the result
        // WordleLetter's toString() is automatically invoked here.
        result += getGuess(i)[j];
      }
      // new line separator between each word
      result += "\n";
    }
    return result;
  }
}
