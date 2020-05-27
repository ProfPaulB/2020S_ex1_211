package pickacard;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Marjorie Teu - May 26, 2020
 */
public class CardTrick {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // magic hand cards
        Card[] magicHand = new Card[7];
        
        // create new card and set value and suit
        Card luckyCard  = new Card();
        
        int cardNum;
        String cardSuit;

        // created to maintain or exit a loop depending on the validity of the input
        boolean valid = false;

        
        // CREATE CARD
        // create the 7 cards with random number and suit
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            //set random value for card
            c.setValue((int) (1 + Math.random() * 13));

            //set random suit for card
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);

            //assign c to magicHand
            magicHand[i] = c;
        }


        //assign lucky card value and suit
            try {
                luckyCard.setValue(1);
                luckyCard.setSuit("hearts");        
            } 
            
            catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println(e + "\n");
            }

        
//        System.out.println("");
//                
//        // PRINT MAGIC HANDS
//        for (int i =0; i < magicHand.length; i++) {
//            System.out.printf("magicHand%d is %d of %s\n", i+1, magicHand[i].getValue(), magicHand[i].getSuit());            
//        }
       
        
        //print player card
        String format = "\nYour card is %d of %s.\n";
        System.out.printf(format, luckyCard.getValue(), playerCard.getSuit());

        //search card in magic hand
        luckyCard.isInMagicHand(luckyCard, magicHand);
        
        //print result
        luckyCard.printResult();
        
    }
    
    
    

        
    

}
