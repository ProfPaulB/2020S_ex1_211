package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author (Andrew) Yin Tung Ng     (modified May 26 2020)
 */
public class CardTrick {

    public static void main(String[] args) {

        // number of cards as a variable makes the code flexible
        int numOfCards = 7;
        Card[] magicHand = new Card[numOfCards];

        // randomly create Card objects to fill in array of cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            // random ints fall within required Card attribute ranges
            int randomInt_1to13 = 1 + (int) (Math.random() * 13);
            int randomInt_0to3 = (int) (Math.random() * 4);

            c.setValue(randomInt_1to13);
            c.setSuit(Card.SUITS[randomInt_0to3]);

            magicHand[i] = c;
        }

        // For Testing: printing out magicHand array
        System.out.println("Hand of cards is assigned");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
        
        

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
