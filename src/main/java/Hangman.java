import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class Game {
  private String[] mAnswer = {"epicodus", "jazzy", "tyrannosaurus", "mango", "sandwich", "java"};
  public List<Character> mLettersUsed = new ArrayList<Character>();
  public boolean mGameStatus = true;

  public int generateRandom(){
    Random randomGenerator = new Random();
    int x = randomGenerator.nextInt(mAnswer.length);
    return x;
  }

  public List<Character> getLettersUsed() {
    return mLettersUsed;
  }

  public void setLettersUsed(char letter){
    mLettersUsed.add(letter);
  }

  public class Hangman {
    private int mNumberOfGuesses = 0;
    private String mWord;
    private char[] mWordArray;
    public List<Character> mBlanks = new ArrayList<Character>();

    public char[] getmWordArray(){
      return mWordArray;
    }
    public List<Character> getmBlanksArray(){
      return mBlanks;
    }
    public int getmGuesses(){
      return mNumberOfGuesses;
    }

    public String chooseWord(){
      mWord = mAnswer[generateRandom()];
      mWordArray = mWord.toCharArray();
      return mWord;
    }

    public void setBlanks(){
      for (int i = 0; i < mWordArray.length ; ++i ) {
        mBlanks.add('_');
      }
    }

    public void checkForLetter(char letter){
      int counter = 0;
      for (int i = 0; i < mWordArray.length ; ++i ) {
        if (letter == mWordArray[i]){
          mBlanks.set(i, letter);
          counter ++;
        }
      }
      if(counter == 0){mNumberOfGuesses += 1;}
    }

    public boolean compareWordArrays(){
      return mBlanks.contains('_');
    }

  }
}
