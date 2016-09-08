import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class HangmanTest{

  @Test
  public void generateRandom_createsRandomNumber_int(){
    Game testGame = new Game();
    int expectedOutput = 0;
    assertEquals(expectedOutput, testGame.generateRandom());
  }

  @Test
  public void chooseWord_selectsRandomWord_String(){
    Game testGame = new Game();
    Game.Hangman testHangman = testGame.new Hangman();
    String expectedOutput = "testing";
    assertEquals(expectedOutput, testHangman.chooseWord());
  }

  @Test
  public void checkForLetter_returnsTrueIfWordContainsChar_Array(){
    Game testGame = new Game();
    Game.Hangman testHangman = testGame.new Hangman();
    List<Character> expectedOutput = new ArrayList<Character>();
    expectedOutput.add('t');
    expectedOutput.add('_');
    expectedOutput.add('_');
    expectedOutput.add('t');
    expectedOutput.add('_');
    expectedOutput.add('_');
    expectedOutput.add('_');
    testGame.generateRandom();
    testHangman.chooseWord();
    testHangman.setBlanks();
    assertEquals(expectedOutput, testHangman.checkForLetter('t'));
  }

  @Test
  public void getmWordArray_returnsMWordArray_Array(){
    Game testGame = new Game();
    Game.Hangman testHangman = testGame.new Hangman();
    char[] expectedOutput = {'t', 'e', 's', 't', 'i', 'n', 'g'};
    assertEquals(expectedOutput, testHangman.getmWordArray());

  }
}
