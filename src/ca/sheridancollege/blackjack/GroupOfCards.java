/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @modifier es-romo, March 25,2020
 */
public class GroupOfCards {
    /**
     * /The group of cards, stored in an ArrayList
     */
    protected ArrayList<Card> cards;

    public GroupOfCards() {
        cards = new ArrayList<>();
    }

    /**
     * this.cards getter
     *
     * @return cards cards in group
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * Shuffles the deck of cards
     */
    public void shuffle() {
        if (this.getSize() <= 0)
            throw new ArithmeticException("Can't shuffle an empty grouping of cards");
        Collections.shuffle(cards, new Random());
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public GroupOfCards(int givenSize) {
        cards = new ArrayList<>(givenSize);
    }

    /**
     * @return the current size of the group of cards
     */
    public int getSize() {
        return this.cards.size();
    }

    /**
     * Simulates pop functionality for an ArrayList
     *
     * @return last card in list
     */
    public Card pop() {
        if (this.getSize() <= 0)
            throw new ArithmeticException("Cant pop an empty list");
        return this.cards.remove(this.getSize() - 1);
    }

    /**
     * @param card element to be prepended to the list
     */
    public void push(Card card) {
        cards.add(0, card);
    }

    /**
     * @return returns the calculated score for the
     */
    public int calcScore() {
        int score = 0;
        if (this.getSize() <= 0)
            return 0;
        for (Card card : this.cards) {
            switch (card.getRank()) {
                case Ace:
                    score += 1;
                    break;
                case Two:
                    score += 2;
                    break;
                case Three:
                    score += 3;
                    break;
                case Four:
                    score += 4;
                    break;
                case Five:
                    score += 5;
                    break;
                case Six:
                    score += 6;
                    break;
                case Seven:
                    score += 7;
                    break;
                case Eight:
                    score += 8;
                    break;
                case Nine:
                    score += 9;
                    break;
                case Ten:
                case Jack:
                case Queen:
                case King:
                    score += 10;
                    break;
            }
        }
        return score;
    }

}
