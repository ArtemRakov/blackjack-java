/**
 * SYST17796 Project, Winter 2020.
 * Blackjack
 */
package ca.sheridancollege.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Command line interface for blackjack
 *
 * @author es-romo
 */
public final class CommandLine implements Viewer, Getter {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Displays main screen
     */
    public void displayStart() {
        System.out.println("\n");
        System.out.println(" ________  ___       ________  ________  ___  __          ___  ________  ________  ___  __       ");
        System.out.println("|\\   __  \\|\\  \\     |\\   __  \\|\\   ____\\|\\  \\|\\  \\       |\\  \\|\\   __  \\|\\   ____\\|\\  \\|\\  \\     ");
        System.out.println("\\ \\  \\|\\ /\\ \\  \\    \\ \\  \\|\\  \\ \\  \\___|\\ \\  \\/  /|_     \\ \\  \\ \\  \\|\\  \\ \\  \\___|\\ \\  \\/  /|_   ");
        System.out.println(" \\ \\   __  \\ \\  \\    \\ \\   __  \\ \\  \\    \\ \\   ___  \\  __ \\ \\  \\ \\   __  \\ \\  \\    \\ \\   ___  \\  ");
        System.out.println("  \\ \\  \\|\\  \\ \\  \\____\\ \\  \\ \\  \\ \\  \\____\\ \\  \\\\ \\  \\|\\  \\\\_\\  \\ \\  \\ \\  \\ \\  \\____\\ \\  \\\\ \\  \\ ");
        System.out.println("   \\ \\_______\\ \\_______\\ \\__\\ \\__\\ \\_______\\ \\__\\\\ \\__\\ \\________\\ \\__\\ \\__\\ \\_______\\ \\__\\\\ \\__\\");
        System.out.println("    \\|_______|\\|_______|\\|__|\\|__|\\|_______|\\|__| \\|__|\\|________|\\|__|\\|__|\\|_______|\\|__| \\|__|");
        System.out.println("\n");
    }

    @Override
    public void displayScore(Player player) {
        GroupOfCards cards = player.getHand();
        System.out.println();
        System.out.println(String.format("\t%s's score: %d", player.getName(), player.getScore()));
        for (Card card : cards.getCards()) {
            System.out.println(String.format("\t\t%s", card.toString()));
        }
    }

    @Override
    public void displayTurn(Player player) {
        System.out.println();
        System.out.println("*******************************************");
        System.out.println(String.format("\t%s's Turn", player.getName()));
        System.out.println("*******************************************");
        enterToContinue();
    }

    @Override
    public void displayBust(Player player) {
        System.out.println();
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println(String.format("\t%s busted!!!", player.getName()));
        this.displayScore(player);
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * ");
        enterToContinue();
    }

    @Override
    public void displayMove(Player player, int des) {
        System.out.println();
        String move = "";
        if (des == 1) {
            move = "hits";
        } else if (des == 0) {
            move = "stands";
        }
        System.out.println(player.getName() + " " + move);
    }

    @Override
    public void displayPause() {
        enterToContinue();
    }

    @Override
    public void displayLoser(Player player) {
        System.out.println("-------------------------------------------");
        System.out.println("\t" + player.getName() + " loses");
        this.displayScore(player);
        System.out.println("-------------------------------------------");
    }

    @Override
    public void displayWinner(Player player) {
        System.out.println("-------------------------------------------");
        System.out.println("\t" + player.getName() + " wins!!");
        this.displayScore(player);
        System.out.println("-------------------------------------------");
    }

    @Override
    public void displayTie(Player player) {
        System.out.println("-------------------------------------------");
        System.out.println("\t" + player.getName() + " ties");
        this.displayScore(player);
        System.out.println("-------------------------------------------");
    }

    @Override
    public ArrayList<Player> getPlayers() {
        System.out.print("How many players are playing? ");
        int numPlayers = scanner.nextInt();
        if (numPlayers < 1)
            return getPlayers();
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            System.out.print(String.format("Player %d name: ", i + 1));
            String name = scanner.next();
            scanner.nextLine();
            players.add(new Player(name));
        }
        return players;
    }

    @Override
    public int getDecision() {
        System.out.println();
        System.out.println("Hit or Stand?");
        String decision = scanner.nextLine();
        if (decision.toLowerCase().equals("hit")) {
            return 1;
        } else if (decision.toLowerCase().equals("stand")) {
            return 0;
        }
        return getDecision();
    }

    @Override
    public boolean getContinue() {
        System.out.println();
        System.out.print("Do you wish to start a new game (yes/no)? ");
        String des = scanner.next().trim().toLowerCase();
        System.out.println();
        switch (des) {
            case "yes":
            case "ye":
            case "y":
                return true;
            default:
                return false;
        }
    }

    public void enterToContinue() {
        System.out.println();
        System.out.printf("Press enter to continue...");
        scanner.nextLine();
    }
}