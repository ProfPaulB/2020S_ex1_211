package pickacard;

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

//        //Only for testing, show all the magicHand array result 
//        for (Card c : magicHand) {
//            System.out.printf("Card value/suit: %d/%s%n", c.getValue(), c.getSuit());
//        }

        //Complete Task 6: add a luckyCard object and assign the value to 5 and "Hearts"
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Hearts");

        //Complete task 7: report the luckyCard result
        //Then report the result here
        boolean isMatched = true;
        for (Card c : magicHand) {
            if (luckyCard.getValue() == c.getValue()
                    && luckyCard.getSuit().equals(c.getSuit())) {
                isMatched = true;
                break;
            } else {
                isMatched = false;
            }
        }
        String message = (isMatched) ? "Congratulations! You win!" : "Sorry! You lose!";
        System.out.println(message);
    }
}
