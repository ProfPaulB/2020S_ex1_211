package pickacard;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in Exercise 1. When you create your own branch,
 * add your name as an author.
 * @author dancye
 * @author Paul Bonenfant
 * @author Marjorie Teu - May 26, 2020
 */
public class Card{

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13
   private boolean hasSameCard = false;
   
   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
   
        // change input to lowercase for comparison
        suit = suit.toLowerCase();

        // assign value if it has the same valueotherwise throw an exception
        if (suit.equals("hearts") || suit.equals("diamonds") || suit.equals("spades") || suit.equals("clubs")) {
            this.suit = suit;
        } 
        
        else {
            throw new IllegalArgumentException("Error: Please choose from clubs, spades, diamonds or hearts.");
        }
    }

    

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
       
        if (value >= 1 && value <= 13) {
            this.value = value;
        } 
        
        else {
            throw new IllegalArgumentException("Error: Value must be between 1-13");
        }
    }
   
    
     /**
     * checks if the card is in the magic hand
     *
     * @param card the card to be compared to the magic hand
     * @param magicHand the array of cards in the magic hand
     * return true if the card is in the magic hand
     */
    public boolean isInMagicHand(Card card, Card[] magicHand)  {
        
        // compares card to the array of magic hand 
        for (int i = 0; i < magicHand.length; i++) {

            // if there is a same card, return true then exit
            if (card.getValue() == magicHand[i].getValue() && card.getSuit().equalsIgnoreCase(magicHand[i].getSuit())) { //
                return hasSameCard=true;
            }
            
            else {
                //do nothing and check the next card
            }
        }
        
        //return false if there's not same card
        return hasSameCard;
        
    }
    
     /**
     * print's result if card is in the magic hand or not.
     *
     * return result in string if card is in the magic hand or not.
     */
    public void printResult()  {
    
        if (hasSameCard) { 
            System.out.println("CONGRATULATIONS! Your card is in the magic hand!");
        } 
        
        else {
            System.out.println("SORRY! Your card is NOT in the magic hand!");
        }

    }
}
