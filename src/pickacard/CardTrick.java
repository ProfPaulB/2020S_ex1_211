package pickacard;

import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Bryan Acorda 05-26-2020
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];
        
        for (int i = 0; i < magicHand.length; i++) {
            Random rnd = new Random();
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue(rnd.nextInt(13));
            c.setSuit(c.SUITS[rnd.nextInt(4)]);
            magicHand[i] = c;
        }
        
        System.out.println();
        
//        For debugging purposes only
        for (Card card : magicHand) {
            System.out.println(card.getSuit() + " " + card.getValue());
        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        //Step 4. of the assignment
//         Scanner input = new Scanner(System.in);
//         System.out.println("\nWhat is your suit?");
//         String suit = input.nextLine();
//         System.out.println("What is your Card Value?");
//         int value = input.nextInt();
//         System.out.println();
        
        // Step 6. of the assignment
        Card luckyHand = new Card();
        String suit = "Hearts";
        int value = 5;
        luckyHand.setSuit(suit);
        luckyHand.setValue(value);
        
        System.out.println("");
        
        // Validating results here 
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getSuit().equals(suit) && 
                    magicHand[i].getValue() == value) {
                System.out.println("Congrats! your card is in hand");
            }
            else {
                System.out.println("No such card in hand!");
            }
        }
        
    }

}
