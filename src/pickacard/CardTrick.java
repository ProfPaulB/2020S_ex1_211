package pickacard;

import java.util.Random;
import java.util.Scanner;
import static pickacard.Card.SUITS;

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

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            Random rand = new Random();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(3) + 1]);
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        int val;
        String suit;
        Card user=new Card();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the card value(1-13)");
        val = input.nextInt();
        System.out.println("chosse the card suite(\"Hearts\"or \"Diamonds\"or \"Spades\"or\"Clubs\")");
        suit = input.next();
        user.setValue(val);
        user.setSuit(suit);
        boolean loop;
       for (int i = 0; i < magicHand.length; i++)
            if (user.getValue()==magicHand[i].getValue()&&user.getSuit().equals(magicHand[i].getSuit()))
                sout
            {}
                }

    }

}
