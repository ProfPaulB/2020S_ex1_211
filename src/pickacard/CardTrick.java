package pickacard;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Purv Patel
 * Date: 27 May 2019
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

         Random random = new Random();
        
            Scanner sc = new Scanner(System.in);
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            int value = random.nextInt(13) + 1;
            c.setValue(value);
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int suitInt = random.nextInt(4);
            c.setSuit(Card.SUITS[suitInt]);
            
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Pick a card!");
        
        System.out.println("Enter the value of your card(1-13) :");
        int value = sc.nextInt();
        
        System.out.println("Enter the suit of your card\n1 - Hearts"
                + "\n2 - Diamonds\n3 - Spades\n4 - Clubs");
        int suitInt = sc.nextInt();
        
        //merge the lucky card code
        //add  lucky card
        Card luckyNumber = new Card();
        luckyNumber.setValue(4);
        luckyNumber.setSuit("Diamonds");
        
        // and search magicHand here
        Card c = new Card();
        c.setValue(value);
        c.setValue(Integer.parseInt(Card.SUITS[suitInt - 1]));
        
        boolean found = false;
        for(Card magicCard : magicHand){
            
            if(magicCard.getValue() == c.getValue() && magicCard.getSuit().equals(c.getSuit())){
                found = true;
                break;
                
            }
                        else if(luckyNumber.getValue() == c.getValue() && luckyNumber.getSuit().equals(c.getSuit())){
                found = true;
                break;
                
                        }
        }
        
        
        //Then report the result here
        if(found){
            System.out.println("Congrats! You got a match");
        }
        else{
            System.out.println("Your card didnt match! Better luck next time");
        }
        
    
        
    }

}
