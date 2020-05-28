package pickacard;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Haider
 * date : 27 may,2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        luckyCard.setValue(4);
        luckyCard.setSuit("spade");

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)((Math.random()*13)+1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]=c;
        }

        //insert code to ask the user for Card value and suit, create their card
        Scanner sc = new Scanner (System.in);
        int b = 0;
        System.out.println("please enter the card value");
        int cardValue = Integer.parseInt(sc.nextLine());
        System.out.println("please enter the suits(Heats,Diamonds, spades, or clubs");
        String cardSuit = sc.nextline();
        for (int j = 0; j < magicHand.length; j++)
        {
            if (luckyCard.getValue()==magicHand[j].getValue())
            {
                if (luckyCard.getSuit().equalsIgnoreCase(magicHand[j].getSuit()))
                {
                    b=2;
                }
   
            }
        }
        // and search magicHand here
        if (b==2)
        {
            System.out.println("Your Card is in Mgic Hand");   
        }
        else
            System.out.println("Your Card is not in Mgic Hand");
        //Then report the result here
    }

}
