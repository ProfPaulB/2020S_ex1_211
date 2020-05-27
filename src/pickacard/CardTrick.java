package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Melih Eren Arslan 26.05.2020
 * 
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
    
        System.out.println("Please enter a value: ");
        int crdValue = Integer.valueOf(input.nextLine());
        System.out.println("Please choose a suit (exp. 1) :");
        System.out.println("1.Hearts\n"
                + "2.Diamonds\n"
                + "3.Spades\n"
                + "4.Clubs");
        int suitValue = Integer.valueOf(input.nextLine());      
        
                
    
        
        int matching = 0;
        for (int i = 0; i < magicHand.length; i++) {            
            Card c = new Card();
            int rnd = (int)(Math.random()*((13+1)-1))+1;
            c.setValue(rnd); //(insert call to random number generator here)
            int rndsuit = (int)(Math.random()*((3-0)+1));
            //c.setSuit(); //[insert call to random number between 0-3 here]
            String suits = c.SUITS[rndsuit];
            c.setSuit(suits);
            System.out.println(c.getValue());
            System.out.println(c.getSuit());
            if(rnd == crdValue && suitValue == rndsuit){
                matching =+1;                
                
            }
            
        }
        if(matching > 0){
        System.out.println("Your card is in the magic hand...");
        }else{
            System.out.println("Your card is not in the magic hand... ");
        }
        

        //insert code to ask the user for Card value and suit, create their card
        
        
        // and search magicHand here
        //Then report the result here
    }

}
