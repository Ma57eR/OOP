package Abstract.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String card = scan.nextLine();
        String suit = scan.nextLine();

        int cardPower = 0;
        int suitPower = 0;
        for (Card currentCard : Card.values()) {
            if (card.equals(currentCard.name())) {
                cardPower = currentCard.getPower();
            }
        }
        for (Suit currentSuit : Suit.values()) {
            if (suit.equals(currentSuit.name())) {
                suitPower = currentSuit.getSuitPower();
            }
        }
        System.out.printf("Card name: %s of %s; Card power: %d", card, suit, cardPower+suitPower);
    }
}
