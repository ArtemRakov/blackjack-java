package ca.sheridancollege.blackjack;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GroupOfCardsTest {
    @Rule
    public final ExpectedException expection = ExpectedException.none();

    @Test
    public void successPop() {
        ArrayList<Card> cards = new ArrayList<Card>(Arrays.asList(new FrenchCard(FrenchCard.Suits.Clubs, FrenchCard.Ranks.Ace), new FrenchCard(FrenchCard.Suits.Diamonds, FrenchCard.Ranks.Ace)));
        GroupOfCards groupOfCards = new GroupOfCards(cards);
        groupOfCards.pop();

        assertEquals(groupOfCards.getCards().size(), 1);
    }

     @Test
     public void failingPop() {
         ArrayList<Card> cards = new ArrayList<Card>();
         GroupOfCards groupOfCards = new GroupOfCards(cards);

         expection.expect(ArithmeticException.class);
         groupOfCards.pop();
     }

    @Test
    public void push() {
        GroupOfCards groupOfCards = new GroupOfCards();
        FrenchCard card = new FrenchCard(FrenchCard.Suits.Clubs, FrenchCard.Ranks.Ace);
        groupOfCards.push(card);

        assertEquals(groupOfCards.getCards().size(), 1);
    }

    @Test
    public void calcScore() {
       FrenchCard ace = new FrenchCard(FrenchCard.Suits.Diamonds, FrenchCard.Ranks.Ace);
       FrenchCard three = new FrenchCard(FrenchCard.Suits.Hearts, FrenchCard.Ranks.Three);
       ArrayList<Card> cards = new ArrayList<>(Arrays.asList(ace, three));
       GroupOfCards groupOfCards = new GroupOfCards(cards);

       assertEquals(groupOfCards.calcScore(), 4);
    }
}