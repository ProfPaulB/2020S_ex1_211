package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Simran Dhillon
 */
public class CardTrick {

    public static void main(String[] args) {
        boolean winn = false;
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            magicHand[i] = Card.nextLine();
            // random code
            int x = (int) Math.random();
            c.setValue(x);
            magicHand[i] = c;

            System.out.println(magicHand[i]);  //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        //insert code to ask the user for Card value and suit, create their card
        Scanner in = new Scanner(System.in);
        System.out.println("enter card value");
        int value = in.nextInt();
        System.out.println("enter suit");
        String suit = in.nextLine();
        // and search magicHand here
        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit("Hearts");
        //Then report the result here
        for (int j = 0; j < magicHand.length; j++) {
            if ((magicHand[j].getValue() == luckyCard.getValue())
                    && (magicHand[j].getSuit().equalsIgnoreCase(luckyCard.getSuit()))) {
                winn = true;
            }
        }
        if (winn == true) {
            System.out.println("Congrats! You Win");
        }
        System.out.printf("the results are", value, "and", suit);

    }
}
