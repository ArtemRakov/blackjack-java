/**
 * SYST17796 Project, Winter 2020.
 * Blackjack
 */
package com.estebanromo.blackjack;

/**
 * Store all blackjack "rules" as methods and fields
 * @author es-romo
 */
public class BlackJack {
    public static final int BLACKJACK = 21;
    public static final int DEALER_HITS_AT = 16;

    /**
     * calculates the score from a GroupOfCards according to the set rules
     * @return returns an int representing the best possible score
     */
    public static int calcScore(GroupOfCards groupOfCards){
        //TODO if empty return 0
        int score = 0;
        for (Card card: groupOfCards.showCards()) {
            if (card.getRank()==FrenchCard.Ranks.Ace){
                score += (score<=11) ? 11 : 1;
            }else {
                switch (card.getRank()){
                    case Two:
                        score += 2;
                        break;
                    case Three:
                        score += 3;
                        break;
                    case Four:
                        score += 4;
                        break;
                    case Five:
                        score += 5;
                        break;
                    case Six:
                        score += 6;
                        break;
                    case Seven:
                        score += 7;
                        break;
                    case Eight:
                        score += 8;
                        break;
                    case Nine:
                        score += 9;
                        break;
                    case Ten:
                    case Jack:
                    case Queen:
                    case King:
                        score += 10;
                        break;
                }
            }
        }
        return score;
    }

}
