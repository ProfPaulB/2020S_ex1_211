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
        
        Scanner input = new Scanner(System.in); // scanner object
        Card[] magicHand = new Card[7];
        
        //Lucky Card is 5 Hearts.
        luckyCard.setValue(5);
        luckyCard.setSuit(Card.SUITS[0]);
        
    
        System.out.println("Please enter a value");
        int crdValue = Integer.valueOf(input.nextLine()); //input for card value
        System.out.println("Please choose a suit (exp. 1) :");
        System.out.println("1.Hearts\n"
                + "2.Diamonds\n"
                + "3.Spades\n"
                + "4.Clubs");
        int suitValue = Integer.valueOf(input.nextLine()); // input for card suit      
        
                
    
        
        int matching = 0; // int if person card matheches with random numbers 
        for (int i = 0; i < magicHand.length; i++) {            
            Card c = new Card();
            int rnd = (int)(Math.random()*((13+1)-1))+1; // getting random numbers between 0-13 for the card number
            c.setValue(rnd); //(insert call to random number generator here)
            int rndsuit = (int)(Math.random()*((3-0)+1)); // getting random numbers between 0-3 for suit array.           
            String suits = c.SUITS[rndsuit]; //calling suit array
            c.setSuit(suits); //[insert call to random number between 0-3 here]
            System.out.println(c.getValue()); // print out random card number
            System.out.println(c.getSuit());  // print out random suit 
            if(rnd == crdValue && suitValue == rndsuit){ // 
                matching =+1; // adding one if person's choice matches with random numbers            
                
            }
            
        }
        //printing out the final report
        if(matching > 0){
        System.out.println("Your card is in the magic hand...");
        }else{
            System.out.println("Your card is not in the magic hand... ");
        }
        

       
    }

}
