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
            c.setValue(rand.nextInt(13) + 1);//set the random number for value
            c.setSuit(Card.SUITS[rand.nextInt(3) + 1]);//set the random number for suit
            magicHand[i] = c;
        }
        /**
        *(hard-coded) Card Object called luckyCard
        */
        Card luckyCard=new Card();
        luckyCard.setSuit("Diamonds");
        luckyCard.setValue(10);
        
        /**
         * compare the entry with the magic hand element
         */
        boolean loop = false;
        for (Card magichand : magicHand) {
            if (user.getValue() == magichand.getValue() && user.getSuit().equals(magichand.getSuit())) {
                loop = true;
                break;
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
