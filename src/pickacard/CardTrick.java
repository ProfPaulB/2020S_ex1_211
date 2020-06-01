package pickacard;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 */
public class CardTrick {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner inputScan = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        String suitx = null;
        int valuex = 0;

        for (int i = 0; i < magicHand.length; i++) {
//        for (Card magicHand1 : magicHand) {
            Card c = new Card();
            int r;
            r = rand.nextInt(4);
            suitx = Card.SUITS[r];
            c.setSuit(suitx);
            r = rand.nextInt(13) + 1;
            c.setValue(r);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        boolean contLoop;

        do {
            Card cUser = new Card();
            do {
                contLoop = false;
                System.out.print("\nChoose a SUIT (1)Herats / (2)Diamonds / (3)Spades / (4)Club): ");
                try {
                    valuex = inputScan.nextInt();
                    switch (valuex) {
                        case 1:
                            suitx = "Hearts";
                            break;
                        case 2:
                            suitx = "Diamonds";
                            break;
                        case 3:
                            suitx = "Spades";
                            break;
                        case 4:
                            suitx = "Clubs";
                            break;
                        default:
                            throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Only 1-4. Try Again.");
                    contLoop = true;
                }
                cUser.setSuit(suitx);
                inputScan = new Scanner(System.in);
            } while (contLoop);

            do {
                contLoop = false;
                System.out.print("\nChoose a VALUE (1) to (13): ");
                try {
                    valuex = inputScan.nextInt();
                    if (valuex < 1 || valuex > 13) {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Only 1-13. Try Again.");
                    contLoop = true;
                }
                cUser.setValue(valuex);
                inputScan = new Scanner(System.in);
            } while (contLoop);

            System.out.println(cUser.getValue());
            System.out.println(cUser.getSuit());
            System.out.println(cUser.getClass());

            System.out.println("---------------------------------");
            for (int i = 0; i < 7; i++) {

                System.out.println(magicHand[i]);

                System.out.print(magicHand[i].getSuit());

                System.out.println(magicHand[i].getValue());

                if (magicHand[i].getSuit() == cUser.getSuit() && magicHand[i].getValue() == cUser.getValue()) {
                    System.out.println("IQUAL");

                }

            }

            contLoop = true;
            System.out.print("\n\nAnother Item (Y/N)? ");
            String again = inputScan.next();
            while (!"y".equals(again) && !"Y".equals(again) && !"N".equals(again) && !"n".equals(again)) {
                System.out.println("Invalid response. Try again.");
                System.out.print("\nAnother Item (Y/N)? ");
                again = inputScan.next();
            }
            if ("n".equals(again) || "N".equals(again)) {
                contLoop = false;
            }

        } while (contLoop);
    }

}
