/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pickacard;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Minwoo Park
 * @date 05/27/2020
 */
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                                 
        Card[] magicHand = new Card[7];  
        Card c = new Card();
         
        for (int i = 0; i < magicHand.length; i++) {
              
            magicHand[i] = new Card();
            //c.setValue(insert call to random number generator here)
            Random rand = new Random();
            int numOfValue = rand.nextInt(13) + 1;
            int numOfSuit = rand.nextInt(Card.SUITS.length);

//            c.setValue(numOfValue);
//            c.setSuit(Card.SUITS[numOfSuit]);          
            magicHand[i].setValue(numOfValue);         
            magicHand[i].setSuit(Card.SUITS[numOfSuit]);
                     
        }
                
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
                                        
        Scanner in = new Scanner(System.in);
        System.out.println("Pick one value from 1 to 13 : ");
        int valueOfUser = in.nextInt();

        System.out.println("Type one suit: \n1:Hearts\n2:Diamonds\n3:Spades\n4:Clubs");
        String SuitOfUser = in.next();

        //Then report the result here
        for (int i = 0; i < magicHand.length; i++) {
           
            if (valueOfUser == magicHand[i].getValue() && SuitOfUser.equals(magicHand[i].getSuit())) {
                System.out.println("congratulation! You win!");
                System.out.println("your value and suit are " + valueOfUser +"," + SuitOfUser
            +"\n They are matched with " +magicHand[i].getValue()+" and " + magicHand[i].getSuit());
                
                break;
                
            }
            else{
                System.out.println("You lost!");
                System.out.println("Try again plase. They are not matched"
            +"\nThe value and suit are " + magicHand[i].getValue()+" and " + magicHand[i].getSuit() );
                
            }
        }

    }

}




