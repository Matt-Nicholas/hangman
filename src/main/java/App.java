import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console cnsl = System.console();
    System.out.println("Let's play a game of Hangman!");
    Game newGame = new Game();
    Game.Hangman newHangman = newGame.new Hangman();
    newGame.generateRandom();
    newHangman.chooseWord();
    newHangman.setBlanks();
    System.out.println("test");

  }
}
