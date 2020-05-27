package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Diljeet Singh
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int value = (int) (Math.random() * 13 + 1);
            c.setValue(value);
            c.setSuit(Card.SUITS[(int) Math.random() * 3]);
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the card number between 1 -13");
        int cardNumber = input.nextInt();
        System.out.println("Enter the card suit");
        String suit = input.nextLine();
        // and search magicHand here
        //Then report the result here   
        for (int j = 0; j < magicHand.length; j++) {
            if ((magicHand[j].getValue() == cardNumber)
                    && (magicHand[j].getSuit().equals(suit))) {
                   System.out.println("Congrats! You won");
            }else{
                System.out.println("Better luck next time");
            }
        }
        
    }

}
