package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Joanne Cecco May 26,2020
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);
        boolean isWinner = false;

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
            // Printing to test code to ensure random function working as needed
            System.out.println(c.getValue());
            System.out.println(c.getSuit());
             
        }

        //insert code to ask the user for Card value and suit, create their card
        Card playerCard = new Card();
        System.out.println("Enter a card value between 1 and 13. (Ace = 1, "
                + "Jack = 11, Queen = 12, King = 13): ");
        playerCard.setValue(input.nextInt());
        System.out.println("Enter a card suit (Hearts, Diamonds, Clubs, Spades): ");
        playerCard.setSuit(input.next());

        // and search magicHand here
        for (int i = 0; i < magicHand.length; i++) {
            if (playerCard.getValue() == magicHand[i].getValue()) {
                //searching the second value only if there is a match in the first
                if (playerCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit())) {
                    isWinner = true;
                }
            }
        }
        /* testing magicHand array
        System.out.println(magicHand[0].getValue() + " " + magicHand[0].getSuit());
        */
        
        //Then report the result here
        String format = (isWinner) ? "You win!" : "Sorry, better luck next time";
        System.out.println(format);
    }
}
