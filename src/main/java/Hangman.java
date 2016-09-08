import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class Game {
  private String[] mAnswer = {"testing"};
  //{"epicodus", "jazzy", "tyrannosaurus", "mango", "sandwich", "java"};
  private List<Character> mLettersUsed = new ArrayList<Character>();

  public int generateRandom(){
    Random randomGenerator = new Random();
    int x = randomGenerator.nextInt(mAnswer.length);
    return x;
  }

  public class Hangman {
    private String mWord;
    private char[] mWordArray;
    private List<Character> mBlanks = new ArrayList<Character>();

    public char[] getmWordArray(){
      return mWordArray;
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

    public List<Character> checkForLetter(char letter){
      for (int i = 0; i < mWordArray.length ; ++i ) {
        if (letter == mWordArray[i]){
          mBlanks.set(i, letter);
        }
      }
      return mBlanks;
    }


  }
}
