package pickacard;
import java.util.*;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Manpreet Singh
 * @Date 27-05-2020
 */
public class CardTrick
{

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        Card[] magicHand = new Card[7];
        Card luckyCard= new Card();
        luckyCard.setSuit("Diamonds");
        luckyCard.setValue(9);

        for (int i = 0; i < magicHand.length; i++) 
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random()*13+1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]=c;
        }

        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter card value");
        int cardValue=Integer.parseInt(in.nextLine());
        System.out.println("Enter Suit of card(Hearts,Spades,Diamonds,Clubs)");
        String cardSuit=in.nextLine();
        // and search magicHand here
        int winLoss=0;
        for(int p=0; p < magicHand.length; p++)
        {
            if(magicHand[p].getValue()== luckyCard.getValue())
            {
                if(magicHand[p].getSuit().equalsIgnoreCase(luckyCard.getSuit()))
                {
                    winLoss=1;
                }
            }
        }
        //Then report the result here
        if(winLoss==1)
        {
            System.out.println("You win ! ");
        }
        else
        {
            System.out.println("You lost..... Sorry!!!!!");
        }
    }

}
