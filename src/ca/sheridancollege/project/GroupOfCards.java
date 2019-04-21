package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * This project simulates a card matching game using a deck of cards. 
 */

/**
 *
 * @author ttta
 */

public class GroupOfCards {

    //Sets the deck to have 13 cards.
    private final static int DECK_SIZE = 13;
    private Card[] cards = new Card[DECK_SIZE];
    private ArrayList<Card> cardDeck;

    //Assigning each card with a suit and rank
    public GroupOfCards() {
        int i = 0;
        for (Card.Value value : Card.Value.values()) {
            cards[i] = (new Card(value));
            i++;
        }
        //Instantiates the cards to the card deck and then Shuffles the deck.
        cardDeck = new ArrayList<>(Arrays.asList(cards));
        Collections.shuffle(cardDeck);
    }
    
    public Card get(int n) {
        return cardDeck.get(n);
    }
    
    //Overrides the toString method to return a string representation of the 
    //deck of cards.
    @Override
    public String toString() {
        return String.valueOf(cardDeck);
    }
    
    
}
    
