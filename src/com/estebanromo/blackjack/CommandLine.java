/**
 * SYST17796 Project, Winter 2020.
 * Blackjack
 */
package com.estebanromo.blackjack;

import java.util.Scanner;

/**
 * Command line interface for blackjack
 * @author es-romo
 */
public final class CommandLine implements Viewer{
    private Scanner scanner = new Scanner(System.in);

    /**
     * Displays main screen
     */
    @Override
    public void displayStart() {
        System.out.print("\n\n");
        System.out.println(" ________  ___       ________  ________  ___  __          ___  ________  ________  ___  __       ");
        System.out.println("|\\   __  \\|\\  \\     |\\   __  \\|\\   ____\\|\\  \\|\\  \\       |\\  \\|\\   __  \\|\\   ____\\|\\  \\|\\  \\     ");
        System.out.println("\\ \\  \\|\\ /\\ \\  \\    \\ \\  \\|\\  \\ \\  \\___|\\ \\  \\/  /|_     \\ \\  \\ \\  \\|\\  \\ \\  \\___|\\ \\  \\/  /|_   ");
        System.out.println(" \\ \\   __  \\ \\  \\    \\ \\   __  \\ \\  \\    \\ \\   ___  \\  __ \\ \\  \\ \\   __  \\ \\  \\    \\ \\   ___  \\  ");
        System.out.println("  \\ \\  \\|\\  \\ \\  \\____\\ \\  \\ \\  \\ \\  \\____\\ \\  \\\\ \\  \\|\\  \\\\_\\  \\ \\  \\ \\  \\ \\  \\____\\ \\  \\\\ \\  \\ ");
        System.out.println("   \\ \\_______\\ \\_______\\ \\__\\ \\__\\ \\_______\\ \\__\\\\ \\__\\ \\________\\ \\__\\ \\__\\ \\_______\\ \\__\\\\ \\__\\");
        System.out.println("    \\|_______|\\|_______|\\|__|\\|__|\\|_______|\\|__| \\|__|\\|________|\\|__|\\|__|\\|_______|\\|__| \\|__|");
        System.out.print("\n\n");
    }
}
