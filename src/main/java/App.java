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

    while(newGame.mGameStatus){
      printHangman(newHangman.getmGuesses());
      System.out.println(newHangman.getmBlanksArray());
      System.out.println("Letters you guessed:" + newGame.getLettersUsed());
      System.out.println("Enter your guess!");
      String userAnswer = cnsl.readLine();
      char userCharacter = userAnswer.charAt(0);
      newGame.setLettersUsed(userCharacter);
      newHangman.checkForLetter(userCharacter);
      if (!newHangman.compareWordArrays() || newHangman.getmGuesses() >= 6){
        printHangman(newHangman.getmGuesses());
        newGame.mGameStatus = false;
      }
    }

  }
  public static void printHangman(int number){
    if (number == 0){
      printBoard();
    }
    else if (number == 1){
      printOneWrong();
    }
    else if (number == 2){
      printTwoWrong();
    }
    else if (number == 3){
      printThreeWrong();
    }
    else if (number == 4){
      printFourWrong();
    }
    else if (number == 5){
      printFiveWrong();
    }
    else if (number == 6){
      printSixWrong();

    }
  }
  public static void printBoard(){
    System.out.println("   _______");
    System.out.println("          |");
    System.out.println("          |");
    System.out.println("          |");
    System.out.println("          |");
    System.out.println("          |");
    System.out.println("          |");
    System.out.println("          |");
    System.out.println("          |");
    System.out.println("          |");
    System.out.println("          |");
    System.out.println("          |");
    System.out.println("          |");
  }
  public static void printOneWrong(){
    System.out.println("   _______");
    System.out.println("    |     |");
    System.out.println("    _     |");
    System.out.println("  /   \\   |");
    System.out.println(" { o o }  |");
    System.out.println("  \\ _ /   |");
    System.out.println("          |");
    System.out.println("          |");
    System.out.println("          |");
    System.out.println("          |");
    System.out.println("          |");
    System.out.println("          |");
    System.out.println("          |");
  }
  public static void printTwoWrong(){
    System.out.println("   _______");
    System.out.println("    |     |");
    System.out.println("    _     |");
    System.out.println("  /   \\   |");
    System.out.println(" { o o }  |");
    System.out.println("  \\ _ /   |");
    System.out.println("    |     |");
    System.out.println("    |     |");
    System.out.println("    |     |");
    System.out.println("    |     |");
    System.out.println("          |");
    System.out.println("          |");
    System.out.println("          |");

  }
  public static void printThreeWrong(){
    System.out.println("   _______");
    System.out.println("    |     |");
    System.out.println("    _     |");
    System.out.println("  /   \\   |");
    System.out.println(" { o o }  |");
    System.out.println("  \\ _ /   |");
    System.out.println("   /|     |");
    System.out.println("  / |     |");
    System.out.println(" m  |     |");
    System.out.println("    |     |");
    System.out.println("          |");
    System.out.println("          |");
    System.out.println("          |");

  }
  public static void printFourWrong(){
    System.out.println("   _______");
    System.out.println("    |     |");
    System.out.println("    _     |");
    System.out.println("  /   \\   |");
    System.out.println(" { o o }  |");
    System.out.println("  \\ _ /   |");
    System.out.println("   /|\\    |");
    System.out.println("  / | \\   |");
    System.out.println(" m  |  m  |");
    System.out.println("    |     |");
    System.out.println("          |");
    System.out.println("          |");
    System.out.println("          |");

  }
  public static void printFiveWrong(){
    System.out.println("   _______");
    System.out.println("    |     |");
    System.out.println("    _     |");
    System.out.println("  /   \\   |");
    System.out.println(" { o o }  |");
    System.out.println("  \\ _ /   |");
    System.out.println("   /|\\    |");
    System.out.println("  / | \\   |");
    System.out.println(" m  |  m  |");
    System.out.println("    |     |");
    System.out.println("   /      |");
    System.out.println(" _/       |");
    System.out.println("          |");

  }
  public static void printSixWrong(){
    System.out.println("   _______");
    System.out.println("    |     |");
    System.out.println("    _     |");
    System.out.println("  /   \\   |");
    System.out.println(" { x x }  |");
    System.out.println("  \\ _ /   |");
    System.out.println("   /|\\    |");
    System.out.println("  / | \\   |");
    System.out.println(" m  |  m  |");
    System.out.println("    |     |");
    System.out.println("   / \\    |");
    System.out.println(" _/   \\_  |");
    System.out.println("          |");

  }
}
