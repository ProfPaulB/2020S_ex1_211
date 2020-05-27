package pickacard;

import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Amirmahdi Ghasemi, May 2020
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue((int)(Math.random()*14));
            c.setSuit(c.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = c;
            }
            //insert code to ask the user for Card value and suit, create their card
            // and search magicHand here
            //Then report the result here
        
            /*
            Scanner input = new Scanner(System.in);
            System.out.println("Write your Suit card!?");
            String cardSuit = input.nextLine();
            System.out.println("Write your Card Value!?");
            int cardvalue = input.nextInt();
            */

        }
            
    
        Card luckyHand = new Card();
        String cardSuit = "Clubs";
        int cardValue = 10;
        luckyHand.setValue(cardValue);
        luckyHand.setSuit(cardSuit);
       
       
        for (int j=0; j<magicHand.length;j++) {
            
            if( (magicHand[j].getValue() == luckyHand.getValue()) && (magicHand[j].getSuit().equals(luckyHand.getSuit()))) {
                
                System.out.println("You are so lucky, you won!!");
            }
            else {
                System.out.println("so bad ..., you lost!!");
            }
        
    }
}


