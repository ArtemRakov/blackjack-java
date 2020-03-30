/**
 * SYST17796 Project, Winter 2020.
 * Blackjack
 */
package com.estebanromo.blackjack;

/**
 * Extends GroupOfCards, add player hand functionality
 * @author es-romo
 */
public class Hand extends GroupOfCards {
    public Hand(int givenSize) {
        super(givenSize);
    }

    public Hand() {
        super(1);
    }
}