package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 */

public class CardTrick {

    public static void main(String[] args) {
        
        
        Card[] magicHand = new Card[7];
        
        boolean win = false;

        for (int i = 0; i < magicHand.length; i++) {
        
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 13 + 1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) Math.random() * 4 ]);
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        Card luckyCard = new Card();
        
        luckyCard.setValue(4);
        
        luckyCard.setSuit("Spade");
        // and search magicHand here
        for (int i = 0; i < magicHand.length; i++) {
            
            if ((magicHand[i].getValue() == luckyCard.getValue()) &&
                (magicHand[i].getSuit() == luckyCard.getSuit())) {
            
                win = true;
        }
        }
        
        //Then report the result here
        if (win == true){
            System.out.println("You Win!");
        }else
            System.out.println("You Lose!");
    }

}
