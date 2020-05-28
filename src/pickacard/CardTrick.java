package pickacard;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Mustafa Shubbar, 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(generateRandomNumber(13)+1);
            c.setSuit(Card.SUITS[generateRandomNumber(4)]);
            magicHand[i] = c;
        }
        
        // Testing Magic Hand
        // for(Card testPrint : magicHand) {
        //    System.out.println(testPrint.getSuit() + " / " + testPrint.getValue());
        // }

 
        // Hard coded lucky card
        Card luckyCard = new Card();
        luckyCard.setSuit("Clubs");
        luckyCard.setValue(7);        
        
        boolean winFlag = false;
        // and search magicHand here
        for(Card singleMagicCard: magicHand) {
            if(singleMagicCard.getValue() == luckyCard.getValue() && singleMagicCard.getSuit().equals(luckyCard.getSuit())) {
                winFlag = true;
                break;
            } else {
                winFlag = false;
            }
        }
        
        
        //Then report the result here
        System.out.println(winFlag ? "You Win!" : "You Lose!");
    }
    
    
    public static int generateRandomNumber(int number){
        return (int)(Math.random()* number);
    }

}
