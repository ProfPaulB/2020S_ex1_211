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
        Card[] magicHand = new Card[7];

        int cardNum;
        String cardSuit;
        
        // created to maintain or exit a loop depending on the validity of the input
        boolean valid = false;

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            //set random value for card
            c.setValue((int) (Math.random() * 13));

            //set random suit for card
            c.setSuit(Card.SUITS[(int) (Math.random() * 3)]);

            //assign c to magicHand
            magicHand[i] = c;
        }

        //create player card object
        Card playerCard = new Card();

        //ask user for Card value and loop till value is valid
        do {
            System.out.print("Enter your card number [1-13]: ");

            // get value and trim off any excess spaces
            String temp = input.nextLine().trim();

            try {
                
                // if null or empty string, throw an exception
                if (temp.isBlank() | temp.isEmpty()) {
                    throw new IllegalArgumentException("Error: Input a value.");
                } 
                
                // if al char in input are digits, assign then exit loop
                else if (temp.matches("[0-9]+")) {
                    cardNum = input.nextInt();
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

        //ask user for suit
        System.out.println("Enter your card suit in words: ");
        cardSuit = input.nextLine();
        playerCard.setSuit(cardSuit);

        //print player card
        String format = "Your card is %d of %s\n";
        System.out.printf(format, playerCard.getValue(), playerCard.getSuit());

        // and search magicHand here
        //Then report the result here
    }

}
