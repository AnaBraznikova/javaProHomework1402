package telran.homework2302;

import telran.homework2302.DealRank;
import telran.homework2302.DealSuits;

import java.util.Random;
import java.util.Scanner;

public class Deal {

    final static Scanner sc = new Scanner(System.in);
    final static Random random = new Random();

    public static void main(String[] args) {


        final int cardsForPlayer = 5;
        int players;

        final int numberOfCards = DealSuits.values().length * DealRank.values().length; // number of cards

        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= numberOfCards) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }

        // deck initialization
        String[] deck = new String[numberOfCards];
        for (int i = 0; i < DealRank.values().length; i++) {
            for (int j = 0; j < DealSuits.values().length; j++) {
                deck[DealSuits.values().length * i + j] = DealRank.values()[i] + " " + DealSuits.values()[j];
            }
        }

        // deck shuffling
        for (int i = 0; i < numberOfCards; i++) {
            int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }

        // the shuffled deck is displayed
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(deck[i]);

            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }

}