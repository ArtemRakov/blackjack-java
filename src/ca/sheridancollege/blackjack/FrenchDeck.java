/**
 * SYST17796 Project, Winter 2020.
 * Blackjack
 */
package ca.sheridancollege.blackjack;

/**
 * Models a 52 deck of FrenchCards
 *
 * @author es-romo
 */
public class FrenchDeck extends GroupOfCards {
    private static int maxSize = FrenchCard.Ranks.values().length * FrenchCard.Suits.values().length;

    FrenchDeck() {
        super(maxSize);
        for (FrenchCard.Suits suit : FrenchCard.Suits.values()) {
            for (FrenchCard.Ranks rank : FrenchCard.Ranks.values()) {
                this.cards.add(new FrenchCard(suit, rank));
            }
        }
        this.shuffle();
    }
}