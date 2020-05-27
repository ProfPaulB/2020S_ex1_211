package pickacard;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Haomin Chen May 27, 2020
 */
public class CardTrick {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Card[] magicHand = new Card[7];

        //Complete Task 3: assign the card value/suit to the magicHand array
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number(from 1 to 13) generator here)
            c.setValue((int) (Math.random() * 13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
        }

        //Only for testing, show all the magicHand array result 
        for (Card c : magicHand) {
            System.out.printf("Card value/suit: %d/%s%n", c.getValue(), c.getSuit());
        }
        
        //Complete Task 6: add a luckyCard object and assign the value to 5 and "Hearts"
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Hearts");
        
        /**
         * Complete task 4 part1: ask the user for the card value and suit and
         * check data validation
         */
        //insert code to ask the user for Card value and suit, create their card    
        // and search magicHand here
        try {
            System.out.println("Pick one card nunmber from 1 to 13, Ace = 1,"
                    + "Jack = 11, Queen = 12, King = 13:");
            int userNum = in.nextInt();
            if (userNum > 13 || userNum < 1) {
                throw new Exception("Error: one card number should be from 1 to 13.");
            }
            System.out.println("Pick one card suit from 0 to 3, 0= Hearts,1= "
                    + "Diamonds, 2=Spades, 3=Clubs:");
            int suitNum = in.nextInt();
            if (suitNum > 3 || suitNum < 0) {
                throw new Exception("Error: one card suit number should be from 0 to 3.");
            }
            String userSuit = Card.SUITS[suitNum];

            //Complete task 4 part2: report to the user about the result
            //Then report the result here
            boolean isMatched = true;
            for (Card c : magicHand) {
                if (userNum == c.getValue() && userSuit.equals(c.getSuit())) {
                    isMatched = true;
                    break;
                } else {
                    isMatched = false;
                }
            }
            String message = (isMatched) ? "Congratulations! You win!" : "Sorry! You lose!";
            System.out.println(message);
        } catch (InputMismatchException ex) {
            System.out.println("Error: the input should be a number");
        }
    }
}
