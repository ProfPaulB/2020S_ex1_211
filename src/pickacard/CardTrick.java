package pickacard;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Hachem Jundi
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];
        /**
         * set the loop to create the magic hand with 7 card
         */

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            Random rand = new Random();//create random object
            c.setValue(rand.nextInt(13) + 1);//set the 
            c.setSuit(Card.SUITS[rand.nextInt(3) + 1]);
            magicHand[i] = c;
        }

        /**
         * Ask the user for Card value and suit
         */
        int val;
        String suit;
        Card user = new Card();
        Scanner input = new Scanner(System.in);//creat scaner
        System.out.println("Enter the card value(1-13)");//user value entry
        val = input.nextInt();
        System.out.println("chosse the card suite(\"Hearts\"or \"Diamonds\"or \"Spades\"or\"Clubs\")");
        suit = input.next();//user suit entry
        user.setValue(val);
        user.setSuit(suit);
        /**
         * compare the entry with the magic hand element
         */
        boolean loop = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (user.getValue() == magicHand[i].getValue() && user.getSuit().equals(magicHand[i].getSuit())) {
                loop = true;
            }
        }
        /**
         * print the result
         */
        if (loop) {
            System.out.println("You Win!!!");
        } else {
            System.out.println("Sorry you lost try again");
        }
    }
}
