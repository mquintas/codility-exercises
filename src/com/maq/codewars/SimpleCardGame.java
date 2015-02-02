package com.maq.codewars;


import java.util.HashMap;
import java.util.Map;

public class SimpleCardGame {

    public static void main(String[] args) {
        System.out.println(winner(new String[]{"A", "7", "8"}, new String[]{"K", "5", "9"}));
        System.out.println(winner(new String[]{"T"}, new String[]{"T"}));
        System.out.println(winner(new String[]{"A", "7", "8"}, new String[]{"A", "8", "9"}));
    }

    public static String winner(String[] deckSteve, String[] deckJosh) {

        Map<String, Integer> deck = new HashMap<String, Integer>();
        deck.put("2", 1);
        deck.put("3", 2);
        deck.put("4", 3);
        deck.put("5", 4);
        deck.put("6", 5);
        deck.put("7", 6);
        deck.put("8", 7);
        deck.put("9", 8);
        deck.put("T", 9);
        deck.put("J", 10);
        deck.put("Q", 11);
        deck.put("K", 12);
        deck.put("A", 13);

        int[] points = {0,0};

        for (int i = 0 ; i < deckSteve.length; i++) {
            int winner =  checkCards(deckSteve[i], deckJosh[i], deck);
            if (winner != -1) {
                points[winner]++;
            }
        }
        if (points[0] == points[1]) {
            return "Tie";
        } else if (points[0] > points[1]) {
            return "Steve wins "+points[0]+" to "+points[1];
        } else {
            return "Josh wins "+points[1]+" to "+points[0];
        }
    }

    private static int checkCards(String card1, String card2, Map<String, Integer> deck) {

        if( (deck.get(card1)) == (deck.get(card2)) ) {
            return -1;
        } else if( (deck.get(card1)) > (deck.get(card2)) ) {
            return 0;
        } else {
            return 1;
        }
    }

}
