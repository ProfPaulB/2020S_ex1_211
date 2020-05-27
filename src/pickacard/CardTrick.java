package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Ashley Sun
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
        //check magicHand - comment out
        String format = "Card Value:%d++Card Suit:%s%n";
        for (Card c : magicHand) {
            System.out.printf(format, c.getValue(), c.getSuit());
        }

        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        Card userCard = new Card();

        //show which # to enter for each suit
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.printf("Enter %d for %s%n", i, Card.SUITS[i]);
        }

        //ask for suit and value
        System.out.println("Enter card suit - :");
        int userSuit = input.nextInt();
        System.out.println("Enter card value - Ace=1, King=13:");
        int userValue = input.nextInt();

        //make card for user
        userCard.setSuit(Card.SUITS[userSuit]);
        userCard.setValue(userValue);

        //check user card - comment out 
        System.out.printf("%d%s", userCard.getValue(), userCard.getSuit());

        // and search magicHand here
        /*
        compare value and suit
        break loop when it matches
        change to true when matches
         */
        //comment out later
        int cardValue = magicHand[0].getValue();
        String cardSuit = magicHand[0].getSuit();
        System.out.println(cardValue);
        System.out.println(cardSuit);
        
        //boolean sameSuit;
        boolean sameValue;
        for(int i = 0; i < magicHand.length; i++){
            sameValue = magicHand[i].getValue() == userCard.getValue();
            
            //Search for first instance of identical value in magicHand
            if(sameValue){
                System.out.printf("Is this your card?%n%d of %s"
                        , magicHand[i].getValue(), magicHand[i].getSuit());
                //check if magicHand card has the same suit as userCard
                break;
            }
        }

        //Then report the result here
        
    }

}
