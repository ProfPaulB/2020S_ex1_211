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
        
        // player card 
        Card playerCard = new Card();
        
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


        //ASK FOR INPUT VALUE
        //ask user for Card value and keep prompting till value is valid
        do {
            System.out.print("Enter your card number [1-13]: ");

            // get value and trim off any excess spaces
            String temp = input.nextLine().trim();

            try {
                
                // if null or empty string, throw an exception
                if (temp.isBlank() | temp.isEmpty()) {
                    throw new IllegalArgumentException("Error: Input a value.");
                } 

                                
                else if (temp.matches("[-.,]+")) {
                    throw new IllegalArgumentException("Error: Value is invalid.");
                } 
                
                // if all char in input are digits, assign then exit loop
                else if (temp.matches("[0-9-]+")) {
                    cardNum = Integer.parseInt(temp);
                    playerCard.setValue(cardNum);
                    valid = true;
                } 

                // throw exception if input has any other char, signs, NaN
                else {
                    throw new IllegalArgumentException("Error: Value is invalid.");
                }
            } 
            
            catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println(e + "\n");
            }
            
        } while (!valid);

        
        // reset to maintain loop while input is invalid
        valid = false;

        
        //ASK FOR INPUT SUIT
        //ask user for Card type and keep prompting till value is valid
        do{
            
            try{
                System.out.print("Enter your card suit (ex. hearts, diamonds, spades, clubs): ");
                cardSuit = input.nextLine().trim();

                //if null or empty string, throw an exception
                if (cardSuit.isEmpty() || cardSuit.isBlank()) {
                    throw new IllegalArgumentException("Error: You must enter yout suit!");
                }

                // if all char in input are letters, assign then exit loop
                else if (cardSuit.matches("[a-zA-Z]+")) {
                    playerCard.setSuit(cardSuit);
                    valid = true;
                } 

                //otherwise throw an exception
                else {
                    throw new IllegalArgumentException("Error: Value is invalid.");
                }
            } 
            
            catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println(e + "\n");
            }
            
        } while (!valid);

        
        //reset to maintain loop while input is invalid
        valid = false;
        
        System.out.println("");
                
        // PRINT MAGIC HANDS
        for (int i =0; i < magicHand.length; i++) {
            System.out.printf("magicHand%d is %d of %s\n", i+1, magicHand[i].getValue(), magicHand[i].getSuit());            
        }
       
        
        //print player card
        String format = "\nYour card is %d of %s.\n";
        System.out.printf(format, playerCard.getValue(), playerCard.getSuit());

        //search card in magic hand
        playerCard.isInMagicHand(playerCard, magicHand);
        
        //print result
        playerCard.printResult();
        
        
        
    }

}
