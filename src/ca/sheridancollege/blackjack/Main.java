package ca.sheridancollege.blackjack;

public class Main {
    public static void main(String args[]) {
        Viewer cli = new CommandLine();
        BlackJack game = new BlackJack("Blackjack", cli, (Getter) cli);
        game.play();
    }
}
