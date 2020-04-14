package ca.sheridancollege.blackjack;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class DealerTest {

    @Test
    public void decideNegative() {
       FrenchCard queen = new FrenchCard(FrenchCard.Suits.Diamonds, FrenchCard.Ranks.Queen);
       FrenchCard king = new FrenchCard(FrenchCard.Suits.Hearts, FrenchCard.Ranks.King);
       ArrayList<Card> cards = new ArrayList<>(Arrays.asList(queen, king));
       GroupOfCards deck = new GroupOfCards(cards);
       Dealer dealer = new Dealer();

       dealer.hit(deck);
       dealer.hit(deck);

       assertEquals(dealer.decide(), 0);
    }

    @Test
    public void decidePositive() {
        FrenchCard ace = new FrenchCard(FrenchCard.Suits.Diamonds, FrenchCard.Ranks.Ace);
        FrenchCard three = new FrenchCard(FrenchCard.Suits.Hearts, FrenchCard.Ranks.Three);
        ArrayList<Card> cards = new ArrayList<>(Arrays.asList(ace, three));
        GroupOfCards deck = new GroupOfCards(cards);
        Dealer dealer = new Dealer();

        dealer.hit(deck);
        dealer.hit(deck);

        assertEquals(dealer.decide(), 1);
    }
}