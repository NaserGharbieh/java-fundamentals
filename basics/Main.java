import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    System.out.println( "Pluralize " );  
    int dogCount = -1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + "."); 

   System.out.println( "flipNHeads question " );  
    int n = 3;
    flipNHeads(n); 
    System.out.println( "Command Line Clock " );  

    clock();

  }

  public static String pluralize(String word, int num) {
    String pluralizedString = "";
    if (num >= 0 && num != 1) {
      pluralizedString = word + "s";
    } else if (num == 1) {
      pluralizedString = word;
    } else {
      pluralizedString = "enter a valid number starting from 0 not : " + num;
    }

    return pluralizedString;
  }

  public static void flipNHeads(int n) {
    int flips = 0;
    int consecutiveHeads = 0;
    Random random = new Random();

    while (consecutiveHeads < n) {
      double coinFlip = random.nextDouble();
      if (coinFlip >= 0.5) {
        System.out.println("Heads");
        consecutiveHeads++;
      } else {
        System.out.println("Tails");
        consecutiveHeads = 0;
      }
      flips++;
    }

    System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
  } 

  public static void clock() {
    try {
        while (true) {
            LocalDateTime currentTime = LocalDateTime.now();
            String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(formattedTime);
            Thread.sleep(1000);
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

}