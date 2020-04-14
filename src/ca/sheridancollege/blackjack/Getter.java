package ca.sheridancollege.blackjack;

import java.util.ArrayList;

public interface Getter {
    ArrayList<Player> getPlayers();

    int getDecision();

    boolean getContinue();
}
