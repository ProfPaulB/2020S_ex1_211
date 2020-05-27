package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and 
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author (Andrew) Yin Tung Ng     (modified May 26 2020)
 */
public class CardTrick {

    public static void main(String[] args) {

        // using of variable for # of cards makes code more flexible
        int numOfCards = 7;
        Card[] magicHand = new Card[numOfCards];

        // randomly create Card objects to fill in array of cards
        for (int i = 0; i < magicHand.length; i++) {
            
            Card c = new Card();

            // random ints fall within required Card attribute ranges
            int randomInt_1to13 = 1 + (int) (Math.random() * 13);
            int randomInt_0to3 = (int) (Math.random() * 4);

            c.setValue(randomInt_1to13);
            c.setSuit(Card.SUITS[randomInt_0to3]);
            
            // assign the random card c into the card hand array
            magicHand[i] = c;
        }

        // For Testing: printing out magicHand array
        System.out.println("The hand of cards is:");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }

        // ask the user for Card value and suit, and store as a Card object
        Scanner input = new Scanner(System.in);
        Card userCard = new Card();
        System.out.println("*** Pick a card by its value and suit ***\n");
        
        // prompt user for card value, and set the value attribute from input
        System.out.println("Value of your card:");
        System.out.println("Enter the actual number for values 2 to 10."); 
        System.out.println("Enter 1 for Ace, 11 for Jack, 12 for Queen, and 13 for King."); 
        System.out.print("Enter a number for the value of your card: ");
        userCard.setValue(input.nextInt());
        
        // prompt user for card suit, and set the suit attribute from input
        System.out.println("\nSuit of your card:");
        System.out.println("Enter 0 for Hearts, 1 for Diamonds, 2 for Spades, and 3 for Clubs.");
        System.out.print("Enter a number for the suit of your card: ");
        userCard.setSuit(Card.SUITS[input.nextInt()]);
        
        // For Testing: printing out magicHand array
        System.out.println("\nYour card is the " + userCard.getValue() + " of " + userCard.getSuit());
        
        
        // search through magicHand Card array for matches to user's Card
        
        // the boolean variable 'match' switches to true if card match is found
        boolean match = false;
        
        // testCard reference variable allows for reference flexibility (userCard or luckyCard)
        Card testCard = userCard;        
        
        for (Card card: magicHand) {
            
            if (card.getValue() == testCard.getValue() && card.getSuit().equals(testCard.getSuit()) )
                match = true;
        }
        
        // report the result of the card match search to user
        if (match)
            System.out.println("You win! Your chosen card is in the hand of random cards.");
        else
            System.out.println("You lose. Your chosen card is not in the hand of random cards.");

    }

}
