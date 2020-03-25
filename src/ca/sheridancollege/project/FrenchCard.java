/**
 * SYST17796 Project, Winter 2020.
 * Blackjack
 */
package ca.sheridancollege.project;

/**
 * Models a typical french card. Can be any combination of ranks and suits. No jokers.
 * @author es-romo
 */
public class FrenchCard extends Card{

    private Suits suit;
    private Ranks rank;

    public enum Suits {
        Hearts,Spades,Diamonds,Clubs
    }
    public enum Ranks{
        Ace,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten,Jack,Queen,King
    }

    public FrenchCard(Suits suit, Ranks rank) {
        this.setSuit(suit);
        this.setRank(rank);
    }

    @Override
    public Suits getSuit() {
        return suit;
    }

    @Override
    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    @Override
    public Ranks getRank() {
        return rank;
    }

    @Override
    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", rank, suit);
    }
}
