package pickacard;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Tibabalase Oludemi
 * Date: 27-05-2020
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         c.setValue(ThreadLocalRandom.current().nextInt(1, 14));
         c.setSuit(Card.SUITS[ThreadLocalRandom.current().nextInt(0, 4)]);
         magicHand[i] = c;
      }
      System.out.println(Arrays.toString(magicHand));
      //insert code to ask the user for Card value and suit, create their card
//       Scanner input = new Scanner(System.in);
//       System.out.print("Pick a suit (\"Hearts\", \"Diamonds\", \"Spades\", \"Clubs\"): ");
//       String inputSuit = input.nextLine();
//       inputSuit = inputSuit.trim();
//       System.out.printf("Pick a number for your %s suit (between 1 to 13): ", inputSuit);
//       int inputSuitNum = input.nextInt();
      Card luckyCard = new Card();
      luckyCard.setValue(3);
      luckyCard.setSuit("Hearts");
      // and search magicHand here
      boolean userMatch = false;
      for (int i = 0; i < 7; i++) {
         if (magicHand[i].equals(luckyCard)) {
            userMatch = true;
            break;
         }
      }
      //Then report the result here
      if (userMatch) {
         System.out.printf("Your %s suit with number %s is a match! You win!\n", "Hearts", 3);
      }
   }

}
