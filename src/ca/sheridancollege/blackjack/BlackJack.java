package ca.sheridancollege.blackjack;

import java.util.ArrayList;

public class BlackJack extends Game {

    public static final int BLACKJACK = 21; // Score when black jack is considered
    private Viewer viewer;//View interface for the game
    private Getter getter;//Get interface for the game
    FrenchDeck deck;
    private Dealer dealer;

    public BlackJack(String givenName, Viewer viewer, Getter getter) {
        super(givenName);
        this.viewer = viewer;
        this.getter = getter;
    }

    @Override
    public void play() {
        boolean continues = true;
        while (continues) {
            game();
            continues = getter.getContinue();
        }
    }

    public void game() {
        deck = new FrenchDeck();
        dealer = new Dealer();
        viewer.displayStart();
        ArrayList<Player> players = getter.getPlayers();
        this.setPlayers(players);
        this.deal();
        for (Player player : this.getPlayers()) {
            viewer.displayTurn(player);
            boolean continues;
            do {
                viewer.displayScore(dealer);
                viewer.displayScore(player);
                int decision = getter.getDecision();
                if (decision == 1) {
                    player.hit(deck);
                    continues = validate(player);
                } else {
                    continues = false;
                }
            } while (continues);
        }

        //Dealer's turn
        boolean dealerCont = true;
        viewer.displayTurn(dealer);
        do {
            viewer.displayScore(dealer);
            int dealerDes = dealer.decide();
            viewer.displayMove(dealer, dealerDes);
            if (dealerDes == 1) {
                dealer.hit(deck);
                dealerCont = validate(dealer);
            } else {
                dealerCont = false;
            }
            if (!(dealer.getScore() > 21)) {
                viewer.displayPause();
            }
        } while (dealerCont);
        this.declareWinner();
    }

    @Override
    public void declareWinner() {
        for (Player player : this.getPlayers()) {
            if (player.getScore() > BlackJack.BLACKJACK) {
                viewer.displayLoser(player);
            } else if ((player.getScore() > dealer.getScore())
                    || (dealer.getScore() > BlackJack.BLACKJACK)) {
                viewer.displayWinner(player);
            } else {
                viewer.displayTie(player);
            }
        }
    }

    public void deal() {
        ArrayList<Player> players = this.getPlayers();
        for (Player player : players) {
            player.hit(this.deck);
            player.hit(this.deck);
        }
        this.dealer.hit(this.deck);
    }

    /**
     * @param player the player to be validated
     * @return true: continues, false: stops
     */
    public boolean validate(Player player) {
        if (player.getScore() <= BlackJack.BLACKJACK) {
            return true;
        } else {
            viewer.displayBust(player);
            return false;
        }//If bust
    }
}
