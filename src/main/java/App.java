import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter a year, we'll tell you if it's a leap year:")
    String stringYear = myConsole.readLine();
    int intYear = Integer.parseInt(stringYear);
  }
}
