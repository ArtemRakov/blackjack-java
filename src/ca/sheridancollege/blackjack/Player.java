/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.blackjack;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @modifier es-romo, March 25,2020
 */
public class Player {
    private GroupOfCards hand = new GroupOfCards(); //the unique ID for this player
    private String name;

    Player(String name) {
        this.name = name;
    }

    /**
     * @return the group of cards the player holds
     */
    public GroupOfCards getHand() {
        return hand;
    }

    /**
     * A class that simulates the player 'hitting'
     */
    public void hit(FrenchDeck deck) {
        if (deck.getSize() == 0)
            throw new ArithmeticException("Cant hit over and empty deck");
        hand.push(deck.pop());
    }

    public int getScore() {
        return hand.calcScore();
    }

    /**
     * @return The player's name
     */
    public String getName() {
        return name;
    }
}
