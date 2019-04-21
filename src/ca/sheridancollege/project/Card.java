/*
 * This project simulates a card matching game using a deck of cards. 
 */

/**
 *
 * @author ttta
 */
public class Card {
    public enum Value {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
    private Value value;

    public Card(Value value) {
        this.value = value;
    }
    

    public Value getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
