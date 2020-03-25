/**
 * SYST17796 Project, Winter 2020.
 * Blackjack
 */
package ca.sheridancollege.project;

/**
 * Models a dealer, extends Player
 * @author es-romo
 */
public class Dealer extends Player{
    Hand hand = new Hand();

    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Dealer(String name) {
        super(name);
    }

    int deal(Player player){
        return 0;
    }
    int decide(){
        return 0;
    }

    @Override
    public void play() {

    }
}