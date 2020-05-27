package pickacard;

import java.util.Scanner; 
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Estefania Melo
 * Date: May 27, 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        Card[] magicHand = new Card[7];
        
        Random valueGenerator = new Random();
        
        Card userChoice = new Card(); 
        
        //adding my luckyCard object 
        Card luckyCard = new Card ();
        luckyCard.setValue(3);
        luckyCard.setSuit("Diamonds");
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            c.setValue(valueGenerator.nextInt(13)+1);
            c.setSuit(Card.SUITS[valueGenerator.nextInt(3)]);
            
            magicHand [i] = c;
            
            System.out.println(magicHand[i].toString());
            
        }

        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Please enter card value (1-13): ");
        userChoice.setValue(sc.nextInt());
        
        System.out.println("Please enter a number to represent a suit (hearts(0), diamonds(1), spades(2), or clubs(3)): ");
        userChoice.setSuit(Card.SUITS[sc.nextInt()]);
        
        
        
        // and search magicHand here
        boolean winner = false;
        for (int i = 0; i < magicHand.length; i++){
            if(userChoice.equals(magicHand[i])){
                winner = true;
            }
            
        }
        
           
   
        //Then report the result here
             if (winner == true){
                System.out.println("You've won!");
            }
            else{
                System.out.println("Sorry, try again!");
            }
    
}
    
}
