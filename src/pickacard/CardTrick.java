package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 */
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        
        boolean win = false;

        for (int i = 0; i < magicHand.length; i++) {
        
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 13 + 1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) Math.random() * 4 ]);
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter Card Number: ");
        
        int crdNo = sc.nextInt();
        
        System.out.println("Enter Suit: ");
        
        String suit = sc.nextLine();
        // and search magicHand here
        for (int i = 0; i < magicHand.length; i++) {
            
            if ((magicHand[i].getValue() == crdNo) &&
                (magicHand[i].getSuit() == suit)) {
            
                win = true;
        }
        }
        
        //Then report the result here
        if (win == true){
            System.out.println("You Win!");
        }else
            System.out.println("You Lose!");
    }

}
