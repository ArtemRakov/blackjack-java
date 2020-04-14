package ca.sheridancollege.blackjack;

import java.util.ArrayList;

public interface Viewer {
    public void displayStart();

    public void displayScore(Player player);

    public void displayTurn(Player player);

    public void displayBust(Player player);

    public void displayMove(Player player, int des);

    public void displayPause();

    public void displayLoser(Player player);

    public void displayWinner(Player player);

    public void displayTie(Player player);
}
