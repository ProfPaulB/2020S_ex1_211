package pickacard;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Kamil Trela
 * 
 * Updated: May 26 2020.
 */
public class CardTrick {

    public static void main(String[] args) {
        // Create new Card array
        Card[] magicHand = new Card[7];
        
        // Create new Random object
        Random generator = new Random();
        
        // Create new Scanner object
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < magicHand.length; i++) {
            
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            c.setValue(generator.nextInt(13)+1);
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[generator.nextInt(3)]);
            
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        // Create a new card to store users card choice
        Card userCard = new Card();

        // Ask user for their card value choice & set it to userCard
        System.out.println("Enter your Card value, from 1 to 13 as an integer. "
        + "Ace = 1, Jack = 11, Queen = 12, King = 13");
        userCard.setValue(sc.nextInt());
        
        // Ask user for their suit choice & set it to userCard
        System.out.println("Enter your suit choice as an integer from 0-3 "
        + "Where 0 = hearts, 1 = diamonds, 2 = spades, 3 = clubs");
        userCard.setSuit(Card.SUITS[sc.nextInt()]);
        
        // Create a boolean to set if the users card matches one of the magicHand cards 
        boolean winnerWinner = false;
        
        // This loop iterates over our magicHand array and checks whether the users
        // card has the same value and suit, if it does winnerWinner changes to true.
        for (int i = 0; i < magicHand.length; i++){
            if(userCard.equals(magicHand[i])){
                winnerWinner = true;
            }
                
        }
        
        // Print whether the user won or lost based on winnerWinner variable.
        if(winnerWinner == true){
            System.out.println("You won!");
        }
        else{
            System.out.println("You lost, please play again...");
        }
        
    } // end main method
    
} //end class
