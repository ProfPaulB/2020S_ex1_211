package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Ashley Sun May 5, 2020
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            //c.setValue(insert call to random number generator here)
            double random = 1 + Math.random() * 13;
            c.setValue((int) (random));

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) (Math.random() * 3)]);
            magicHand[i] = c;
        }
        /*check magicHand - comment out
        String format = "Card Value:%d++Card Suit:%s%n";
        for (Card c : magicHand) {
            System.out.printf(format, c.getValue(), c.getSuit());
        }
        */
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        Card userCard = new Card();

        //show which # to enter for each suit
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.printf("Enter %d for %s%n", i, Card.SUITS[i]);
        }

        //ask for suit and value
        System.out.println("Enter card suit:");
        int userSuit = input.nextInt();
        System.out.println("Enter card value - Ace=1, King=13:");
        int userValue = input.nextInt();

        //make card for user
        userCard.setSuit(Card.SUITS[userSuit]);
        userCard.setValue(userValue);

        /*check user card - comment out 
        System.out.printf("Your card is %d%s", userCard.getValue(),
                 userCard.getSuit());
        
        //can get value and suit of each card in the magic hand - comment out
        System.out.print("\nTesting something for searching magicHand; "
                + "The first card is magicHand is: ");
        int cardValue = magicHand[0].getValue();
        String cardSuit = magicHand[0].getSuit();
        System.out.println(cardValue + cardSuit);
        */
        
        //search through magic hand here
        //compare user's card to a card in magic hand
        boolean sameValue;//card value is the same
        boolean sameSuit;//card suit is the same

        //found matched card in the magic hand
        boolean isMatched = false;

        //compare each card in the magic hand to the user's card
        for (int i = 0; i < magicHand.length; i++) {
            sameValue = magicHand[i].getValue() == userCard.getValue();
            sameSuit = magicHand[i].getSuit() == userCard.getSuit();

            //check if the card has the same value and suit as the user's card
            if (sameValue && sameSuit) {
                //matched card found in magic hand
                isMatched = true;
            }
        }
        //Then report the result here
        if (isMatched) {
            System.out.println("Your card was in the Magic Hand!");
        } else {
            System.out.println("Your card wasn't in the Magic Hand.");
        }
    }
}
