package pickacard;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 */
public class CardTrick {

    public static void main(String[] args) {

        Random rand = new Random();
        Card[] magicHand = new Card[7];
        String suitx;

        //for (int i = 0; i < magicHand.length; i++) {
        for (Card magicHand1 : magicHand) {
            Card c = new Card();
            int r;
            r = rand.nextInt(4);
            suitx = Card.SUITS[r];
            c.setSuit(suitx);
            r = rand.nextInt(13) + 1;
            c.setValue(r);
            //System.out.println(c);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }


}
