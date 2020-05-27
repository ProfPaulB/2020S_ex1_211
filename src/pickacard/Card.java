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
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

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

        // check if input is same as SUITS
        // assign value if it has the same value in the array, otherwise throw an exception
        if (suit.equals("clubs") || suit.equals("spades") || suit.equals("diamonds") || suit.equals("hearts")) {
            this.suit = suit;
        } 
        
        else {
            throw new IllegalArgumentException("Error: That's not a suit! Choose from clubs, spades, diamonds or hearts.");
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
   

    
    
}
