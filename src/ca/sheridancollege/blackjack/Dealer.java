/**
 * SYST17796 Project, Winter 2020.
 * Blackjack
 */
package ca.sheridancollege.blackjack;

/**
 * Models a dealer, extends Player
 *
 * @author es-romo
 */
public class Dealer extends Player {
    private static int HITS_AT = 16;

    Dealer() {
        super("Dealer");
    }


    public int decide() {
        if (this.getHand().calcScore() <= 16) {
            return 1;
        }
        return 0;
    }
}