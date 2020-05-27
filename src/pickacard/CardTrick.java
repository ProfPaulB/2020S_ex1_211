package pickacard;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Arshdeep May 27
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) ((Math.random()*13)+1));//c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);//c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }

        Scanner sc = new Scanner(System.in);
        int b = 0;
        System.out.println("Please enter the card value(1-13)");//insert code to ask the user for Card value and suit, create their card
        int cardValue = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter the suit(Hearts, diamonds, spades or clubs)");
        String cardSuit = sc.nextLine();
        int cValue;
        String cSuit;
        for (Card magicHand1 : magicHand) // and search magicHand here
        {
            Card c = new Card();
            cValue = c.getValue();
            cSuit = c.getSuit();
            if (cardValue == cValue) {
                if(cardSuit.equalsIgnoreCase(cSuit))
                {
                    b = 1;
                } 
            }
            
        }
        if(b == 1)
            System.out.println("Your card is in the magic hand");
        else
            System.out.println("Your card is not in the magic hand");//Then report the result here
    }

}
