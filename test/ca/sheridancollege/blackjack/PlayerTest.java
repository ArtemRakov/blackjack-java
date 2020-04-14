package ca.sheridancollege.blackjack;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void hit() {
       FrenchDeck deck = new FrenchDeck();
       Player player = new Player("Bob");
       player.hit(deck);

       assertEquals(deck.getSize(), FrenchDeck.maxSize - 1);
       assertEquals(player.getHand().getSize(), 1);
    }
}